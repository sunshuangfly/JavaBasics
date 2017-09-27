package com.sum.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter的五个写数据方法
 * 		public void write(char[] cbuf,int off,int len)
 * 			:写入字符数组的某一部分
 * 			参数：
				cbuf - 字符缓冲区
				off - 开始写入字符处的偏移量
				len - 要写入的字符数		
 * 		public void write(int c) 
 * 			:写入单个字符
 * 			参数：c - 指定要写入字符的 int。
 * 		public void write(String str, int off,int len)
 * 			写入字符串的某一部分。
 * 			参数：
 * 				str - 字符串
 *				off - 开始写入字符处的偏移量
 * 				len - 要写入的字符数
 * 		public void write(char[] cbuf)
			写入字符数组
			参数:cbuf - 要写入的字符数组
		public void write(String str)
			写入字符串
			参数:str - 要写入的字符串
 * @date 2017年9月27日
 */
public class FileWriterDemo3 {
	public static void main(String[] args) throws IOException {
		//创建输出流对象
		FileWriter fw = new FileWriter("b.txt");
		
		//public void write(String str)
		//fw.write("你好IO流"); //写一个字符串内容
		
		//public void write(String str, int off,int len)
		//fw.write("你好IO流", 0, 3); //根据索引范围写字符串的一部分
		
		//public void write(int c)
		//fw.write(98); //写入单个字符
		//fw.write('b');
		
		//public void write(char[] cbuf)
		char[] chs = {'a','b','c','d','e'};
		//fw.write(chs); //写出一个字符数组
		
		//public void write(char[] cbuf,int off,int len)
		fw.write(chs, 0, 3); //根据索引写字符数组的一部分
		
		//刷新缓冲区
		fw.flush();
		
		//释放资源
		fw.close();
	}
}
