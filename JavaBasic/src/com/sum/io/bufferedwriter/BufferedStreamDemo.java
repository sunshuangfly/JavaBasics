package com.sum.io.bufferedwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter:���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд��
 * BufferedReader:���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ
 * 
 * 
 * @date 2017��9��28��
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		/*//�����������������
		//���췽�� BufferedWriter(Writer out)
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		//д����
		bw.write("hello");
		//ˢ�»�����
		bw.flush();
		//�ͷ���Դ
		bw.close();*/
		
		//�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo2.java"));
		
		/*//һ�ζ�дһ���ַ�
		int ch;
		while((ch=br.read())!=-1) {
			System.out.print((char)ch);
		}
		br.close();*/
		
		//һ�ζ�дһ���ַ�����
		int len;
		char[] chs = new char[1024];
		while((len=br.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		br.close();
	}
}
