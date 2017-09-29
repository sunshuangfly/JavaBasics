package com.sum.io.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ��ϰ��ֵ�ı��ļ�(5�з�ʽ)
 * 
 * ����Դ:FileWriterDemo2.java
 * 
 * Ŀ�ĵ�:Copy.java
 * 
 * @date 2017��9��29��
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		/*method1("FileWriterDemo2.java","Copy.java");
		method2("FileWriterDemo2.java","Copy.java");
		method3("FileWriterDemo2.java","Copy.java");
		method4("FileWriterDemo2.java","Copy.java");
		method5("FileWriterDemo2.java","Copy.java");*/
		
		//���Ϸ����Ľ�
		String srcFileName = "FileWriterDemo2.java";
		String destFileNmae = "Copy.java";
		
		method1(srcFileName,destFileNmae);
		method2(srcFileName,destFileNmae);
		method3(srcFileName,destFileNmae);
		method4(srcFileName,destFileNmae);
		method5(srcFileName,destFileNmae);
		
	}
	
	//һ�ζ�ȡһ���ַ�
	private static void method1(String srcFileName, String destFileNmae) throws IOException {
		//��������������
		FileReader fr = new FileReader(srcFileName);
		//�������������
		FileWriter fw = new FileWriter(destFileNmae);
		//�����ַ�����
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
			fw.flush();
		}
		fw.close();
		fr.close();
		
	}

	//һ�ζ�ȡһ���ֽ�����
	private static void method2(String srcFileName, String destFileNmae) throws IOException {
		//��������������
		FileReader fr = new FileReader(srcFileName);
		//�������������
		FileWriter fw = new FileWriter(destFileNmae);
		//�����ַ�����
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		fw.close();
		fr.close();
		
	}

	//������һ�ζ�дһ���ַ�
	private static void method3(String srcFileName, String destFileNmae) throws IOException {
		//��������������
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileNmae));
		//�����ַ�����
		int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
			bw.flush();
		}
		bw.close();
		br.close();
	}

	//������һ�ζ�дһ���ַ�����
	private static void method4(String srcFileName, String destFileNmae) throws IOException {
		//��������������
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileNmae));
		//�����ַ�����
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			bw.write(chs, 0, len);
			bw.flush();
		}
		bw.close();
		br.close();
	}

	//�����������ⷽ��
	private static void method5(String srcFileName, String destFileNmae) throws IOException {
		//��������������
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileNmae));
		//�����ַ�������
		String line;
		//һ�ζ�дһ������
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();}

}
