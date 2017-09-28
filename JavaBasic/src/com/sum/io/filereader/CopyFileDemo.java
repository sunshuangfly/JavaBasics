package com.sum.io.filereader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 把项目路径下的FileWriterDemo2.java文件读取后再复制到cofy.java
 * 
 * 文件复制规律 数据源: FileWriterDemo2.java -- 读数据 --FileReader
 * 
 * 目的地: Copy.java --写数据 -- FileWriter
 * 
 * @date 2017年9月28日
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// 创建输入流对象
		FileReader fr = new FileReader("FileWriterDemo2.java");
		// 创建输出流对象
		FileWriter fw = new FileWriter("Copy.java");
		// 读写数据
		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		// 释放资源
		fw.close();
		fr.close();
	}
}
