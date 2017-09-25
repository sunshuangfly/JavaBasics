package com.sum.obj.oriented;
/**
 * 标准学生类代码编写和测试
 *成员变量:name
 *		age
 *
 * @author 飞
 * @date 2017年9月25日
 */
public class Student {
	//成员变量
	private String name;
	private int age;
	
	//无参构造方法
	public Student() {}
	
	//带参构造方法
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//get,set方法
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
