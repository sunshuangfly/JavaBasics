package com.sum.arraylist;

import java.util.ArrayList;

/**
 * 存储自定义对象并遍历
 * 学生类
 * 
 * @date 2017年9月26日
 */
public class ArrayListDemo5 {
	public static void main(String[] args) {
		//创建集合
		ArrayList<Student> array = new ArrayList<Student>();
		
		//创建学生对象
		Student s1 = new Student("张三",20);
		Student s2 = new Student("李四",22);
		Student s3 = new Student("王五",30);
		Student s4 = new Student("赵四",25);
		
		//把对象添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		//遍历集合
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
}
