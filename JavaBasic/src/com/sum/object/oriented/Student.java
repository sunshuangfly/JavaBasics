package com.sum.object.oriented;
/**
 * 写一个写生描述类
 * 并创建一个类创建学生类对象调用其方法
 * @author 飞
 * @date 2017年9月25日
 */
public class Student {
	//属性,成员变量
	private String name;
	private int age;
	private String sex;
	private String address;
	
	//行为,成员方法
	//学习方法
	public void study() {
		System.out.println(name+"今年"+age+"岁了,"+"是一个"+sex+"孩子,"+"现在居住"+address);
	}
	
	//吃饭方法
	public void eat() {
		System.out.println("吃完饭好好休息一下");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
