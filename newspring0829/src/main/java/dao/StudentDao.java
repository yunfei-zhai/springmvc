package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import model.Student;

@Repository
public interface StudentDao {
@Select("select student.*,class.classname classname from student inner join class on student.classid=class.classid ${txt}" )
public List<Student> select(@Param("txt")String txt);
}
