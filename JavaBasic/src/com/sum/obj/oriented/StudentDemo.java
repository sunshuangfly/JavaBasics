package com.sum.obj.oriented;
/**
 * 学生类的测试类
 * 
 * @author 飞
 * @date 2017年9月25日
 */
public class StudentDemo {
	public static void main(String[] args) {
		//无参+set方法
		Student s = new Student();
		s.setName("张三丰");
		s.setAge(30);
		System.out.println(s.getName()+"----"+s.getAge());
		
		//带参构造方法
		Student s1 = new Student("张无忌", 25);
		System.out.println(s1.getName()+"----"+s1.getAge());
	}
}
