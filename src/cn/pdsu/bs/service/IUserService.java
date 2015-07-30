package cn.pdsu.bs.service;

import cn.pdsu.bs.domain.User;

public interface IUserService {

	public abstract boolean checkUser(User u);

	public abstract User findByUserName(User u);

}