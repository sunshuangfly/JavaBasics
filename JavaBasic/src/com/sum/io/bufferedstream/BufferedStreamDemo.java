package com.sum.io.bufferedstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �����������⹦��: BufferedWriter void newLine():дһ�����з�,������з���ϵͳ���� BufferedReader
 * String readLine():һ�ζ�ȡһ������,���ǲ���ȡ���з�
 * 
 * @date 2017��9��29��
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		for (int x = 0; x < 10; x++) {
			bw.write("hello");
			// ����
			// bw.write("\r\n");
			bw.newLine();
			// ˢ�»�����
			bw.flush();
		}
		// �ͷ���Դ
		bw.close();
		
		//������������������
		BufferedReader br = new BufferedReader(new FileReader("br.txt"));
		/*//һ�ζ�ȡһ��
		String line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		//���Ͽɼ�,readLineһ�ζ�ȡһ������,���û������,����null
*/		//��ѭ���Ľ�
		String line;
		while((line=br.readLine())!=null) {
			System.out.print(line);
			
		}
		br.close();
	}
}
