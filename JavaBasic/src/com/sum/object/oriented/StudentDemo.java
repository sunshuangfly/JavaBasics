package com.sum.object.oriented;

public class StudentDemo {
	public static void main(String[] args) {
		//创建学生对象
		Student student = new Student();
		//给学生对象属性赋值
		student.setName("小明");
		student.setSex("男");
		student.setAge(15);
		student.setAddress("北京");
		//调用学习方法
		student.study();
	}
}
