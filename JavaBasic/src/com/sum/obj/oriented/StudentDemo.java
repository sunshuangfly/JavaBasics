package com.sum.obj.oriented;
/**
 * ѧ����Ĳ�����
 * 
 * @author ��
 * @date 2017��9��25��
 */
public class StudentDemo {
	public static void main(String[] args) {
		//�޲�+set����
		Student s = new Student();
		s.setName("������");
		s.setAge(30);
		System.out.println(s.getName()+"----"+s.getAge());
		
		//���ι��췽��
		Student s1 = new Student("���޼�", 25);
		System.out.println(s1.getName()+"----"+s1.getAge());
	}
}
