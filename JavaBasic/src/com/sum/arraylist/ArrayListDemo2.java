package com.sum.arraylist;

import java.util.ArrayList;

/**
 * 通过API查找方法完成
 * 获取元素
 * 		public E get(int index):返回指定索引处的元素
 * 集合长度
 * 		public int size():返回此列表中的元素数
 * 删除元素
 * 		public boolean remove(Object o):删除指定元素,返回是否删除成功
 * 		public E remove(int index):删除指定索引元素,返回被删除元素
 * 修改元素
 * 		public E set(int index,E element):修改指定索引处的元素,返回被修改元素
 * 
 * @date 2017年9月26日
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//输出
		System.out.println("array:"+array);
		
		//获取元素:public E get(int index)
		String string = array.get(1);
		System.out.println(string);
		
		//获取集合长度public int size()
		int size = array.size();
		System.out.println("集合的长度为:"+size);
		
		//删除指定元素public boolean remove(Object o)
		boolean remove = array.remove("hello");
		System.out.println("元素是否被删除:"+remove);
		System.out.println(array);
		
		array.add(0, "hello");
		System.out.println(array);
		
		//删除指定索引处元素public E remove(int index)
		String remove2 = array.remove(0);
		System.out.println("被删除的元素是:"+remove2);
		System.out.println(array);
		
		//修改指定索引处元素public E set(int index,E element)
		String set = array.set(0, "android");
		System.out.println("被修改的元素是:"+set);
		System.out.println(array);
	}
}
