package com.sun.method;
/**
 * 写一个方法,把所有的水仙花数打印出来
 * 水仙花数:各个位上的数的三次幂相加等于这个数本身的三位数
 * @author 飞
 * @date 2017年9月16日
 */
public class MethodTest5 {
	public static void main(String[] args) {
		printFlower();
	}
	
	/**
	 * 打印所有的水仙花数
	 * 两个明确:
	 * 	返回值类型:void
	 * 	参数列表:无参数
	 */
	public static void printFlower() {
		for(int x=100;x<1000;x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/100%10;
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x) {
				System.out.println(x);
			}
		}
	}
}
