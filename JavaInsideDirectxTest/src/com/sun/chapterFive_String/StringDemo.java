package com.sun.chapterFive_String;

import org.junit.Test;

/**
 * String
 * @author 飞
 * @date 2017年9月13日
 */
public class StringDemo {

	@Test
	public void test1() {
		char a[]={'a','b','c','d','e'};
		String s = new String(a);
		System.out.println(s);
	}
	
	/**
	 * 字符串连接
	 * 使用'+'运算符可以实现连接多个字符串的功能.'+'运算符可以连接多个运算符并产生一个String对象
	 */
	@Test
	public void test2() {
		//创建String对象
		String str1 = new String("hello");
		String str2 = new String("java");
		String str3 = str1+str2;
		System.out.println(str3);
	}
	
	/**
	 * String连接其他数据类型
	 * 其他数据类型与字符串连接,会将这些类型数据直接转换成字符串
	 */
	@Test
	public void test3() {
		//创建String对象
		String str = new String("我叫Tom");
		//定义int类型变量age
		int age = 17;
		//定义float类型变量f
		float f = 2.5f;
		//三种类型数据相加
		System.out.println(str+"我今年"+age+"岁,我喜欢看书,每天看"+f+"小时");
	}
	
	/**
	 * 获取字符串长度
	 * 使用String类的length()方法可以获取字符串对象的长度
	 */
	@Test
	public void test4(){
		//创建字符串对象
		String str = new String("你们好,我叫Tom.");
		int length = str.length();
		System.out.println(str+"这个字符创的长度是:"+length);
	}
	
	/**
	 * 字符串查找
	 * String类提供了两种查找字符串的方法,indexOf()和lastIndexOf()
	 * indexOf()返回搜索的字符或字符串第一次出现的位置,返回值为整数,从0开始计算,如果没有返回-1
	 * lastIndexOf()方法返回的是搜索的字符或字符串最后一次出现位置的索引,没有返回-1
	 */
	@Test
	public void test5() {
		//创建String对象
		String str = new String("abcdefghijkf");
		//创建要搜索的字符subStr
		String sbuStr = new String("f");
		//搜索字符'a'在str中那个位置出现
		int firstIndex = str.indexOf(sbuStr);
		System.out.println(firstIndex);
		//搜索字符'f'最后出现的索引位置
		int lastIndex = str.lastIndexOf(sbuStr);
		System.out.println(lastIndex);
		
	}
}
