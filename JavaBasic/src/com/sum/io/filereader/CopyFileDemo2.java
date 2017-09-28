package com.sum.io.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ����Ŀ·���µ�FileWriterDemo2.java�ļ���ȡ���ٸ��Ƶ�cofy.java
 * 
 * ����Դ:FileWriterDemo2.java
 * 		ʹ��FileReader��ȡ
 * Ŀ�ĵ�:Copy.java
 * 		ʹ��FileWriterд����
 * @date 2017��9��28��
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		//��������������
		FileReader fr = new FileReader("FileWriterDemo2.java");
		//�������������
		FileWriter fw = new FileWriter("Copy.java");
		
		//��д����
		int len;
		char[] chs = new char[1024];
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
		}
		fw.close();
		fr.close();
	}
}
