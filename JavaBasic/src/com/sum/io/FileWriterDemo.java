package com.sum.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter�����,���ļ���д����
 * 
 * ���췽�� FileWriter(String fileName):����һ���ļ�����
 * @date 2017��9��27��
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//�������������
		FileWriter fw = new FileWriter("e:\\a.txt");
		/**
		 * �������������������Щ����:
		 * 		1,����ϵͳ��Դ������һ���ļ�
		 * 		2,�������������
		 * 		3,�����������ָ������ļ�
		 */
		//���������д���ݵķ���
		fw.write("io�����");
		//�ļ�����д���ڴ滺����,��Ҫˢ�»�����
		fw.flush();
		
		//�ͷ���Դ
		fw.close();
		//������ͷ���Դ����ô��,дһ����ѭ��,Ȼ�����г����ɾ��a.txt�ļ�,�޷�ɾ��
		//while(true){}
	}
}
