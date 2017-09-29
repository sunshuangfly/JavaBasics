package com.sum.io.bufferedstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用缓冲流特殊功能复制文本文件
 * 
 * @date 2017年9月29日
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//创建缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo2.java"));
		//创建缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		//读取写入数据
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		bw.close();
		br.close();
	}
}
