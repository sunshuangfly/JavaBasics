package com.sum.io.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 从文件中读取数据并显示到控制台
 * 		读数据 -- 输入流 -- FileReader
 * 
 * 构造方法:
 * 		FileReader(String fileName) :传递文件名称
 * 输入流读取文件步骤
 * 		1,创建输出流对象
 * 		2,调用输入流对象读取数据方法
 * 		3,释放资源
 * 
 * @date 2017年9月28日
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		//FileReader fr = new FileReader("d.txt");
		FileReader fr = new FileReader("FileWriterDemo2.java");
		
		/*//调用输入流对象的读取数据方法
		//int read():一次读取一个字符
		//第一次读取数据
		int ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		//第一次读取数据
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		//第一次读取数据
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		//第一次读取数据
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);*/
		
		//上面代码的重复读很高,想用循环的改进,但是不知道循环的结束条件是什么
		//多进行几次读取后发现,当读取没有数据后会返回-1,所以当返回结果为-1时结束循环
		int ch;
		while((ch=fr.read())!=-1) {
			//System.out.println(ch);
			System.out.print((char)ch);
		}
		//释放资源
		fr.close();
	}
}
