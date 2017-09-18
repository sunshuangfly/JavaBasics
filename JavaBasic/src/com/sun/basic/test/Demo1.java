package com.sun.basic.test;

import java.util.Scanner;

/**
 * 键盘录入一个月份,输出对应季节
 * @author 飞
 * @date 2017年9月16日
 */
public class Demo1 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//给出提示,键盘录入
		System.out.println("请输入一个月份:");
		int month = sc.nextInt();
		//调用查询季节方法,返回对应季节
		//printSeason(month);
		//print(month);
		printSeason2(month);
	}
	
	/**
	 * 根据月份,打印对应季节
	 * 两个明确:
	 * 	返回值:void
	 * 	参数列表:int month
	 */
	public static void printSeason(int month) {
		while(true) {
			if(month == 1||month == 2||month == 3) {
				System.out.println("春季");
				break;
			}else if(month == 4||month == 5||month == 6) {
				System.out.println("夏季");
			}else if(month == 7||month == 8||month == 9) {
				System.out.println("秋季");
			}else if(month == 10||month == 11||month == 12) {
				System.out.println("冬季");
			}else if(0 >= month || month > 12) {
				System.out.println("您的输入有误,请重新输入");
			}else if(month == -1) {
				break;
			}
		}
	}
	public static void print(int month) {
		switch (month) {
		case 1:
			System.out.println("春季");
			break;
		case 2:
			System.out.println("春季");
			break;
		case 3:
			System.out.println("春季");
			break;
		case 4:
			System.out.println("夏季");
			break;
		case 5:
			System.out.println("夏季");
			break;
		case 6:
			System.out.println("夏季");
			break;
		case 7:
			System.out.println("秋季");
			break;
		case 8:
			System.out.println("秋季");
			break;
		case 9:
			System.out.println("秋季");
			break;
		case 10:
			System.out.println("冬季");
			break;
		case 11:
			System.out.println("冬季");
			break;
		case 12:
			System.out.println("冬季");
			break;

		default:
			System.out.println("您的输入有误");
			break;
		}
	}
	
	/**
	 * 通过case穿透原理,可以简化代码
	 */
	public static void printSeason2(int month) {
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("冬季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("冬季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("冬季");
			break;

		default:
			System.out.println("你的输入有误请重新输入");
			break;
		}
	}
}
