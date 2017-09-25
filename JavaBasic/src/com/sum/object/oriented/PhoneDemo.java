package com.sum.object.oriented;
/**
 * 手机测试类
 * @author 飞
 * @date 2017年9月25日
 */
public class PhoneDemo {
	public static void main(String[] args) {
		//创建对象
		Phone p = new Phone();
		//输出成员变量
		System.out.println(p.brand);
		System.out.println(p.price);
		System.out.println(p.color);
		System.out.println("-------------------");
		//赋值
		p.brand = "三星";
		p.price = 3000;
		p.color = "白色";
		
		//再次输出成员变量
		System.out.println(p.brand);
		System.out.println(p.price);
		System.out.println(p.color);
		//调用成员方法
		p.call("王力宏");
		p.setMessage();
	}
	
	
}
