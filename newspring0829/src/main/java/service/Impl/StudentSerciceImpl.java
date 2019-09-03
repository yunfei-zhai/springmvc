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
	public List<Student> select(String txt,String limit) {
		return studentDao.select(txt, limit);
	}
	public void delete(int id) {
		studentDao.delete(id);
	}
	public void insert(Student s) {
		studentDao.insert(s);
	}
	public void update(Student s) {
		studentDao.update(s);
		
	}
	public List<Student> selectById(int id) {
		return studentDao.selectById(id);
	}
	public int selectCount(String txt) {
		return studentDao.selectCount(txt);
	}

}
