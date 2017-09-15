package com.sun.chapterSix_Array;

import org.junit.Test;

/**
 * 第六章内容:数组 array 数组:具有相同数据类型的一组数据的集合
 * 
 * @author 飞
 * @date 2017年9月14日
 */
public class ArrayDemo {

	/**
	 * 创建一维数组 一维数组实质上就是一组相同数据类型的线性集合.
	 * 数组作为对象允许使用new关键字进行内存分配.在使用数组之前,必须首先定义数组变量所属的类型. 一维数组创建的方式有两种: 数组元素类型
	 * 数组名字[]; 数组元素类型[] 数组名字;
	 */
	// 创建int型数组,并实现各个月的天数输出
	@Test
	public void test1() {
		// 创建并初始化一维数组
		int day[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 使用for循环讲信息输出
		for (int i = 0; i < day.length; i++) {
			System.out.println((i + 1) + "月有" + day[i] + "天");
		}
	}

	/**
	 * 二维数组 如果一维数组中各个元素都是一维数组,那么这就是一个二维数组. 二维数组常用于表示表,表中的信息以行和列组成,第一个下标表示元素所在的行,
	 * 第二个下标表示元素所在的列 声明二维数组的语法: 数组元素类型 数组名字[][]; 数组元素的类型[][] 数组名字; 二维数组初始化语法如下:
	 * type arrayname[][] = {value1,value2...valuen};
	 */

	// 实现输出一个3行4列且所有元素都为0的矩形
	@Test
	public void test2() {
		int a[][] = new int[3][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * 数组的基本操作 遍历数组
	 */
	// 创建二位数组,并将所有元素打印出来
	@Test
	public void test3() {
		// 创建二维数组
		int array[][] = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	// 创建二位数组,使用foreach遍历并将所有元素打印出来
	@Test
	public void test4() {
		// 创建二维数组
		int array[][] = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		for (int x[] : array) {
			for (int y : x) {
				System.out.print(y);
			}
		}
	}

}
