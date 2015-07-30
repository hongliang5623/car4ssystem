package cn.pdsu.bs.dao;

import cn.pdsu.bs.domain.User;

public interface IUserDao {

	public abstract boolean checkU(User u);

	public abstract User findU(User u);

}