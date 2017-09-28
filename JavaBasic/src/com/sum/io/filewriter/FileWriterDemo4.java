package com.sum.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 如何实现数据的换行? 
 * 		\n可以实现换行,但是window系统自带的记事本却并没有换行,因为window识别的换行不是'\n',而是'\r\n'
 * 常见系统识别的换行: window :\r\n 
 * 				 Linux :\n 
 * 				 mac: \r 
 * 如何实现数据的追加写入? public
 * FileWriter(String fileName,boolean append)
 * 		根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造FileWriter对象 
 * 参数:	fileName - 一个字符串，表示与系统有关的文件名。 
 * 		append - 一个 boolean 值，如果为true，则将数据写入文件末尾处，而不是写入文件开始处
 * 
 * 
 * 
 * @date 2017年9月28日
 */
public class FileWriterDemo4 {
	public static void main(String[] args) throws IOException {
		// 创建输出流对象,并将数据写入到文件末尾处,进行追加
		FileWriter fw = new FileWriter("c.txt", true);//默认是false,不追加

		// 通过写方法写数据
		for (int x = 0; x < 10; x++) {
			fw.write("hello");
			// 通过\n换行
			fw.write("\r\n");
		}

		// 刷新缓冲区
		fw.flush();

		// 关闭资源
		fw.close();
	}
}
