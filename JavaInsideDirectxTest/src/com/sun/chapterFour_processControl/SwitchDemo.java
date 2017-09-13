package com.sun.chapterFour_processControl;

import org.junit.Test;

/**
 * switch多分支语句 switch语句中表达式的值必须是整数,字符型或字符串类型,常量值1~n也必须是整型,字符型或字符串类型.
 * switch语句首先计算表达式的值,如果表达式的值和某个case后面的值相同,则执行该case语句后的若干个语句,直到遇到break语句为止.
 * 若没有一个常量的值与表达式的值相同,则执行default后面的语句.
 * default语句为可选的,如果它不存在,且switch语句中表达式的值不与任何case常量值相同,switch则不做任何处理. 基本语法如下:
 * switch(表达式) { case 常量值1: 语句块1 break; ... case 常量值n: 语句块n break; default:
 * 语句块n+1 break; }
 * 
 * @author Administrator
 *
 */
public class SwitchDemo {

	public static void main(String[] args) {
		// 根据str的值,输出不同的提示信息
		String str = "你好,世界";
		switch (str) {
		case "你好":
			System.out.println("好好学习");
			break;
		case "世界":
			System.out.println("天天向上");
			break;
		case "你好,世界":
			System.out.println("好好学习,天天向上!");
			break;
		default:
			System.out.println("答案错误,都不是");
		}

		// 提示:同一个switch语句,case值不能相同

	}

	/**
	 * 
	 */
	@Test
	public void test1() {
		// 使用switch语句打印周一到周三英语单词
		int week = 3;
		switch (week) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("sorry,i don`t know");
		}
	}

}
