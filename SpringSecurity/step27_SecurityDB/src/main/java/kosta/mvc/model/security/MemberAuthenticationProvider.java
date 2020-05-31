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
 *  ����ڰ� �α��� ������ �Է� �� �� �α����� Ŭ�������� ����ó���� ���� Class
 */

@Service("provider")
@RequiredArgsConstructor
public class MemberAuthenticationProvider implements AuthenticationProvider {
	
		private final MemberDAO memberDAO;
		private final AuthoritiesDAO authoritiesDAO;
		private final PasswordEncoder passwordEncoder;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		System.out.println("����Ƽ����Ʈ ȣ��");
		
		// �μ��� ���޵� �������� id(name)�� ������ DB�� �ִ� üũ�ϰ�...
		String userId = authentication.getName();
		Member member = memberDAO.selectMemberById(userId);
		if(member==null) throw new UsernameNotFoundException("���̵� ���� ���� �ʽ��ϴ�");
		
		// �ִٸ� ��й�ȣ üũ�Ѵ�.
		if(!passwordEncoder.matches(authentication.getCredentials().toString(), member.getPassword())) {
			throw new UsernameNotFoundException("��й�ȣ ��ġ���� �ʽ��ϴ�");
		}
		
		// ��� ������ ��Ȯ�ϸ� ������ ������� ������ �˻��Ѵ�.
		List<Authority> list = authoritiesDAO.selectAuthorityByUserName(userId);
		
		if(list.isEmpty()) {
			throw new UsernameNotFoundException("���ѿ��� ������ �߻��߽��ϴ�");
		}
		
		List<SimpleGrantedAuthority> authList = new ArrayList<SimpleGrantedAuthority>();
		for(Authority auth : list) {
			authList.add(new SimpleGrantedAuthority(auth.getRole()));
		}
		
		// ������ ������ ������ Authentication �� ��Ƽ� �����Ѵ�.
		return new UsernamePasswordAuthenticationToken(member, null, authList);
 		
	}

	
	/*
	 *  �μ��� ���޵� authentication �� ������ �� �� �ִ� ��ȿ�� ��ü������ �Ǵ��ϴ� �޼ҵ�
	 *  true �� ��� authenticate �޼ҵ尡 ȣ��ȴ�...
	 */	
	@Override
	public boolean supports(Class<?> authentication) {
		
		System.out.println("����Ʈ ȣ��");
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
