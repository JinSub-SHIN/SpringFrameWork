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
		
		// �����ϱ� ���� ���� ��ȣȭ�ؼ� ���
		String password = passwordEncoder.encode(member.getPassword());
		member.setPassword(password);
		
		result = memberDAO.insertMember(member);
		if(result==0) throw new RuntimeException("���Ե��� �ʾҽ��ϴ�");
		
		if(member.getUserType()==null) {
			throw new RuntimeException("userType������ ��� �����Դϴ�..");
		}
				
		result = authoritiesDAO.insertAuthority(new Authority(member.getId(), Constants.ROLE_USER));
		if(result==0) throw new RuntimeException("���Ե��� �ʾҽ��ϴ�");
		
		if(member.getUserType().equals("1")){
			result = authoritiesDAO.insertAuthority(new Authority(member.getId(), Constants.ROLE_ADMIN));
		}
		
		if(result==0) throw new RuntimeException("���Ե��� �ʾҽ��ϴ�");
				
		return result;
	}

}
