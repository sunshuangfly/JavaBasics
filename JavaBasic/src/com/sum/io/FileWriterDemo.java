package com.sum.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter输出流,向文件中写数据
 * 
 * 构造方法 FileWriter(String fileName):传递一个文件名称
 * @date 2017年9月27日
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建输出流对象
		FileWriter fw = new FileWriter("e:\\a.txt");
		/**
		 * 创建输出流对象都做了哪些事情:
		 * 		1,调用系统资源创建了一个文件
		 * 		2,创建输出流对象
		 * 		3,把输出流对象指向这个文件
		 */
		//调用输出流写数据的方法
		fw.write("io流你好");
		//文件是先写在内存缓冲区,需要刷新缓冲区
		fw.flush();
		
		//释放资源
		fw.close();
		//如果不释放资源会怎么样,写一个死循环,然后运行程序后删除a.txt文件,无法删除
		//while(true){}
	}
}
