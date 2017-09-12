package com.sun.chapterThree;
/**
 * 逻辑运算符: &,&&,||,!
 * &与&&的区别
 * 	&会判断所有表达式,&&当判断出现false时,会直接返回false,这样就减少了计算时间,提高了效率
 * || 全false为false,有true则为true
 * @author Administrator
 *
 */
/**
 * 主方法创建整型变量,使用逻辑运算符对变量进行运算并打印结果
 * @author Administrator
 *
 */
public class LogicalOperator {

	public static void main(String[] args) {
		int a = 2;	//声明变量
		int b = 5;
		//声明boolean型变量,用于保存应用逻辑运算符&&后的返回值
		boolean result = (a > b)&&(a != b); //a>b为false,双与遇到false后会直接返回false,不在进行后面的判断
		boolean result2 = (a > b)||(a != b);//false
		System.out.println(result);
		System.out.println(result2);
	}
}
