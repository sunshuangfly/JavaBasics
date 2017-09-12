package com.sun.chapterThree;
/**
 * 算数运算符 : +,-,*,/,%, 这些都是二元运算符
 * @author Administrator
 *
 */
public class ArithmeticOperator {

	//定义变量,使用运算符计算结果
	public static void main(String[] args) {
		float num1 = 314.432f;
		int num2 = 24;
		System.out.println("和:" + num1+num2);
		System.out.println("差:" + (num1-num2));
		System.out.println("积:" + num1*num2);
		System.out.println("商:" + num1/num2);
	}
}
