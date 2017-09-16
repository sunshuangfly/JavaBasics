package com.sun.method;
/**
 * 把遍历数组改成方法遍历
 * @author 飞
 * @date 2017年9月16日
 */
public class MethodTest7 {
	public static void main(String[] args) {
		//定义一个数组
		int[] array = {12,345,5,7,43};
		//调用遍历方法
		printArray(array);
 	}
	
	/**
	 * 遍历数组
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
