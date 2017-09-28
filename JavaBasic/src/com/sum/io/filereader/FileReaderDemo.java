package com.sum.io.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ���ļ��ж�ȡ���ݲ���ʾ������̨
 * 		������ -- ������ -- FileReader
 * 
 * ���췽��:
 * 		FileReader(String fileName) :�����ļ�����
 * ��������ȡ�ļ�����
 * 		1,�������������
 * 		2,���������������ȡ���ݷ���
 * 		3,�ͷ���Դ
 * 
 * @date 2017��9��28��
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//��������������
		//FileReader fr = new FileReader("d.txt");
		FileReader fr = new FileReader("FileWriterDemo2.java");
		
		/*//��������������Ķ�ȡ���ݷ���
		//int read():һ�ζ�ȡһ���ַ�
		//��һ�ζ�ȡ����
		int ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		//��һ�ζ�ȡ����
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		//��һ�ζ�ȡ����
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		//��һ�ζ�ȡ����
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);*/
		
		//���������ظ����ܸ�,����ѭ���ĸĽ�,���ǲ�֪��ѭ���Ľ���������ʲô
		//����м��ζ�ȡ����,����ȡû�����ݺ�᷵��-1,���Ե����ؽ��Ϊ-1ʱ����ѭ��
		int ch;
		while((ch=fr.read())!=-1) {
			//System.out.println(ch);
			System.out.print((char)ch);
		}
		//�ͷ���Դ
		fr.close();
	}
}
