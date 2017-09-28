package com.sum.io.filereader;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader��ȡ����һ��һ���ַ�����
 * 
 * @date 2017��9��28��
 */
public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		//��������������
		//FileReader fr = new FileReader("fr.txt");
		FileReader fr = new FileReader("FileWriterDemo2.java");
		
		//��������������Ķ�ȡ���ݷ���
		//int read(char[] chuf):һ�ζ�ȡһ���ַ����������
	/*	//��һ�ζ�ȡ
		char[] ch = new char[5];
		int len = fr.read(ch);
		System.out.println(new String(ch));
		
		//�ڶ��ζ�ȡ
		len = fr.read(ch); //����\r\nҲ�������ַ�,Ҳ�����˶�ȡ
		System.out.println(new String(ch));
		
		//�����ζ�ȡ
		len = fr.read(ch);
		System.out.println(new String(ch));*/
		
		//ʹ��ѭ���Ľ�
		//char[] chs = new char[5]; //һ����˵���鳤��д��1024����������
		char[] chs = new char[1024];
		int len;
		//��������
		//1,fr.read(chs) ��ȡ����
		//2,len = fr.read(chs)���ݸ�ֵ��len
		//3,len!=-1
		while((len = fr.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		//�ͷ���Դ
		fr.close();
	}
}
