package com.sum.arraylist.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.arraylist.manager.Student;

/**
 * ѧ������ϵͳ
 * ���ʹ��io�������ݴ洢���ı��ļ���
 * 
 * ����:  1,����ѧ���� 
 * 		 2,ѧ������ϵͳ������Ĵ����д 
 * 		 3,ѧ������ϵͳ�鿴����ѧ���Ĵ����д 
 * 		 4,ѧ������ϵͳ�����ѧ���Ĵ����д
 *		 5,ѧ������ϵͳ��ɾ��ѧ���Ĵ����д
		 6,ѧ������ϵͳ���޸�ѧ���Ĵ����д
 * 
 * @date 2017��9��27��
 */
public class StudentManagerIO {
	public static void main(String[] args) throws IOException {
		//�����ļ�·��
		String fileName = "students.txt";
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
				findStudent(fileName);
				break;
			case 2:
				// ���ѧ��
				addStudent(fileName);
				break;
			case 3:
				// ɾ��ѧ��
				removeStudent(fileName);
				break;
			case 4:
				// �޸�ѧ��
				updateStudent(fileName);
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
	
	//���ļ��ж�ȡ���ݵ�����
	public static void readData(String fileName,ArrayList<Student> array) throws IOException {
		//��������������
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		while((line=br.readLine())!=null) {
			String[] datas = line.split(",");
			Student s = new Student();
			s.setId(datas[0]);
			s.setName(datas[1]);
			s.setAge(datas[2]);
			s.setAddress(datas[3]);
			array.add(s);
		}
		br.close();
	}
	
	//�Ѽ����е�����д�뵽�ļ���
	public static void writerData(String fileName,ArrayList<Student> array) throws IOException {
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	// �޸�ѧ����Ϣ
		private static void updateStudent(String fileName) throws IOException {
			//�������϶���
			ArrayList<Student> array = new ArrayList<Student>();
			//���ļ������ݶ�ȡ���뵽������
			readData(fileName, array);
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
				//�Ѽ����е���������д���ļ���
				writerData(fileName, array);
				System.out.println("ѧ����Ϣ�޸ĳɹ�!");
			}

		}

		// ɾ��ѧ����Ϣ
		private static void removeStudent(String fileName) throws IOException {
			//�������϶���
			ArrayList<Student> array = new ArrayList<Student>();
			//���ļ������ݶ�ȡ���뵽������
			readData(fileName, array);
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
				//�Ѽ����е���������д���ļ���
				writerData(fileName, array);
				System.out.println("ɾ��ѧ����Ϣ�ɹ�!");
			}

		}

		// ���ѧ����Ϣ����
		private static void addStudent(String fileName) throws IOException {
			//�������϶���
			ArrayList<Student> array = new ArrayList<Student>();
			//���ļ������ݶ�ȡ���뵽������
			readData(fileName, array);
			
			// ����¼��ѧ����Ϣ
			Scanner sc = new Scanner(System.in);
			// �������ݲ����뼯��

			// Ϊ��ʹѧ���ظ��жϳ�����ص�����ѧ��λ��,����ѭ��
			String id;
			while (true) {
				System.out.println("������ѧ��Id:");// id�����ظ�,����Ҫ�����ж�
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

			System.out.println("������ѧ������:");
			String name = sc.nextLine();
			System.out.println("������ѧ������:");
			String age = sc.nextLine();
			System.out.println("������ѧ����ס��:");
			String address = sc.nextLine();
			// ��¼�����Ϣ��ӵ�ѧ��������
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			// ��ѧ��������ӵ�������
			array.add(s);
			//�Ѽ����е���������д���ļ���
			writerData(fileName, array);
			
			System.out.println("���ѧ����Ϣ�ɹ�!");

		}

		// ��ѯ����ѧ����Ϣ����
		private static void findStudent(String fileName) throws IOException {
			//�������϶���
			ArrayList<Student> array = new ArrayList<Student>();
			//���ļ������ݶ�ȡ���뵽������
			readData(fileName, array);
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
