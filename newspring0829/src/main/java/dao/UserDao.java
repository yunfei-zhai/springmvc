package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public interface UserDao {
@Select("select *from user where name=#{name} and pass=#{pass} ")
public User select(User u);

@Delete("delete from user where id=#{id}")
public void delete(int id);
@Insert("insert into user(name),(pass) values(#{name},#{pass})")
public void insert(User s);
@Update ("update user set name=#{name},pass=#{pass} where id=#{id}")
public void update(User s);
@Select("select * from user where user.id=#{id}")
public List<User> selectById(int id);
}
