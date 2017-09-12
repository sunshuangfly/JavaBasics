package com.sun.chapterThree;
/**
 * 在类的方法体中定义的变量
 * 在累的方法中声明的变量,包括方法的参数,都属于局部变量.
 * 局部变量值在当前定义的方法内有效.
 * 局部变量的声明周期取决于方法,当方法被调用的时候,java虚拟机为方法中的局部变量分配内存空间,
 * 	当该方法调用结束,则会释放方法中局部变量占用的内存空间,局部变量将被销毁
 * 局部变量可以与成员变量的名字相同,此时成员变量将被隐藏,即这个成员变量在此方法中暂时失效.
 * @author Administrator
 *
 */
/**
 * 创建相同的名字的局部和成员变量,成员变量将被隐藏
 * @author Administrator
 *
 */
public class LocalVariable {

	String str = "hello world";
	
	public static void main(String[] args) {
		String str = "hello java";
		System.out.println(str);
	}
}
