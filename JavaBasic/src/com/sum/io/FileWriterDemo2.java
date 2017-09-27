package com.sum.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * �����д���ݲ���:
 * 		1,�������������
 * 		2,��������������д���ݷ���,��ˢ�»�����
 * 		3,�ͷ���Դ
 * 
 * close()��flush()����
 * 		flush():ˢ�»�����.  ��������Լ���ʹ��
 * 		close():��ˢ�»�����,��֪ͨϵͳ�ͷ���Դ. �رպ�,�����󽫲��ܹ��ڽ���ʹ��!
 * @date 2017��9��27��
 */
public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		//�������������
		//FileWriter fw = new FileWriter("e:\\a.txt"); //����·��,����ڴ���
		FileWriter fw = new FileWriter("a.txt"); //���·��,����ڵ�ǰ��Ŀ,����Ŀ�ĸ�Ŀ¼��
		
		//����д���ݷ���
		fw.write("hello java");
		
		//fw.flush(); //����û��ˢ�»�����Ҳ������ʾ����
		
		//�ر���Դ
		fw.close(); //close�ٹر���ԴǰҲ��ȥ�����������Դ,�Զ�ˢ��
	}
}
