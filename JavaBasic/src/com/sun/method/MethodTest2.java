package com.sun.method;

import java.util.Scanner;

/**
 * 键盘录入两个数,比较两个数是否相等
 * @author 飞
 * @date 2017年9月16日
 */
public class MethodTest2 {

	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();
	
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();
		
		boolean flag = compare(a, b);
		System.out.println("这两个数相等吗? "+flag);
		
	}
	
	/**
	 * 比较两个数是否相等
	 * 两个明确 :
	 * 	返回值类型:boolean
	 * 	参数列表: int a,int b
	 */
	public static boolean compare(int a,int b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
}
