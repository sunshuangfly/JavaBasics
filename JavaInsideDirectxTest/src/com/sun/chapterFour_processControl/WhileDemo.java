package com.sun.chapterFour_processControl;

import org.junit.Test;

/**
 * while循环语句 while语句也成为条件判断语句,它的循环方式为利用一个个条件来控制是否要反复执行这个语句 基本语法如下: while(条件表达式)
 * { 执行语句 } 当条件表达式返回值为真时,则执行'{}'中的语句, 当执行完'{}'中的语句后,重新判断条件表达式的返回值
 * 如果表达式返回结果为真,同上继续 如果表达式返回结果为假,退出循环.
 * 
 * @author 飞
 * @date 2017年9月13日
 */
public class WhileDemo {

	/**
	 * 通过while循环讲整数1~100相加并输出结果
	 */
	@Test
	public void test1() {
		// 定义变量并初始化值
		int x = 1;
		// 定义变量保存相加和的结果
		int sum = 0;
		while (x <= 100) { // x初始值为1,当x的值大于100时,条件语句为false,循环结束
			sum += x; // 一次循环后,sum的值为本次循环结束x的和,以后每次循环等于新的x的值加上之前的和,也就是sum
			x++; // 每循环一次x的值都会+1
		}
		System.out.println(sum);
		
	}

	/**
	 * do...while循环语句 do...while与while的区别是,先执行一次循环语句中的代码,然后再进入条件语句进行判断
	 * 也就是说,无论条件语句是否成立,都讲执行一次循环语句'{}'中的程序段 语法: do{ 执行语句 }while(条件表达式)
	 */

	public void test2() {
		int c = 10;
		/*int a  = 100; //定义变量并赋值
		while (a == 50) {
			System.out.println("while循环了一次");
			a--;
		}*/
		//System.out.println("------------------");
		int b = 100;
		
		do {
			System.out.println("do...while循环了一次");
			b--;
		}while(b>c);
		
	}
}
