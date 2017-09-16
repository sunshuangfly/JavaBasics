package com.sun.method;

import java.util.Scanner;

/*
 * 键盘录入两个数据,返回两个数中的最大值
 */
public class MethodTest {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//接收数据
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();
		
		//调用方法
		int max = getMax(a, b);
		System.out.println("最大值是:"+max);
	}
	
	/**
	 * 返回两个数中的最大值
	 * 
	 * 两个明确:
	 * 	返回值类型:int
	 * 	参数列表: int a,int b
	 */
	public static int getMax(int a,int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
}
