package com.sum.arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ����һ������,�洢ѧ������,ѧ����������������ڼ���¼��,����������
 * 
 * ע��:Ϊ�˷���ʵ��,���ǰ�ѧ�����е����г�Ա����ΪString����
 * 
 * ����:
 * 		����ѧ����
 * 		�������϶���
 * 		����¼������,����ѧ������,�Ѽ���¼������ݸ��Ƹ�ѧ������ĳ�Ա����
 * 		��ѧ��������ΪԪ�ش洢��������
 * 		��������
 * 
 * ��ֵ���ã���ֵ�����д��ݵĲ���Ϊ�����������ͣ�������Ϊ�βΡ�
 * �����õ��ã������õ����У�������ݵĲ����������������ͣ�������Ϊʵ�Ρ�
 * 		�ڵ��õĹ����У���ʵ�εĵ�ַ���ݸ����βΣ��β��ϵĸı䶼������ʵ����
 * @date 2017��9��27��
 */
public class StudentDemo {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<Student> array = new ArrayList<Student>();
		
		/*//����¼������,����ѧ������,�Ѽ���¼������ݸ��Ƹ�ѧ������ĳ�Ա����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ������:");
		String name = sc.nextLine();
		System.out.println("������ѧ������:");
		String age = sc.nextLine();
		
		//����ѧ������
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		//�� ѧ������洢��������
		array.add(s);*/
		//Ϊ�˷����ظ�����¼������,���ǰ����沽���װ�ɷ���ʵ���ظ�ʹ��
		//�������ѧ�����󷽷�
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		//��������
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).getName()+":"+array.get(i).getAge());
		}
	}
	
	/**
	 * ����¼�����ѧ�����󷽷�
	 * ������ȷ
	 * 		�����б�:ArrayList array
	 * 		����ֵ����:void  (��Ϊ����Ϊ������������,�����βεĸı�ֱ��Ӱ��ʵ��)
	 */
	public static void addStudent(ArrayList<Student> array) {
		//����¼������,����ѧ������,�Ѽ���¼������ݸ��Ƹ�ѧ������ĳ�Ա����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ������:");
		String name = sc.nextLine();
		System.out.println("������ѧ������:");
		String age = sc.nextLine();
		
		//����ѧ������
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		//�� ѧ������洢��������
		array.add(s);
	}
	
}
