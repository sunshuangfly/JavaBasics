package com.sum.io.bufferedwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用缓冲流读取复制文本文件
 * 数据源:
 * 		FileWriterDemo2.java -- FileReader -- 高效缓冲流BufferedReader
 * 写数据:
 * 		Copy.java -- FileWriter --缓冲流 BufferedWriter
 * 
 * @date 2017年9月28日
 */
public class BufferedStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo2.java"));
		
		//创建缓冲输入流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		//读取数据
		//一次读取一个字符
		/*int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
		}*/
		
		//一次读取一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			bw.write(chs,0,len);
		}
		
		bw.close();
		br.close();
	}
}
