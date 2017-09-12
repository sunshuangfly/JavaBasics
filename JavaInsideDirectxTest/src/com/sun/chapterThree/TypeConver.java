package com.sun.chapterThree;


/**
 * 数据类型转换
 * 数据类型转换有两种方式:隐式转化和显示转换
 * 隐式转化:从低级类型向高级类型转化系统将自动执行,程序员无需操作.
 * 这些类型按精度从低到高排序为byte<short<int<long<float,double
 * @author Administrator
 *
 */
public class TypeConver {

	public static void main(String[] args) {
		int a = 10;
		float b = a;
		System.out.println(b);
		System.out.println("-----------------------");
		
	}
}
