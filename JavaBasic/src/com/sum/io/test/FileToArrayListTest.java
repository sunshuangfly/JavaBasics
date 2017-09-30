package com.sum.io.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ����һ����ı��ļ��е�ѧ����Ϣ��ȡ���������뼯��,Ȼ���������,�ڿ���̨���
 * 
 * ����: 1,����ѧ���� 2,������������������ 3,�������϶���
 * 4,��ȡ�ı�����,�������ݰ���һ����ʽ�ָֵ��ѧ������,Ȼ���ѧ��������ΪԪ�ش洢������ 5,�ͷ���Դ 6,��������
 * 
 * @date 2017��9��30��
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		// ������������������
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));

		// �������϶���
		ArrayList<Student> array = new ArrayList<>();

		// ��ȡ�ļ���Ϣ,���ݰ��ո�ʽ�ָ��ֵ��ѧ������,��ѧ��������ΪԪ�ش��뼯��
		String line;
		while ((line = br.readLine()) != null) {
			// ��","�ָ��ȡ��������,�õ�һ������
			String[] strings = line.split(",");
			// ����ѧ������
			Student s = new Student();
			s.setId(strings[0]);
			s.setName(strings[1]);
			s.setAge(strings[2]);
			s.setAddress(strings[3]);
			// ��ѧ��������뼯��
			array.add(s);
		}
		// �ͷ���Դ
		br.close();

		// ��������
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
		}
	}
}
