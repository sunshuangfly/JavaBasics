package com.sum.obj.oriented;
/**
 * ��׼ѧ��������д�Ͳ���
 *��Ա����:name
 *		age
 *
 * @author ��
 * @date 2017��9��25��
 */
public class Student {
	//��Ա����
	private String name;
	private int age;
	
	//�޲ι��췽��
	public Student() {}
	
	//���ι��췽��
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//get,set����
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
