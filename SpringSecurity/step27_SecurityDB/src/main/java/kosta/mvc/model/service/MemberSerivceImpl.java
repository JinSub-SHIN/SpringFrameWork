package kosta.mvc.model.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kosta.mvc.model.domain.Authority;
import kosta.mvc.model.domain.Member;
import kosta.mvc.model.repository.AuthoritiesDAO;
import kosta.mvc.model.repository.MemberDAO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberSerivceImpl implements MemberService {
	
	private final MemberDAO memberDAO;
	private final AuthoritiesDAO authoritiesDAO;
	private final PasswordEncoder passwordEncoder;
	
	@Transactional
	@Override
	public int joinMember(Member member) {
		
		int result = 0;
		
		// 가입하기 전에 평문을 암호화해서 등록
		String password = passwordEncoder.encode(member.getPassword());
		member.setPassword(password);
		
		result = memberDAO.insertMember(member);
		if(result==0) throw new RuntimeException("가입되지 않았습니다");
		
		if(member.getUserType()==null) {
			throw new RuntimeException("userType오류로 등록 실패입니다..");
		}
				
		result = authoritiesDAO.insertAuthority(new Authority(member.getId(), Constants.ROLE_USER));
		if(result==0) throw new RuntimeException("가입되지 않았습니다");
		
		if(member.getUserType().equals("1")){
			result = authoritiesDAO.insertAuthority(new Authority(member.getId(), Constants.ROLE_ADMIN));
		}
		
		if(result==0) throw new RuntimeException("가입되지 않았습니다");
				
		return result;
	}

}
