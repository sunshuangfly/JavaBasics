package com.sun.array;
/**
 * 数组获取最值
 * @author 飞
 * @date 2017年9月15日
 */
public class ArrayDemo {

	public static void main(String[] args) {
		//创建数组
		int[] arr = {2,100,6,8,23,5,6,42,86,324,654,7,64,64,2,654,4,532,999,1};
		//创建本类对象
		ArrayDemo arrayDemo = new ArrayDemo();
		//调用本类方法,获取最大值
		arrayDemo.maxNum(arr);
		//调用本类方法,获取最小值
		arrayDemo.minNum(arr);
	}

	private void maxNum(int[] arr) {
		// 假设max为最大值
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			//如果循环中有比max大的值,赋值给max
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("最大值是:"+max);
	}
	
	private void minNum(int[] arr) {
		//假设第一个数为最小值
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			//判断比较,若有比min小的,则赋值给min
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("最小值是:"+min);
	}
}
