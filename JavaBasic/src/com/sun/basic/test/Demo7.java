package com.sun.basic.test;

import java.util.Scanner;

/**
 * 需求:数组元素查找(查找制定元素第一次在数组中出现的索引)
 * 1,给定数组int[] arr= {5,7,3,2,5};
 * 2,要求查询元素通过键盘录入方式确定
 * 3,定义一个查找数组元素第一次出现位置的方法(注,要查找的元素就是键盘录入的数据)
 * @author 飞
 * @date 2017年9月22日
 */
public class Demo7 {
	public static void main(String[] args) {
		//定义数组
		int[] arr= {5,7,3,2,5};
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//接收数据
		System.out.println("请输入被查询的数据:");
		int number = sc.nextInt();
		//调用方法,查询索引
		int index = firstIndex(arr, number);
		if(index == -1) {
			System.out.println("您要查询的数据在该数组中不存在!");
		}else {
			System.out.println("您要查询的元素在该数组中的索引位置为:"+index);
		}
	}
	
	//写方法返回查询指定元素在数组中第一次出现的索引位置
	public static int firstIndex(int[] arr,int number) {
		for (int i = 0; i < arr.length; i++) {
			if(number == arr[i]) {
				return i;
			}
		} 
		return -1;
	}
}

