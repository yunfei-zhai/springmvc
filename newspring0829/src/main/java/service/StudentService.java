package service;

import java.util.List;

import model.Student;

public interface StudentService {
public List<Student> select(String txt);
public void delete(int id);
public void insert(Student s);
public void update(Student s);
public List<Student> selectById(int id);
}
