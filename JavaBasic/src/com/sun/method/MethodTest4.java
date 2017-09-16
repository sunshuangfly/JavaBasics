package com.sun.method;
/**没有返回值的方法
 * 写一个方法,传递一个整数(大于1),在控制台打印1到该数据的值
 * @author 飞
 * @date 2017年9月16日
 */
public class MethodTest4 {
	public static void main(String[] args) {
		printNum(10);
	}
	
	/**
	 * 写一个方法,传递一个整数(大于1),在控制台打印1到该数据的值
	 * 两个明确:
	 * 	返回值类型:void
	 * 	参数列表:int n
	 */
	public static void printNum(int n) {
		for(int i=1;i <=n;i++) {
			System.out.println(i);
		}
	}
}
