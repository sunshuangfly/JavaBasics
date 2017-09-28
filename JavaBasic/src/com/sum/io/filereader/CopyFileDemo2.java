package com.sum.io.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 把项目路径下的FileWriterDemo2.java文件读取后再复制到cofy.java
 * 
 * 数据源:FileWriterDemo2.java
 * 		使用FileReader读取
 * 目的地:Copy.java
 * 		使用FileWriter写数据
 * @date 2017年9月28日
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		FileReader fr = new FileReader("FileWriterDemo2.java");
		//创建输出流对象
		FileWriter fw = new FileWriter("Copy.java");
		
		//读写数据
		int len;
		char[] chs = new char[1024];
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
		}
		fw.close();
		fr.close();
	}
}
