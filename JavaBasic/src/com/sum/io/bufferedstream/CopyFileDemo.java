package com.sum.io.bufferedstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ�û��������⹦�ܸ����ı��ļ�
 * 
 * @date 2017��9��29��
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//������������������
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo2.java"));
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		//��ȡд������
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		bw.close();
		br.close();
	}
}
