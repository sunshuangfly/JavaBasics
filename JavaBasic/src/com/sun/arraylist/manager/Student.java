package com.sun.arraylist.manager;
/**
 * 学生类
 * 属性 
 * 		学号
 * 		姓名
 * 		年龄
 * 		居住地
 * 
 * @date 2017年9月27日
 */
public class Student {
	private String id;
	private String name;
	private String age;
	private String address;
	
	public Student() {
	}

	public Student(String id, String name, String age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
