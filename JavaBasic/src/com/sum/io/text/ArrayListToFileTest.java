package com.sum.io.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 把ArrayList集合总的字符串数据存储到文本文件中
 * 每一个字符串元素作为文件的一行数据
 * 
 * 分析:
 * 		1,创建集合对象
 * 		2,向集合对象中添加字符串元素
 * 		3,创建缓冲流对象
 * 		4,遍历集合,得到每一个元素,并把该字符串元素作为数据写到文本文件
 * 		5,释放资源
 * 
 * @date 2017年9月29日
 */
public class ArrayListToFileTest {
	public static void main(String[] args) throws IOException {
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		//向集合中添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("iso");
		
		//创建缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		//遍历集合
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
	}
}
