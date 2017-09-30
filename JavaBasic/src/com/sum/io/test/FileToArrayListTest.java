package com.sum.io.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 把上一题的文本文件中的学生信息读取出来并存入集合,然后遍历集合,在控制台输出
 * 
 * 分析: 1,定义学生类 2,创建缓冲输入流对象 3,创建集合对象
 * 4,读取文本数据,并把数据按照一定格式分割赋值给学生对象,然后把学生对象作为元素存储到集合 5,释放资源 6,遍历集合
 * 
 * @date 2017年9月30日
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		// 创建缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));

		// 创建集合对象
		ArrayList<Student> array = new ArrayList<>();

		// 读取文件信息,数据按照格式分割后赋值给学生对象,把学生对象作为元素存入集合
		String line;
		while ((line = br.readLine()) != null) {
			// 以","分割读取到的数据,得到一个数组
			String[] strings = line.split(",");
			// 创建学生对象
			Student s = new Student();
			s.setId(strings[0]);
			s.setName(strings[1]);
			s.setAge(strings[2]);
			s.setAddress(strings[3]);
			// 把学生对象存入集合
			array.add(s);
		}
		// 释放资源
		br.close();

		// 遍历集合
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
		}
	}
}
