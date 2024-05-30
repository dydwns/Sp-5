package spring;

import java.time.LocalDateTime;

public class MemberRegisterService {
	private MemberDao meberDao;
	
	public MemberRegisterService(MemberDao memberDao) {
		this.meberDao = memberDao;
	}
	public Long regist(RegisterRequest req) {
	Member member = memberDao.selectByEmail(req.getEmail());
	if(member != null) {
		throw new DuplicateMemberException("dup email"+req.getEmail());
		
	}
	Member newMember = new Member()req.getEmail(), req.getPassword(), req.getName(),
			LocalDateTime.now());
			memberDao.insert(newMember);
			return newMember.getId();
	}
}
