package com.sum.object.oriented;
/**
 * 手机类:
 * 		成员变量:品牌,价格,颜色
 * 		成员方法:打电话,发短信
 * @author 飞
 * @date 2017年9月25日
 */
public class Phone {
	//品牌
	String brand;
	int price;
	String color;
	
	//打电话
	public void call(String name) {
		System.out.println("给"+name+"打电话");
	}
	
	//发短信
	public void setMessage() {
		System.out.println("发短信");
	}
}
