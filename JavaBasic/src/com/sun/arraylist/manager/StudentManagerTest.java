package com.sun.arraylist.manager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ѧ������ϵͳ
 * 
 * ����: 1,����ѧ���� 2,ѧ������ϵͳ������Ĵ����д 3,ѧ������ϵͳ�鿴����ѧ���Ĵ����д 4,ѧ������ϵͳ�����ѧ���Ĵ����д
 * 5,ѧ������ϵͳ��ɾ��ѧ���Ĵ����д 6,ѧ������ϵͳ���޸�ѧ���Ĵ����д
 * 
 * @date 2017��9��27��
 */
public class StudentManagerTest {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		while (true) {
			System.out.println("------��ӭ����ѧ������ϵͳ------");
			System.out.println("1,�鿴ѧ����Ϣ");
			System.out.println("2,���ѧ����Ϣ");
			System.out.println("3,ɾ��ѧ����Ϣ");
			System.out.println("4,�޸�ѧ����Ϣ");
			System.out.println("5,�˳�ϵͳ");

			// ����¼��ѡ����
			Scanner sc = new Scanner(System.in);
			System.out.println("��ѡ����Ҫ���еĲ���:");
			// ����¼������
			int number = sc.nextInt();
			switch (number) {
			case 1:
				// �鿴ѧ��
				findStudent(array);
				break;
			case 2:
				// ���ѧ��
				addStudent(array);
				break;
			case 3:
				// ɾ��ѧ��
				removeStudent(array);
				break;
			case 4:
				// �޸�ѧ��
				updateStudent(array);
				break;
			case 5:
				// �˳�ϵͳ
				System.out.println("лл�ټ�!");
				System.exit(0); // jvm�˳�
				break;

			default:
				System.out.println("�����������,������ѡ�����");
				break;
			}
		}
	}

	// �޸�ѧ����Ϣ
	private static void updateStudent(ArrayList<Student> array) {
		// ����¼��Ҫ�޸ĵ�ѧ����Ϣid
		System.out.println("��������Ҫ�޸ĵ�ѧ����Ϣid");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		// ��������
		int index = -1;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (id.equals(s.getId())) {
				index = i;
			}
		}
		if (index == -1) { // ˵�������id������
			System.out.println("�����޸ĵ�ѧ����Ϣ������,�����½���ѡ��");
		} else {
			System.out.println("�������µ�ѧ������:");
			String name = sc.nextLine();
			System.out.println("�������µ�ѧ������:");
			String age = sc.nextLine();
			System.out.println("�������µ�ѧ����ס��:");
			String address = sc.nextLine();

			// ����ѧ������
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			// �޸ļ�����ѧ������
			array.set(index, s);
			System.out.println("ѧ����Ϣ�޸ĳɹ�!");
		}

	}

	// ɾ��ѧ����Ϣ
	private static void removeStudent(ArrayList<Student> array) {
		// ����¼��Ҫɾ��ѧ����Ϣ��id
		System.out.println("��������Ҫɾ����ѧ��id");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		// ����һ������
		int index = -1;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (id.equals(s.getId())) {
				index = i;
			}
		}

		if (index == -1) {
			System.out.println("��Ҫɾ����ѧ��id������,�����½���ѡ��");
		} else {
			array.remove(index);
			System.out.println("ɾ��ѧ����Ϣ�ɹ�!");
		}

		/*
		 * //������ȡѧ��id,�����¼��id�Ƚ��ж� for (int i = 0; i < array.size(); i++) {
		 * Student s = array.get(i); if(id.equals(s.getId())) {
		 * //�����жϲ�ȫ��,�����ڿ��������ѧ�Ų����� array.remove(i); break; } }
		 * System.out.println("ɾ��ѧ����Ϣ�ɹ�!");
		 */
	}

	// ���ѧ����Ϣ����
	private static void addStudent(ArrayList<Student> array) {
		// ����¼��ѧ����Ϣ
		Scanner sc = new Scanner(System.in);
		// �������ݲ����뼯��

		// Ϊ��ʹѧ���ظ��жϳ�����ص�����ѧ��λ��,����ѭ��
		String id;
		while (true) {
			System.out.println("�����ѧ��Id:");// id�����ظ�,����Ҫ�����ж�
			id = sc.nextLine();

			// ����һ��booleanֵ��Ϊ���
			boolean flag = false;
			// ѭ��ȡ��id�������id���бȽ�
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					flag = true;
					break;
				}
			}

			// �жϱ��
			if (flag) {
				System.out.println("�������ѧ���Ѵ���,����������");
			} else {
				break;
			}
		}

		System.out.println("�����ѧ������:");
		String name = sc.nextLine();
		System.out.println("�����ѧ������:");
		String age = sc.nextLine();
		System.out.println("�����ѧ����ס��:");
		String address = sc.nextLine();
		// ��¼�����Ϣ��ӵ�ѧ��������
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		// ��ѧ��������ӵ�������
		array.add(s);
		System.out.println("���ѧ����Ϣ�ɹ�!");

		/*
		 * //����ѧ������ Student s = new Student(); //����¼��ѧ����Ϣ Scanner sc = new
		 * Scanner(System.in); //�������ݲ����뼯��
		 * System.out.println("�����ѧ��Id:");//id�����ظ�,����Ҫ�����ж� String id =
		 * sc.nextLine(); System.out.println("�����ѧ������:"); String name =
		 * sc.nextLine(); System.out.println("�����ѧ������:"); String age =
		 * sc.nextLine(); System.out.println("�����ѧ����ס��:"); String address =
		 * sc.nextLine(); //��¼�����Ϣ��ӵ�ѧ�������� s.setId(id); s.setName(name);
		 * s.setAge(age); s.setAddress(address); //��ѧ��������ӵ������� array.add(s);
		 */

	}

	// ��ѯ����ѧ����Ϣ����
	private static void findStudent(ArrayList<Student> array) {
		// �жϼ������Ƿ���ѧ����Ϣ����,���������ֱ�ӷ���
		if (array.size() == 0) {
			System.out.println("û���κ�ѧ����Ϣ,���������Ĳ���!");
			return;
		}
		// �������ϻ�ȡ����ѧ����Ϣ����ӡ
		System.out.println("ѧ��\t����\t����\t��ס��");
		for (int i = 0; i < array.size(); i++) {

			Student s = array.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
		}
	}
}
