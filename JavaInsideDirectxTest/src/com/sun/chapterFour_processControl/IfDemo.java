package com.sun.chapterFour_processControl;
/**
 * 条件语句 : if
 * 语法:
 * 		if(布尔表达式){
 * 			语句序列
 * 		}
 * 复杂:
 * 		if(布尔表达式) {
 * 			语句序列
 * 		}else if{
 * 			语句序列
 * 		}else if...
 * 		 else{
 * 			语句序列
 * 		}
 * @author Administrator
 *
 */
public class IfDemo {

	public static void main(String[] args) {
		//定义变量
		int a = 10;
		int b = 20;
		if(a == b) {
			System.out.println("a等于b");
		}else if(a > b) {
			System.out.println("a大于b");
		}else {
			System.out.println("a小于b");
		}
		
		System.out.println("--------------------");
		
		//定义变量
		int c = 100;
		if(c==100)
			System.out.println("c的值是100");
		//说明 虽然if后面的复合语句块只有一条语句,省略'{}'并没有语法错误,但是为了增强程序的可读性最好不要省略
		
		System.out.println("------------------------");
		int math = 90;
		int english = 50;
		if(math > 60) {
			System.out.println("数学及格了");
		}else {
			System.out.println("数学没及格");
		}
		if(english > 60) {
			System.out.println("英语及格了");
		}else {
			System.out.println("英语没及格");
		}
		
		System.out.println("----------------------");
		
		//定义变量,使用if...else if多分支语句通过判断变量值决定输出结果
		int x = 30;
		if(x > 100) {
			System.out.println("x的值大于100");
		}else if(x > 50) {
			System.out.println("x的值小于100大于等于50");
		}else if (x > 0) {
			System.out.println("x的值大于0小于等于50");
		}else {
			System.out.println("x的值小于等于0");
		}
	}
}
