package com.sun.chapterSix_Array;
/**
 * 冒泡排序
 * 	
 * @author 飞
 * @date 2017年9月15日
 */
public class BubbleSort {
	//创建main方法调用冒泡排序方法对数组进行冒泡排序
	public static void main(String[] args) {
		//创建数组
		int[] array = {20,43,5,42,2,22};
		//创建本类调用遍历方法打印
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(array);
	}
	
	/**
	 * 创建冒泡排序方法
	 * @param array
	 */
	public void sort(int[] array) {
		//定义一个临时变量temp
		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j] >array[j+1]) {
					//把array[j]赋值给临时变量temp
					temp = array[j+1];
					//把array[j]赋值给array[j+1]
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		show(array);
	}

	/**
	 * 创建遍历数组方法show
	 * @param array
	 */
	private void show(int[] array) {
		for (int i : array) {
			System.out.print(">"+i);
		}
	}
}
