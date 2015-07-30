package cn.pdsu.bs.serviceImpl;

import cn.pdsu.bs.dao.IUserDao;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IUserService;

public class UserServiceImpl implements IUserService {
	private IUserDao dao;
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IUserService#checkUser(cn.pdsu.bs.domain.User)
	 */
	public boolean checkUser(User u){
		
		return dao.checkU(u);
		
	}
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IUserService#findByUserName(cn.pdsu.bs.domain.User)
	 */
	public User findByUserName(User u){
		
		return 	dao.findU(u);
		
	}

}
