package com.sun.chapterThree;
/**
 * 比较运算符  >,<,==,>=,<=,!=
 * 比较用于比较,结果为boolean型
 * 当比较结果成立,运行结果为true,否则为false
 * @author Administrator
 *
 */
//自己写出简单的程序使用比较运算符
public class ComparisonOperator {

	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		if(num1 > num2) {
			System.out.println("常数num1比常数num2大");
		}else if(num1 == num2) {
			System.out.println("常数num1与常数num2相等");
		}else {
			System.out.println("常数num1比常数num2小");
		}
	}
}
