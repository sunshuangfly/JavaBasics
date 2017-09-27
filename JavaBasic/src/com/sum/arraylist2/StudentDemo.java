package com.sum.arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 创建一个集合,存储学生对象,学生对象的数据来自于键盘录入,最后遍历集合
 * 
 * 注意:为了方便实用,我们把学生类中的所有成员定义为String类型
 * 
 * 分析:
 * 		定义学生类
 * 		创建集合对象
 * 		键盘录入数据,创建学生对象,把键盘录入的数据复制给学生对象的成员变量
 * 		把学生对象作为元素存储到集合中
 * 		遍历集合
 * 
 * 传值调用：传值调用中传递的参数为基本数据类型，参数视为形参。
 * 传引用调用：传引用调用中，如果传递的参数是引用数据类型，参数视为实参。
 * 		在调用的过程中，将实参的地址传递给了形参，形参上的改变都发生在实参上
 * @date 2017年9月27日
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		/*//键盘录入数据,创建学生对象,把键盘录入的数据复制给学生对象的成员变量
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生姓名:");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄:");
		String age = sc.nextLine();
		
		//创建学生对象
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		//把 学生对象存储到集合中
		array.add(s);*/
		//为了方便重复键盘录入数据,我们把上面步骤封装成方法实现重复使用
		//调用添加学生对象方法
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		//遍历集合
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).getName()+":"+array.get(i).getAge());
		}
	}
	
	/**
	 * 键盘录入添加学生对象方法
	 * 两个明确
	 * 		参数列表:ArrayList array
	 * 		返回值类型:void  (因为参数为引用数据类型,所以形参的改变直接影响实参)
	 */
	public static void addStudent(ArrayList<Student> array) {
		//键盘录入数据,创建学生对象,把键盘录入的数据复制给学生对象的成员变量
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生姓名:");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄:");
		String age = sc.nextLine();
		
		//创建学生对象
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		//把 学生对象存储到集合中
		array.add(s);
	}
	
}
