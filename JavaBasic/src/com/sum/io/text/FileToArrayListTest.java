package com.sum.io.text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ���ı��ļ��ж�ȡ���ݵ�ArrayList������,����������
 * ÿһ��������Ϊһ���ַ���Ԫ��
 * 
 * ����:
 * 		1,������������������
 * 		2,�������϶���
 * 		3,��ȡ����,ÿ�ζ�ȡһ������,��ÿһ��������Ϊһ��Ԫ�ش洢��������
 * 		4,�ͷ���Դ
 * 		5,��������
 * 
 * @date 2017��9��29��
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		//������������������
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo2.java"));
		//�������϶���
		ArrayList<String> array = new ArrayList<>();
		//��ȡ����,һ��һ��,��д�뼯��
		String line;
		while((line=br.readLine())!=null) {
			array.add(line);
		}
		//�ͷ���Դ
		br.close();
		//��������
		for (String string : array) {
			System.out.println(string);
		}
	}
}
