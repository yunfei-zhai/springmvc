package model;

import javax.management.loading.PrivateClassLoader;

public class Student{
private int id;
private String name;
private int sex;
private int classid;
private String classname; 

public static String[] sexs= {"Î´Öª","ÄÐ","Å®"};
public String getSexsname() {
	return sexs[sex];
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}
public int getClassid() {
	return classid;
}
public void setClassid(int classid) {
	this.classid = classid;
}
public String getClassname() {
	return classname;
}

public void setClassname(String classname) {
	this.classname = classname;
}
}
