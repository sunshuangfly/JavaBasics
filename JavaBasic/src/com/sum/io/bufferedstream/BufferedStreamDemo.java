package com.sum.io.bufferedstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 缓冲流的特殊功能: BufferedWriter void newLine():写一个换行符,这个换行符由系统决定 BufferedReader
 * String readLine():一次读取一行数据,但是不读取换行符
 * 
 * @date 2017年9月29日
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		for (int x = 0; x < 10; x++) {
			bw.write("hello");
			// 换行
			// bw.write("\r\n");
			bw.newLine();
			// 刷新缓冲区
			bw.flush();
		}
		// 释放资源
		bw.close();
		
		//创建缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("br.txt"));
		/*//一次读取一行
		String line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		//由上可见,readLine一次读取一行数据,如果没有数据,返回null
*/		//用循环改进
		String line;
		while((line=br.readLine())!=null) {
			System.out.print(line);
			
		}
		br.close();
	}
}
