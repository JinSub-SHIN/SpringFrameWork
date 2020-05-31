package kosta.mvc.model.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kosta.mvc.model.domain.Authority;
import kosta.mvc.model.domain.Member;
import kosta.mvc.model.repository.AuthoritiesDAO;
import kosta.mvc.model.repository.MemberDAO;
import lombok.RequiredArgsConstructor;

/*
 *  사용자가 로그인 정보를 입력 한 후 로그인을 클릭했을때 인증처리를 해줄 Class
 */

@Service("provider")
@RequiredArgsConstructor
public class MemberAuthenticationProvider implements AuthenticationProvider {
	
		private final MemberDAO memberDAO;
		private final AuthoritiesDAO authoritiesDAO;
		private final PasswordEncoder passwordEncoder;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		System.out.println("오덴티케이트 호출");
		
		// 인수로 전달된 정보에서 id(name)을 꺼내서 DB에 있는 체크하고...
		String userId = authentication.getName();
		Member member = memberDAO.selectMemberById(userId);
		if(member==null) throw new UsernameNotFoundException("아이디가 존재 하지 않습니다");
		
		// 있다면 비밀번호 체크한다.
		if(!passwordEncoder.matches(authentication.getCredentials().toString(), member.getPassword())) {
			throw new UsernameNotFoundException("비밀번호 일치하지 않습니다");
		}
		
		// 모든 정보가 정확하면 인증된 사용자의 권한을 검색한다.
		List<Authority> list = authoritiesDAO.selectAuthorityByUserName(userId);
		
		if(list.isEmpty()) {
			throw new UsernameNotFoundException("권한에서 문제가 발생했습니다");
		}
		
		List<SimpleGrantedAuthority> authList = new ArrayList<SimpleGrantedAuthority>();
		for(Authority auth : list) {
			authList.add(new SimpleGrantedAuthority(auth.getRole()));
		}
		
		// 인증된 정보와 권한을 Authentication 에 담아서 리턴한다.
		return new UsernamePasswordAuthenticationToken(member, null, authList);
 		
	}

	
	/*
	 *  인수로 전달된 authentication 이 인증을 할 수 있는 유효한 객체인지를 판단하는 메소드
	 *  true 인 경우 authenticate 메소드가 호출된다...
	 */	
	@Override
	public boolean supports(Class<?> authentication) {
		
		System.out.println("서포트 호출");
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
