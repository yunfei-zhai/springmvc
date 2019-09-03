package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Student;

@Repository
public interface StudentDao {
@Select("select student.*,class.classname from student inner join class on student.classid=class.classid ${txt} ${limit}" )
public List<Student> select(@Param("txt")String txt,@Param("limit")String limit);

@Select("select count(1) from student inner join class on student.classid=class.classid ${txt}")
public int selectCount(@Param("txt")String txt);

@Delete("delete from student where id=#{id}")
public void delete(int id);

@Insert("insert into student(name,sex,classid) values(#{name},#{sex},#{classid})")
public void insert(Student s);

@Update ("update student set name=#{name},sex=#{sex},classid=#{classid} where id=#{id}")
public void update(Student s); 

@Select("select student.*,class.classname from student inner join class on student.classid=class.classid where student.id=#{id}" )
public List<Student> selectById(int id);
}
