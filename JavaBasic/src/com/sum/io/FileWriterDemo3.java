package com.sum.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter�����д���ݷ���
 * 		public void write(char[] cbuf,int off,int len)
 * 			:д���ַ������ĳһ����
 * 			������
				cbuf - �ַ�������
				off - ��ʼд���ַ�����ƫ����
				len - Ҫд����ַ���		
 * 		public void write(int c) 
 * 			:д�뵥���ַ�
 * 			������c - ָ��Ҫд���ַ��� int��
 * 		public void write(String str, int off,int len)
 * 			д���ַ�����ĳһ���֡�
 * 			������
 * 				str - �ַ���
 *				off - ��ʼд���ַ�����ƫ����
 * 				len - Ҫд����ַ���
 * 		public void write(char[] cbuf)
			д���ַ�����
			����:cbuf - Ҫд����ַ�����
		public void write(String str)
			д���ַ���
			����:str - Ҫд����ַ���
 * @date 2017��9��27��
 */
public class FileWriterDemo3 {
	public static void main(String[] args) throws IOException {
		//�������������
		FileWriter fw = new FileWriter("b.txt");
		
		//public void write(String str)
		//fw.write("���IO��"); //дһ���ַ�������
		
		//public void write(String str, int off,int len)
		//fw.write("���IO��", 0, 3); //����������Χд�ַ�����һ����
		
		//public void write(int c)
		//fw.write(98); //д�뵥���ַ�
		//fw.write('b');
		
		//public void write(char[] cbuf)
		char[] chs = {'a','b','c','d','e'};
		//fw.write(chs); //д��һ���ַ�����
		
		//public void write(char[] cbuf,int off,int len)
		fw.write(chs, 0, 3); //��������д�ַ������һ����
		
		//ˢ�»�����
		fw.flush();
		
		//�ͷ���Դ
		fw.close();
	}
}
