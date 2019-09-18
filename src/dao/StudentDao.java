package dao;

import java.util.List;

import bean.Student;
import util.DBUtils;

public class StudentDao {
	
	public int register(String username,String password,String sex) {
		String[] args= new String[]{username,password,sex};
		return DBUtils.update("insert into student(name,password,sex) values(?,?,?)", args);
		
	}
	
	public Student findById(String id) {
		String[] args= new String[]{id};
		List<Student> list = DBUtils.getall("select * from student where id=?",new Student(), args);
		return list.get(0);
		
	}

	
	public Student login(String username,String password) {
		String[] args= new String[]{username,password};
		List<Student> list = DBUtils.getall("select * from student where name=? and password = ?", new Student(),args);
		Student student = list.get(0);
		System.out.println("student="+student);
		
		return student;
		
	}

	
	public List<Student> listAll() {
		String[] args= new String[]{};
		List<Student> list = DBUtils.getall("select id,name,sex from student", new Student(),args);
		
		
		return list;
		
	}
	
	public int deleteById(String id) {
		String[] args= new String[]{id};
		return DBUtils.update("delete from student where id=?", args);
		
	}
	
	public int updateById(String name,String password,String sex,String id) {
		String[] args= new String[]{name,password,sex,id};
		return DBUtils.update("update student set name=?,password=?,sex=? where id=?", args);
		
	}
	
	
	
}
