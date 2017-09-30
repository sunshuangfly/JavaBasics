package com.sum.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ����: ����¼��3��ѧ����Ϣ(ѧ��,����,����,��ס��)���뼯��,Ȼ��������ϰ�ÿһ��ѧ����Ϣ�����ı��ļ�(ÿ��ѧ����ϢΪһ������,�Լ�����ָ���)
 * 
 * ����: 1,����ѧ���� 2,�������϶��� 3,д����ʵ�ּ���¼��ѧ����Ϣ,����ѧ��������ΪԪ����ӵ����� 4,�����������������
 * 5,��������,�õ�ÿһ��ѧ����Ϣ,����ѧ����Ϣ����һ����ʽд���ı��ļ� ����:0001,����,����
 * 
 * @date 2017��9��30��
 */
public class ArrayListToFileTest {
	public static void main(String[] args) throws IOException {
		// �������϶���
		ArrayList<Student> array = new ArrayList<>();
		
		//������ӷ���,�������ѧ����Ϣ
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		//�������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt",true));
		
		//�������ϻ�ȡѧ����Ϣ,����ѧ����Ϣ����һ����ʽд���ı��ļ�
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			//��ʽ:ѧ��,����,����,��ס��
			//ʹ��StringBuilderƴ��
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			
			//д���ı��ļ�
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		bw.close();

	}

	// ʵ�ּ���¼��ѧ����Ϣ
	public static void addStudent(ArrayList<Student> array) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ���ն���
		// ����ѭ��,��֤id�ظ������д���Է��ص���������idλ��
		String id;
		while (true) {
			System.out.println("������ѧ��id:");
			// �ж�¼���ѧ��id�Ƿ��ظ�
			// ������
			boolean flag = false;
			id = sc.nextLine();
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("�������id�Ѵ���,����������");
			} else {
				break;
			}
		}

		System.err.println("������ѧ������:");
		String name = sc.nextLine();
		System.out.println("������ѧ������");
		String age = sc.nextLine();
		System.out.println("������ѧ����ס��");
		String address = sc.nextLine();

		// ����ѧ������
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		// ��ѧ����ӵ�������
		array.add(s);
		//��ʾ
		System.err.println("���ѧ���ɹ�");
	}
}
