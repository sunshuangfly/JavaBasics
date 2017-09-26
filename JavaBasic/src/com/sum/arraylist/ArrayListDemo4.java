package com.sum.arraylist;

import java.util.ArrayList;

/**
 * 需求:
 * 给定一个字符串数组:{"张三丰","宋远桥","张无忌","殷梨亭","张翠山","莫声谷"}
 * 将数组中的元素添加到集合中,并将以"张"开头的人名打印出来
 * 
 * public boolean startsWith(String prefix)
 * 测试此字符串是否以指定的前缀开始
 * 如果参数表示的字符序列是此字符串表示的字符序列的前缀，则返回 true；否则返回 false。
 * @date 2017年9月26日
 */
public class ArrayListDemo4 {
	public static void main(String[] args) {
		//创建数组
		String[] arr = {"张三丰","宋远桥","张无忌","殷梨亭","张翠山","莫声谷"};
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			String string = arr[i];
			//将数组元素添加到集合中
			array.add(string);
		}
		
		//遍历集合
		for (int i = 0; i < array.size(); i++) {
			//获取集合元素并判断元素是否以'张'开头
			if(array.get(i).startsWith("张")) {
				//打印满足条件的元素
				System.out.println(array.get(i));
			}
		}
	}
}
