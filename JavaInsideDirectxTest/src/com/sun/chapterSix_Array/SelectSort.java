package com.sun.chapterSix_Array;
/**
 * 直接选择排序
 * 先从数组中选出最大或最小的值,放置最前或最后固定位置,
 * 然后取相邻下一个数与下一个相邻数进行比较,依照大小顺序调换,依次执行下去
 * @author 飞
 * @date 2017年9月15日
 */
public class SelectSort {

	public static void main(String[] args) {
		//创建数组
		int[] array = {23,5,43,56,7,24,78};
		//创建本类对象
		SelectSort sort = new SelectSort();
		//调用直接选择排序方法
		sort.selectSort(array);
		//调用遍历方法打印
		sort.print(array);
	}

	private void print(int[] array) {
		// 遍历数组
		for (int i : array) {
			System.out.print(">"+i);
		}
		System.out.println();
	}

	private void selectSort(int[] array) {
		//定义临时变量
		int index;
		for (int i = 1; i < array.length; i++) {
			index = 0;
			for (int j = 1; j <= array.length-i; j++) {
				if(array[j] > array[index]) {
					index = j;
				}
			}
			int temp = array[array.length-i];
			array[array.length-i] = array[index];
			array[index] = temp;
		}
		print(array);
	}
}
