package com.sum.object.oriented;
/**
 * дһ��д��������
 * ������һ���ഴ��ѧ�����������䷽��
 * @author ��
 * @date 2017��9��25��
 */
public class Student {
	//����,��Ա����
	private String name;
	private int age;
	private String sex;
	private String address;
	
	//��Ϊ,��Ա����
	//ѧϰ����
	public void study() {
		System.out.println(name+"����"+age+"����,"+"��һ��"+sex+"����,"+"���ھ�ס"+address);
	}
	
	//�Է�����
	public void eat() {
		System.out.println("���극�ú���Ϣһ��");
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
