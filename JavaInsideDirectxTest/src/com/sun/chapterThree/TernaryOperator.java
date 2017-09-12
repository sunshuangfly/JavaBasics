package com.sun.chapterThree;
/**
 * 三元运算符 格式: 条件表达式?值1:值2
 * 先判断条件表达式,若成立,取值1,不成立,取值2
 * @author Administrator
 *
 */
public class TernaryOperator {

	public static void main(String[] args) {
		//定义变量
		int a = 10;
		int b = 20;
		boolean c = a>b?true:false;
		boolean d = a!=b?true:false;
		System.out.println(c);
		System.out.println(d);
		
	}
}
