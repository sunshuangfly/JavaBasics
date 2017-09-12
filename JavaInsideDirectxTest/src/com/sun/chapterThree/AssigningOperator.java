package com.sun.chapterThree;
/**
 * 赋值运算符 : "="
 * 在java中可以把赋值运算符连起来用,如:a=b=c=d=5; 但是在程序开发中不建议这样使用.
 * @author Administrator
 *
 */
//在主方法中定义变量并赋值
public class AssigningOperator {

	public static void main(String[] args) {
		//定义变量
		int a,b,c;
		//给变量赋值
		a = 10;
		b = a + 10;
		c = b + 10;
		//输出结果
		System.out.println("b的值为:"+b);
		System.out.println("c的值为:"+c);
	}
}
