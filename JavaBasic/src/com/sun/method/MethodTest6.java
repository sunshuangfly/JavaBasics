package com.sun.method;
/**
 * 比较两个数据是否相等,参数类型分别为两个bute类型
 * 两个short类型,两个int类型,两个long类型
 * @author 飞
 * @date 2017年9月16日
 */
public class MethodTest6 {
	public static void main(String[] args) {
		//调用参数为byte类型的compare方法
		boolean result = compare(2, 10);
		System.out.println(result);
		
		//调用参数为short类型的compare方法
		boolean result2 = compare(12, 34);
		System.out.println(result2);
	
		//调用参数为int类型的compare方法
		boolean result3 = compare(435, 435);
		System.out.println(result3);
	
		//调用参数为long类型的compare方法
		boolean result4 = compare(34234l, 432l);
		System.out.println(result4);
	}
	
	//byte类型方法
	public static boolean compare(byte a,byte b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
	//short类型方法
	public static boolean compare(short a,short b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
	//int类型方法
	public static boolean compare(int a,int b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
	//long类型方法
	public static boolean compare(long a,long b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
}
