package com.sum.io.text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 从文本文件中读取数据到ArrayList集合中,并遍历集合
 * 每一行数据作为一个字符串元素
 * 
 * 分析:
 * 		1,创建缓冲输入流对象
 * 		2,创建集合对象
 * 		3,读取数据,每次读取一行数据,把每一行数据作为一个元素存储到集合中
 * 		4,释放资源
 * 		5,遍历集合
 * 
 * @date 2017年9月29日
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		//创建缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo2.java"));
		//创建集合对象
		ArrayList<String> array = new ArrayList<>();
		//读取数据,一次一行,并写入集合
		String line;
		while((line=br.readLine())!=null) {
			array.add(line);
		}
		//释放资源
		br.close();
		//遍历集合
		for (String string : array) {
			System.out.println(string);
		}
	}
}
