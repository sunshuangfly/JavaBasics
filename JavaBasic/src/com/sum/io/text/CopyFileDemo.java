package com.sum.io.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 练习赋值文本文件(5中方式)
 * 
 * 数据源:FileWriterDemo2.java
 * 
 * 目的地:Copy.java
 * 
 * @date 2017年9月29日
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		/*method1("FileWriterDemo2.java","Copy.java");
		method2("FileWriterDemo2.java","Copy.java");
		method3("FileWriterDemo2.java","Copy.java");
		method4("FileWriterDemo2.java","Copy.java");
		method5("FileWriterDemo2.java","Copy.java");*/
		
		//以上方法改进
		String srcFileName = "FileWriterDemo2.java";
		String destFileNmae = "Copy.java";
		
		method1(srcFileName,destFileNmae);
		method2(srcFileName,destFileNmae);
		method3(srcFileName,destFileNmae);
		method4(srcFileName,destFileNmae);
		method5(srcFileName,destFileNmae);
		
	}
	
	//一次读取一个字符
	private static void method1(String srcFileName, String destFileNmae) throws IOException {
		//创建输入流对象
		FileReader fr = new FileReader(srcFileName);
		//创建输出流对象
		FileWriter fw = new FileWriter(destFileNmae);
		//定义字符变量
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
			fw.flush();
		}
		fw.close();
		fr.close();
		
	}

	//一次读取一个字节数组
	private static void method2(String srcFileName, String destFileNmae) throws IOException {
		//创建输入流对象
		FileReader fr = new FileReader(srcFileName);
		//创建输出流对象
		FileWriter fw = new FileWriter(destFileNmae);
		//创建字符数组
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		fw.close();
		fr.close();
		
	}

	//缓冲流一次读写一个字符
	private static void method3(String srcFileName, String destFileNmae) throws IOException {
		//创建缓冲输入流
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//创建缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileNmae));
		//定义字符变量
		int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
			bw.flush();
		}
		bw.close();
		br.close();
	}

	//缓冲流一次读写一个字符数组
	private static void method4(String srcFileName, String destFileNmae) throws IOException {
		//创建缓冲输入流
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//创建缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileNmae));
		//创建字符数组
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			bw.write(chs, 0, len);
			bw.flush();
		}
		bw.close();
		br.close();
	}

	//缓冲流的特殊方法
	private static void method5(String srcFileName, String destFileNmae) throws IOException {
		//创建缓冲输入流
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//创建缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileNmae));
		//定义字符串对象
		String line;
		//一次读写一行数据
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();}

}
