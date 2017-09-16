package com.sun.method;

import java.util.Scanner;

/**
 * 键盘录入三个数据 返回最大值
 * @author 飞
 * @date 2017年9月16日
 */
public class MethodTest3 {

	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//接收数据
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();
		System.out.println("请输入第三个数据:");
		int c = sc.nextInt();
		//调用方法
		int result = getMax(a, b, c);
		System.out.println("三个数的最大值是:"+result);
	}
	
	/**
	 * 返回三个数的最大值
	 * 两个明确
	 * 	返回值类型:int
	 * 	参数里列表:int a,int b,int c
	 */
	public static int getMax(int a,int b,int c) {
		if(a > b) {
			if(a >c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b > c) {
				return b;
			}else {
				return c;
			}
		}
	}
}
