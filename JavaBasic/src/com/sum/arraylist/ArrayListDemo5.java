package com.sum.arraylist;

import java.util.ArrayList;

/**
 * �洢�Զ�����󲢱���
 * ѧ����
 * 
 * @date 2017��9��26��
 */
public class ArrayListDemo5 {
	public static void main(String[] args) {
		//��������
		ArrayList<Student> array = new ArrayList<Student>();
		
		//����ѧ������
		Student s1 = new Student("����",20);
		Student s2 = new Student("����",22);
		Student s3 = new Student("����",30);
		Student s4 = new Student("����",25);
		
		//�Ѷ�����ӵ�������
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		//��������
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
}
