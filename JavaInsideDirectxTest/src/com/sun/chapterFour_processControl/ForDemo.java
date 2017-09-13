package com.sun.chapterFour_processControl;

import org.junit.Test;

/**
 * for循环语句
 * for循环可以用来重复执行某条语句,直到某个条件得到满足
 * 基本语法:
 * for(表达式1;表达式2;表达式3) {
 * 	语句序列
 * }
 * 表达式1:初始化表达式,负责完成变量的初始化
 * 表达式2:循环条件表达式,值为boolean型的表达式,指定循环条件
 * 表达式3:循环后操作表达式,负责修改变量,改变循环条件
 * 
 * @author 飞
 * @date 2017年9月13日
 */
public class ForDemo {

	/**
	 * 求0~100和
	 */
	@Test
	public void test1() {
		//定义变量sum用来保存和
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	/**
	 * foreach
	 * foreach是for的简化版,主要用于对数据的遍历
	 * 语法:
	 * for(元素变量x:遍历对象 object) {
	 * 	引用了x的java语句;
	 * }
	 */
	//创建数组并遍历
	@Test
	public void test2() {
		//创建一维数组
		int arr[] = {1,2,3,4,5,6,7};
		//遍历数组
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
