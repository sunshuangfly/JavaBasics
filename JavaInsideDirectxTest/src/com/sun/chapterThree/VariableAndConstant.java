package com.sun.chapterThree;
/**
 * 变量
 * 定义变量就是要告诉编译器这个变量的数据类型,
 * 这样编译器才知道需要配置多少的空间给他,
 * 以及他能存放什么类型的数据
 * 程序运行过程中,空间内的值是变化的,这个内存空间就称为变量
 * 这个内存的空间的名字,就是变量名,内存空间的值,就是变量值.
 * 在声明变量时,可以没有值,也可以直接赋予初始值
 * 常量
 * 在程序运行过程中一直不会改变的量称为常量constant,通常也被称为被final变量
 * 常量在整个程序中只能被赋值一次
 * java语言总声明一个常量,除了要指定数据类型外,还要通过final关键字进行限定.声明常量的标准语法如下:
 * final 数据类型 常量名=常量值
 * 常量的命名通常使用大写字母,但这并不是必须的.使用大写字母表示常量,是为了清楚地表明正在使用常量.
 * 声明常量,实例代码如下:
 * final double PI = 3.1415926D;
 * final boolean BOOL = true;
 * 当定义的final变量属于"成员变量"时,必须在定义时就设定它的初始值,否则将会产生编译错误.
 * @author Administrator
 *
 */
public class VariableAndConstant {

	//声明几个常量,并在主方法中进行简单运算
	static final double PI = 3.1415926;
	static final int radius = 10;
	public static void main(String[] args) {
		//圆的周长
		double perimeter = 2*PI*radius;
		System.out.println(perimeter);
	}
}
