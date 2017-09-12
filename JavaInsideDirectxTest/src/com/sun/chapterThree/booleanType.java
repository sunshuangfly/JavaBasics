package com.sun.chapterThree;
/**
 * 布尔类型又称为逻辑类型,通过Boolean来定义布尔类型变量,只有true和false两个值,分别代表布尔逻辑中的真,和假.
 * 布尔值不能与整数进行转化,通常布尔类型用来流程控制中作为判断条件
 * 
 * @author Administrator
 *
 */
//自己简单写一个布尔类型的使用例子
public class booleanType {
	public static void main(String[] args) {
		
		//定义布尔变量
		boolean a = true;
		boolean b = false;
		int c = 10;
		int d = 20;
		if(d-c>0 == a) {
			System.out.println("d比c大");
		}else {
			System.out.println("c比d大");
		}
	}

	
}
