package com.sum.java.lang.string;
/**
 * 通过构造方法创建的字符串对象和直接复制方式创建的字符串对象有什么区别呢?
 * 
 * ==:
 * 		基本数据类型:比较的是基本数据类型的值是否相同
 * 		引用数据类型:比较的是引用数据类型的地址值是否相同
 * 
 * new出来的在堆内存
 * 直接赋值的字符串在方法区的常量池中,为了方便重复使用
 * @date 2017年9月26日
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("s1==s2:"+(s1==s2));//false
		
		String s3 = "hello";
		System.out.println("s2==s3:"+(s2==s3));//true
		
		String s4 = new String("hello");
		System.out.println("s1==s4"+(s1==s4));//false
	}
}
