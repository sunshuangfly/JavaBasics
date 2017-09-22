package com.sun.basic.test;

import java.util.Scanner;

/**
 * 需求:
 * 1,键盘录入5个int类型的数据存入数组arr中
 * 2,定义方法将arr数组中的内容反转
 * 3,定义方法对反转后的数组进行遍历
 * 
 * 分析:
 * 1,定义一个长度为5的数组
 * 2,键盘录入数据给数组中元素赋值
 * 3,定义方法将arr数组中的内容反转
 * 4,定义方法将数组遍历
 * 
 * 如何实现反转
 * 数组0索引元素与最大索引元素交换
 * 数组1索引元素与次大索引元素交换
 * ...
 * 可以定义0索引为 int start = 0;
 * 最大索引为 int end = arr.length-1;
 * 重要条件,start <= end ,交换到中间位置就不必再交换了
 * @author 飞
 * @date 2017年9月22日
 */
public class Demo6 {
	public static void main(String[] args) {
		//定义一个长度为5的数组
		int[] arr = new int[5];
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//循环输入数据,并赋值到数组中
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数据:");
			//接收数据
			int number = sc.nextInt();
			//给数组元素赋值
			arr[i] = number;
		}
		reverse(arr);
		//printArray(arr);
		printArr(arr);
	}
	
	//写方法实现反转
	public static void reverse(int[] arr) {
		for(int start=0,end=arr.length-1;start<=end;start++,end--)  {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
	//写方法遍历数组
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	//for遍历数组
	public static void printArr(int[] arr) {
		System.out.print("反转后的数组为:[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]+"]");
			}else {
				System.out.print(arr[i]+",");
			}
		}
	}
}
