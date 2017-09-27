package com.sum.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 输出流写数据步骤:
 * 		1,创建输出流对象
 * 		2,调用输出流对象的写数据方法,并刷新缓冲区
 * 		3,释放资源
 * 
 * close()和flush()区别
 * 		flush():刷新缓冲区.  流对象可以继续使用
 * 		close():先刷新缓冲区,再通知系统释放资源. 关闭后,流对象将不能够在进行使用!
 * @date 2017年9月27日
 */
public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		//创建输出流对象
		//FileWriter fw = new FileWriter("e:\\a.txt"); //绝对路径,相对于磁盘
		FileWriter fw = new FileWriter("a.txt"); //相对路径,相对于当前项目,在项目的根目录下
		
		//调用写数据方法
		fw.write("hello java");
		
		//fw.flush(); //这里没有刷新缓冲区也可以显示内容
		
		//关闭资源
		fw.close(); //close再关闭资源前也会去缓冲区检查资源,自动刷新
	}
}
