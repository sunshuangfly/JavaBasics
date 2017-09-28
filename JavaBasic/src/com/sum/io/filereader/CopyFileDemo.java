package com.sum.io.filereader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ����Ŀ·���µ�FileWriterDemo2.java�ļ���ȡ���ٸ��Ƶ�cofy.java
 * 
 * �ļ����ƹ��� ����Դ: FileWriterDemo2.java -- ������ --FileReader
 * 
 * Ŀ�ĵ�: Copy.java --д���� -- FileWriter
 * 
 * @date 2017��9��28��
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// ��������������
		FileReader fr = new FileReader("FileWriterDemo2.java");
		// �������������
		FileWriter fw = new FileWriter("Copy.java");
		// ��д����
		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		// �ͷ���Դ
		fw.close();
		fr.close();
	}
}
