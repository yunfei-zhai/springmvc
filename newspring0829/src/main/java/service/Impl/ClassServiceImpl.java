package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ClassDao;
import model.MyClass;
import service.ClassService;
@Service
public class ClassServiceImpl implements ClassService{
@Autowired
ClassDao classDao;
	public List<MyClass> select() {
		return classDao.select();
	}

}
