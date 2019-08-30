package dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import model.MyClass;

@Repository
public interface ClassDao {
@Select("select * from class")
public List<MyClass> select();
}
