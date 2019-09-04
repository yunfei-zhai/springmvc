package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import model.User;
import service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
UserDao userDao;

public User select(User u) {
	return userDao.select(u);
}
	
}
