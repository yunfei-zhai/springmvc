package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentDao;
import model.Student;
import service.StudentService;
@Service
public class StudentSerciceImpl implements StudentService{
@Autowired 
StudentDao studentDao;
	public List<Student> select(String txt) {
		return studentDao.select(txt);
	}

}
