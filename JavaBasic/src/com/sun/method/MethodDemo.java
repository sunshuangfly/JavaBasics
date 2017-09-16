package com.sun.method;
/**
 * 方法:其实就是完成特定功能的代码块
 * 
 * 定义格式:
 * 		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
 * 			方法体;
 * 			return 返回值;
 * 		}
 * 
 * 写一个方法有两个明确:
 * 		1,返回值类型	明确功能结果的数据类型
 * 		2,参数列表		明确有几个参数,以及参数的数据类型
 * @author 飞
 * @date 2017年9月16日
 */
//写一个方法用于求和
public class MethodDemo {
	public static void main(String[] args) {
		//直接调用,没有意义
		sum(10,20);
		
		//输出调用,有意义.但是只能输出,不能对结果进行其他操作
		System.out.println(sum(10,20));
		
		//赋值调用 可以对结果进行其他操作
		int result = sum(10,20);
		System.out.println(result);
		int result2 = result +20;
		System.out.println(result2);
	}
	
	/**
	 * 两个明确:
	 * 		返回值类型:int 
	 * 		参数列表:int a ,int b
	 */
	public static int sum(int a,int b) {
		int c = a + b;
		return c;
	}
}
