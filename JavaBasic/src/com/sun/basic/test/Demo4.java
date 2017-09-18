package com.sun.basic.test;
/**
 * 定义一个int数组,求出满足特定要求的元素和
 * 数组内容:{171,72,19,16,118,51,210,7,18};
 * 要求:求和元素个位和十位不能包含7,并且只能为偶数
 * @author 飞
 * @date 2017年9月18日
 */
public class Demo4 {
	public static void main(String[] args) {
		//创建数组
		int[] arr = {171,72,19,16,118,51,210,7,18};
		//定义求和变量sum
		int sum = 0;
		//循环遍历数组
		for (int i = 0; i < arr.length; i++) {
			//判断条件
			if(arr[i]%10 != 7 && arr[i]/10%10 != 7 && arr[i]%2 == 0) {
				sum+=arr[i];
				System.out.println(arr[i]);
			}
		}
		System.out.println(sum);
	}
}
