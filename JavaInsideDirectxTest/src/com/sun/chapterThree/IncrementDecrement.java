package com.sun.chapterThree;
/**
 * 自增或自减 : ++ , --
 * 自增自减运算符是单目运算符,可以放在操作元之前,也可以放在操作元之后
 * 操作元必须是一个整型或浮点型变量.
 * 自增,自减运算符的作用是使变量的值加1或者减一
 * 放在操作元前面的会将变量先加一或减一,再使用该变量参与表达式运算
 * 放在操作元后面的会先使该变量参与表达式运算,再加一或减一
 * @author Administrator
 *
 */
public class IncrementDecrement {

	public static void main(String[] args) {
		//定义变量
		int a,b;
		a = 5;
		b = --a + (a++);  //首先执行--a,a=4,然后运行4+4,b=8,最后执行a++,a=5
		System.out.println(b);
		System.out.println(a);
	}
}
