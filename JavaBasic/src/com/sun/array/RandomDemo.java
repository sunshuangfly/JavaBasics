package com.sun.array;

import java.util.Random;
import java.util.Scanner;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

/**
 * Random:用于产生随机数
 * 
 * 使用步骤:
 * 	1,导包 :import java.util.Random;
 * 	2,创建对象
 *  	Random r = new Random();
 *  3,获取随机数
 *  	int number = r.nextInt(10);
 *  	获取随机数范围:[0,10) 包括0,不包括10
 * @author 飞
 * @date 2017年9月15日
 */
public class RandomDemo {
	public static void main(String[] args) {
		//创建对象
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			//获取随机数
			int number = r.nextInt(10);
			System.out.println(number);
		}
		System.out.println("-----------");
		//如何获取1-100之间的随机数?
		//int i = r.nextInt(100); //[0,100) 包括0,不包括100
		int i = r.nextInt(100)+1; //[1,100] 整体加1
		System.out.println(i);
	}
	/**
	 * Random小案例
	 * 系统产生一个1-100的随机数,请猜出这个数字是多少.
	 * 
	 * 分析: 
	 * 		1,系统产生一个1-100的随机数
	 * 		2,键盘录入数据
	 * 		3,比较这两个数字
	 * 			大了:提示大了
	 * 			小了:提示小了
	 * 			猜中了:恭喜猜中
	 */
	@Test
	public void test1() {
		//系统产生一个1-100随机数
		Random r = new Random();
		//获取随机数
		int number = r.nextInt(100)+1;
		//键盘录入我们要输入的数据
		Scanner s = new Scanner(System.in);
		while(true) {
			//接收数据
			System.out.println("请输入你要猜的数据(1-100):");
			int guessNumber = s.nextInt();
			//判断两个数据大小
			if(guessNumber > number ) {
				System.out.println("你猜的数字大了");
			}else if(guessNumber < number){
				System.out.println("你猜的数字小了");
			}else {
				System.out.println("恭喜你猜中了");
				break;
			}
		}
	}
}
