package com.sun.basic.test;

import java.util.Scanner;

/**
 * 需求:
 * 	键盘录入数据,要求数据是四位整数,现在需要对数据进行加密,加密规则如下:
 * 	每位数字都加上5,然后除以10后的余数代替该数字
 * 	再将第一位和第四位交换,第二位和第三位交换
 * 	最后把加密后的数据打印到控制台
 * 
 *分析: 将数据存入数组中比较好操作
 *	1,键盘录入一个4位数
 *	2,定义一个长度为4的数组
 *	3,
 * @author 飞
 * @date 2017年9月22日
 */
public class Demo8 {
	public static void main(String[] args) {
		//键盘录入一个4位数
		Scanner sc = new Scanner(System.in);
		//接收数据
		int number = sc.nextInt();
		//定义一个长度为4的数组
		int[] arr = new int[4];
		//将number这个4位数每一位按照顺序分别赋值到数组中
		arr[0] = number/1000%10;
		arr[1] = number/100%10;
		arr[2] = number/10%10;
		arr[3] = number%10;
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			//每位数字都加上5
			arr[i] += 5;
			//除以10后的余数代替该数字
			arr[i]%=10;
		}
		//再将第一位和第四位交换,第二位和第三位交换
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		int temp2 = arr[1];
		arr[1] = arr[2];
		arr[2] = temp2;
		//遍历加密后的数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
