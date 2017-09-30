package com.sum.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 需求: 键盘录入3个学生信息(学号,姓名,年龄,居住地)存入集合,然后遍历集合把每一个学生信息存入文本文件(每个学生信息为一行数据,自己定义分割标记)
 * 
 * 分析: 1,定义学生类 2,创建集合对象 3,写方法实现键盘录入学生信息,并把学生对象作为元素添加到集合 4,创建输出缓冲流对象
 * 5,遍历集合,得到每一个学生信息,并把学生信息按照一定格式写入文本文件 例如:0001,张三,北京
 * 
 * @date 2017年9月30日
 */
public class ArrayListToFileTest {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		ArrayList<Student> array = new ArrayList<>();
		
		//调用添加方法,添加三个学生信息
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		//创建输出缓冲流
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt",true));
		
		//遍历集合获取学生信息,并把学生信息按照一定格式写入文本文件
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			//格式:学号,姓名,年龄,居住地
			//使用StringBuilder拼接
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			
			//写入文本文件
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		//释放资源
		bw.close();

	}

	// 实现键盘录入学生信息
	public static void addStudent(ArrayList<Student> array) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 接收对象
		// 加入循环,保证id重复的情况写可以返回到重新输入id位置
		String id;
		while (true) {
			System.out.println("请输入学生id:");
			// 判断录入的学生id是否重复
			// 定义标记
			boolean flag = false;
			id = sc.nextLine();
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("您输入的id已存在,请重新输入");
			} else {
				break;
			}
		}

		System.err.println("请输入学生姓名:");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄");
		String age = sc.nextLine();
		System.out.println("请输入学生居住地");
		String address = sc.nextLine();

		// 创建学生对象
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		// 将学生添加到集合中
		array.add(s);
		//提示
		System.err.println("添加学生成功");
	}
}
