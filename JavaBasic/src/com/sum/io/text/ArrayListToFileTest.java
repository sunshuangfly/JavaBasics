package com.sum.io.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ��ArrayList�����ܵ��ַ������ݴ洢���ı��ļ���
 * ÿһ���ַ���Ԫ����Ϊ�ļ���һ������
 * 
 * ����:
 * 		1,�������϶���
 * 		2,�򼯺϶���������ַ���Ԫ��
 * 		3,��������������
 * 		4,��������,�õ�ÿһ��Ԫ��,���Ѹ��ַ���Ԫ����Ϊ����д���ı��ļ�
 * 		5,�ͷ���Դ
 * 
 * @date 2017��9��29��
 */
public class ArrayListToFileTest {
	public static void main(String[] args) throws IOException {
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		//�򼯺������Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("iso");
		
		//��������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		//��������
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
		bw.close();
	}
}
