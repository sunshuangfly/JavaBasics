package com.sun.basic.test;
/**
 * 打印5位数中的所有回文数
 * 	什么是回文数:12321是回文数,个位数与万位数相同,十位与百位相同
 * @author 飞
 * @date 2017年9月18日
 */
public class Demo2 {
	public static void main(String[] args) {
		//调用方法打印回文数
		print();
	}
	
	//
	public static void print() {
		//遍历所有5位数
		for (int i = 10000; i < 100000; i++) {
			//定义ge,shi,bai,qian,wan代表各个位
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			int qian = i/1000%10;
			int wan = i/10000%10;
			if(ge == wan && shi == qian) {
				System.out.println(i);
			}
		}
	}
}
