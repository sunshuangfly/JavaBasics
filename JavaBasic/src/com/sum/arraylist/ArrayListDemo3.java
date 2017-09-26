package com.sum.arraylist;

import java.util.ArrayList;

/**
 * ArrayList集合的遍历
 * 
 * @date 2017年9月26日
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//向集合中添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//输出集合元素
		//原始做法
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		System.out.println("-----------");
		//改进
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println("-----------------");
		//最标准用法,可能还需要对元素操作
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
	}
	
}
