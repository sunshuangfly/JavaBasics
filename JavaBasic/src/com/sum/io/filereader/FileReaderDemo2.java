package com.sum.io.filereader;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader读取数据一次一个字符数组
 * 
 * @date 2017年9月28日
 */
public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		//FileReader fr = new FileReader("fr.txt");
		FileReader fr = new FileReader("FileWriterDemo2.java");
		
		//调用输入流对象的读取数据方法
		//int read(char[] chuf):一次读取一个字符数组的数据
	/*	//第一次读取
		char[] ch = new char[5];
		int len = fr.read(ch);
		System.out.println(new String(ch));
		
		//第二次读取
		len = fr.read(ch); //换行\r\n也是两个字符,也进行了读取
		System.out.println(new String(ch));
		
		//第三次读取
		len = fr.read(ch);
		System.out.println(new String(ch));*/
		
		//使用循环改进
		//char[] chs = new char[5]; //一般来说数组长度写成1024及其整数倍
		char[] chs = new char[1024];
		int len;
		//三个动作
		//1,fr.read(chs) 读取数据
		//2,len = fr.read(chs)数据赋值给len
		//3,len!=-1
		while((len = fr.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		//释放资源
		fr.close();
	}
}
