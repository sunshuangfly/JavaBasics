package com.sun.chapterFour_processControl;

import org.junit.Test;

/**
 * break循环控制
 * 循环控制包含两方面内容,
 * 一方面是控制循环变量的变化方式
 * 一方面控制循环的跳转
 * 控制循环的跳转需要用到break和continue两个关键字
 * break为循环中断,continue为跳过本次执行下一次
 * @author 飞
 * @date 2017年9月13日
 */
public class BreakDemo {

	@Test
	public void test1() {
		for(int x = 1;x <= 100;x++) {
			System.out.println(x);
			if(x == 10) { //设置条件进入循环体
				break;	//使用break终止循环
			}
		}
	}
	
	/**
	 * 如果遇到循环嵌套,break语句讲只会让程序跳出包含它的最内存的循环结构,只跳出内层循环
	 */
	@Test
	public void test2() {
		for (int x = 0;x < 5;x++) {
			for(int y = 0;y < 10;y++) {
				if(y == 5) {
					break;
				}
				System.out.println("x为:"+x+"y为:"+y);
			}
		}
	}
	
	/**
	 * 使用java提供的'标签'功能,可以跳出外层循环
	 * 语法:
	 * 标签名 :循环体{
	 * 		break 标签名;
	 * }
	 */
	@Test
	public void test3() {
		stop :for (int x = 0;x < 5;x++) {
			for(int y = 0;y < 10;y++) {
				if(y == 5) {
					break stop;
				}
				System.out.println("x为:"+x+"   "+"y为:"+y); //这样内层循环终止,外层也会终止
			}
		}
	}
}
