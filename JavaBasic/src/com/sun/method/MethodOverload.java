package com.sun.method;
/**
 * 方法重载:就是在同一个类总,出现了方法名相同的情况
 * 	方法重载的特点:
 * 		方法名相同,参数列表不同,与返回值无关!
 * 		参数列表不同:
 * 			参数的个数不同
 * 			参数对应的类型不同
 * 在调用方法的时候,java虚拟机通过参数列表的不同来区分同名的方法
 * @author 飞
 * @date 2017年9月16日
 */
public class MethodOverload {
	public static void main(String[] args) {
		//调用参数为int类型的sum方法
		int result = sum(10, 20);
		System.out.println(result);
		
		//调用参数为float类型的sum方法
		float result2 = sum(10.0f, 20.0f);
		System.out.println(result2);
		
		//调用参数列表为int,参数个数为三个的sum方法
		int result3 = sum(10, 20, 30);
		System.out.println(result3);
	}
	
	/**
	 * 求两个int数据和
	 */
	public static int sum(int a,int b) {
		return a+b;
	}
	/**
	 * 求两个float数据和
	 */
	public static float sum(float a,float b) {
		return a+b;
	}
	
	/**
	 * 求是三个数据和
	 */
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
}
