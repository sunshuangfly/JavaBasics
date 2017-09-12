package com.sun.chapterThree;
/**
 * 定义几个int型变量
 * int类型为整数类型,可以是正数,也可以是负数.
 * @author Administrator
 *
 */
public class IntType {
	//定义int类型变量x
	static int x=1; 
	//定义int类型变量,x1,y1
	static int x1=43;
	static int y1=23;
	//定义int 类型变量,x2,y2
	static int x2=100;
	static int y2=200;
	
	//讲这些变量相加计算结果并打印
	public static void main(String[] args) {
		int num = x+x1+y1+x2+y2;
		System.out.println(num);
	}
}
