package com.sun.basic.test;

import java.util.Scanner;

/**
 * 需求:在编程竞赛中,有六个评委给选手打分,分数为0-100.
 * 选手的最后得分为:去掉一个最高分和一个最低分后的4个评委平均分
 * 代码实现(不考虑小数部分)
 * 评委分数用键盘录入实现
 * @author 飞
 * @date 2017年9月22日
 */
public class Demo5 {
	public static void main(String[] args) {
		//创建一个数组,把评分放入数组中
		int[] arr = new int[6];
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		/*//接收评委分数
		System.out.println("请输入第1个评委的分数:");
		int num1 = sc.nextInt();
		System.out.println("请输入第2个评委的分数:");
		int num2 = sc.nextInt();
		System.out.println("请输入第3个评委的分数:");
		int num3 = sc.nextInt();
		System.out.println("请输入第4个评委的分数:");
		int num4 = sc.nextInt();
		System.out.println("请输入第5个评委的分数:");
		int num5 = sc.nextInt();
		System.out.println("请输入第6个评委的分数:");
		int num6 = sc.nextInt();*/
		//以上通过循环实现,并将评分添加入数组中
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第"+(i+1)+"个评委的分数:");
			//接收评委分数
			int score = sc.nextInt();
			//将分数放入数组中
			arr[i] = score;
		}
		//调用最大值方法求最高评分
		int man = maxNum(arr);
		//调用最小值方法求最小评分
		int min = minNum(arr);
		//求出总分
		int sum = sum(arr);
		//求出最后平均分
		int avg = (sum-man-min)/(arr.length-2);
		System.out.println("选手的最后得分为:"+avg+"分");
	}
	
	//方法获取数组最大值
	public static int maxNum(int[] arr) {
		//假设arr[0]为最大值max
		int max = arr[0]; 
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(arr[0]);
		return max;
	}
	
	//方法获取数组最小值
	public static int minNum(int[] arr) {
		//假设arr[0]位最小值min
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	//方法获取数组元素和
	public static int sum(int[] arr) {
		//定义求和变量sum
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
