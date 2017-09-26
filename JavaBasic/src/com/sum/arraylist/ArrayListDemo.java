package com.sum.arraylist;

import java.util.ArrayList;

/**
 * 集合的特点:长度可变
 * 
 * ArrayList<E> :
 * 		大小可变的数组的实现
 * 
 * @date 2017年9月26日
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//用add(E e)向集合中添加元素
		array.add("hello");
		array.add("word");
		array.add("java");
		
		//用add(int index,E element)方法向集合指定指定索引位置添加元素
		array.add(1, "android");
		
		System.out.println(array);
	}
}
