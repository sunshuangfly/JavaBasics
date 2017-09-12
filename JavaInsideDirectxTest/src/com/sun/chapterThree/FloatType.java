package com.sun.chapterThree;
/**
 * 默认情况下,小数都看做double型,
 * 若使用float型小数,则需要在小数后面添加F或f.
 * 可以使用后缀d或D来明确表明这是一个double类型数据,不用d不会出错,
 * 但声明float类型变量时如果不加f,系统会认为变量是double类型而出错.
 * 例子,定义浮点类型变量,并运算后输出
 * 
 * @author Administrator
 *
 */
public class FloatType {

	float f1 = 12343.543f;
	double d1 = 42542.5643252;
	float f2 = 425432.635f;
	double d2 = 454252.543;
	public static void main(String[] args) {
		
	}
}
