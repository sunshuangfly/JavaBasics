package com.sun.basic.test;
/**
 * 题目:不死神兔问题
 * 		有一对兔子,从出生后第三个月开始,每个月都生一对兔子.
 * 		小兔子长到第三个月后一个月又生一对兔子,假如兔子都不死,
 * 		问第二十个月兔子对数为多少?
 * 分析:
 * 	第一个月	1对
 * 	第二个月	1对
 * 	第三个月	2对
 * 	第四个月	3对
 * 	第五个月	5对
 *  第六个月	8对
 *  ...
 *  这样分析这些数字,下一个数字,等于前面两个数字和
 * @author 飞
 * @date 2017年9月18日
 */
public class Demo3 {
	public static void main(String[] args) {
		//将数据定义在数组中,根据月份给出数组长度
		int[] arr = new int[20];
		rabitNumber(arr);
		
	}
	
	public static void rabitNumber(int[] arr) {
		//已知一月二月兔子数,所以直接从3月开始循环
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] +arr[i-2];
		}
		//因为索引从0开始,所以第20个月索引为19
		System.out.println(arr[19]);
}
}
