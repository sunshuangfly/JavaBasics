package com.sum.io.bufferedwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ�û�������ȡ�����ı��ļ�
 * ����Դ:
 * 		FileWriterDemo2.java -- FileReader -- ��Ч������BufferedReader
 * д����:
 * 		Copy.java -- FileWriter --������ BufferedWriter
 * 
 * @date 2017��9��28��
 */
public class BufferedStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo2.java"));
		
		//������������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		//��ȡ����
		//һ�ζ�ȡһ���ַ�
		/*int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
		}*/
		
		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			bw.write(chs,0,len);
		}
		
		bw.close();
		br.close();
	}
}
