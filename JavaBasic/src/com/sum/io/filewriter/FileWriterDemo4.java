package com.sum.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ���ʵ�����ݵĻ���? 
 * 		\n����ʵ�ֻ���,����windowϵͳ�Դ��ļ��±�ȴ��û�л���,��Ϊwindowʶ��Ļ��в���'\n',����'\r\n'
 * ����ϵͳʶ��Ļ���: window :\r\n 
 * 				 Linux :\n 
 * 				 mac: \r 
 * ���ʵ�����ݵ�׷��д��? public
 * FileWriter(String fileName,boolean append)
 * 		���ݸ������ļ����Լ�ָʾ�Ƿ񸽼�д�����ݵ� boolean ֵ������FileWriter���� 
 * ����:	fileName - һ���ַ�������ʾ��ϵͳ�йص��ļ����� 
 * 		append - һ�� boolean ֵ�����Ϊtrue��������д���ļ�ĩβ����������д���ļ���ʼ��
 * 
 * 
 * 
 * @date 2017��9��28��
 */
public class FileWriterDemo4 {
	public static void main(String[] args) throws IOException {
		// �������������,��������д�뵽�ļ�ĩβ��,����׷��
		FileWriter fw = new FileWriter("c.txt", true);//Ĭ����false,��׷��

		// ͨ��д����д����
		for (int x = 0; x < 10; x++) {
			fw.write("hello");
			// ͨ��\n����
			fw.write("\r\n");
		}

		// ˢ�»�����
		fw.flush();

		// �ر���Դ
		fw.close();
	}
}
