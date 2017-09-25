package com.sum.java.lang.string;
/**
 * String
 * 		由多个字符组成的一串数据
 * 		字符串其本质是一个字符数组
 * 构造方法:
 * 		String(String original)
 * 			把字符串数据封装成字符串对象
 * 		String(char[] value)
 * 			把字符数组数据封装成字符串对象
 * 		String(char[] value, int offset, int count)
 * 			把字符数组中的一部分封装成字符串对象
 * 注意:字符串是一种比较特殊的引用数据类型,直接输出字符串对象输出的是该对象中的数据而非地址值
 * @author 飞
 * @date 2017年9月25日
 */
public class StringDemo {
	public static void main(String[] args) {
		//方式1
		//String(String original)
		String s1 = new String("hello");
		//输出的并非是地址值,而是字符串数据.
		System.out.println(s1);
		
		//方式2
		//String(char[] value)
		char[] chs = {'h','e','l','l','o'};
		String s2 = new String(chs);
		System.out.println(s2);
		
		//方式3
		//String(char[] value, int offset, int count)
		//参数1为字符数组  参数而为开始截取字符索引 参数三为截取几个字符
		String s3 = new String(chs, 2, 2);
		System.out.println(s3);
		
		//方式4
		//String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现
		String s4 = "hello";
		System.out.println(s4);
	}
}
