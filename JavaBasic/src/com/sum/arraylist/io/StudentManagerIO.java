package com.sum.arraylist.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.arraylist.manager.Student;

/**
 * 学生管理系统
 * 这次使用io流将数据存储到文本文件中
 * 
 * 步骤:  1,定义学生类 
 * 		 2,学生管理系统主界面的代码编写 
 * 		 3,学生管理系统查看所有学生的代码编写 
 * 		 4,学生管理系统的添加学生的代码编写
 *		 5,学生管理系统的删除学生的代码编写
		 6,学生管理系统的修改学生的代码编写
 * 
 * @date 2017年9月27日
 */
public class StudentManagerIO {
	public static void main(String[] args) throws IOException {
		//定义文件路径
		String fileName = "students.txt";
		while (true) {
			System.out.println("------欢迎来到学生管理系统------");
			System.out.println("1,查看学生信息");
			System.out.println("2,添加学生信息");
			System.out.println("3,删除学生信息");
			System.out.println("4,修改学生信息");
			System.out.println("5,退出系统");

			// 键盘录入选择功能
			Scanner sc = new Scanner(System.in);
			System.out.println("请选择你要进行的操作:");
			// 接收录入数据
			int number = sc.nextInt();
			switch (number) {
			case 1:
				// 查看学生
				findStudent(fileName);
				break;
			case 2:
				// 添加学生
				addStudent(fileName);
				break;
			case 3:
				// 删除学生
				removeStudent(fileName);
				break;
			case 4:
				// 修改学生
				updateStudent(fileName);
				break;
			case 5:
				// 退出系统
				System.out.println("谢谢再见!");
				System.exit(0); // jvm退出
				break;

			default:
				System.out.println("你的输入有误,请重新选择操作");
				break;
			}
		}
	}
	
	//从文件中读取数据到集合
	public static void readData(String fileName,ArrayList<Student> array) throws IOException {
		//创建缓冲输入流
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		while((line=br.readLine())!=null) {
			String[] datas = line.split(",");
			Student s = new Student();
			s.setId(datas[0]);
			s.setName(datas[1]);
			s.setAge(datas[2]);
			s.setAddress(datas[3]);
			array.add(s);
		}
		br.close();
	}
	
	//把集合中的数据写入到文件中
	public static void writerData(String fileName,ArrayList<Student> array) throws IOException {
		//创建缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	// 修改学生信息
		private static void updateStudent(String fileName) throws IOException {
			//创建集合对象
			ArrayList<Student> array = new ArrayList<Student>();
			//把文件中数据读取存入到集合中
			readData(fileName, array);
			// 键盘录入要修改的学生信息id
			System.out.println("请输入您要修改的学生信息id");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();
			// 定义索引
			int index = -1;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (id.equals(s.getId())) {
					index = i;
				}
			}
			if (index == -1) { // 说明输入的id不存在
				System.out.println("您好修改的学生信息不存在,请重新进行选择");
			} else {
				System.out.println("请输入新的学生姓名:");
				String name = sc.nextLine();
				System.out.println("请输入新的学生年龄:");
				String age = sc.nextLine();
				System.out.println("请输入新的学生居住地:");
				String address = sc.nextLine();

				// 创建学生对象
				Student s = new Student();
				s.setId(id);
				s.setName(name);
				s.setAge(age);
				s.setAddress(address);

				// 修改集合中学生对象
				array.set(index, s);
				//把集合中的数据重新写到文件中
				writerData(fileName, array);
				System.out.println("学生信息修改成功!");
			}

		}

		// 删除学生信息
		private static void removeStudent(String fileName) throws IOException {
			//创建集合对象
			ArrayList<Student> array = new ArrayList<Student>();
			//把文件中数据读取存入到集合中
			readData(fileName, array);
			// 键盘录入要删除学生信息的id
			System.out.println("请输入您要删除的学生id");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();
			// 定义一个索引
			int index = -1;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (id.equals(s.getId())) {
					index = i;
				}
			}

			if (index == -1) {
				System.out.println("您要删除的学生id不存在,请重新进行选择");
			} else {
				array.remove(index);
				//把集合中的数据重新写到文件中
				writerData(fileName, array);
				System.out.println("删除学生信息成功!");
			}

		}

		// 添加学生信息方法
		private static void addStudent(String fileName) throws IOException {
			//创建集合对象
			ArrayList<Student> array = new ArrayList<Student>();
			//把文件中数据读取存入到集合中
			readData(fileName, array);
			
			// 键盘录入学生信息
			Scanner sc = new Scanner(System.in);
			// 接收数据并存入集合

			// 为了使学号重复判断成立后回到输入学号位置,加入循环
			String id;
			while (true) {
				System.out.println("请输入学生Id:");// id可能重复,所以要进行判断
				id = sc.nextLine();

				// 定义一个boolean值作为标记
				boolean flag = false;
				// 循环取出id与输入的id进行比较
				for (int i = 0; i < array.size(); i++) {
					Student s = array.get(i);
					if (s.getId().equals(id)) {
						flag = true;
						break;
					}
				}

				// 判断标记
				if (flag) {
					System.out.println("您输入的学号已存在,请重新输入");
				} else {
					break;
				}
			}

			System.out.println("请输入学生姓名:");
			String name = sc.nextLine();
			System.out.println("请输入学生年龄:");
			String age = sc.nextLine();
			System.out.println("请输入学生居住地:");
			String address = sc.nextLine();
			// 把录入的信息添加到学生对象中
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			// 把学生对象添加到集合中
			array.add(s);
			//把集合中的数据重新写到文件中
			writerData(fileName, array);
			
			System.out.println("添加学生信息成功!");

		}

		// 查询所有学生信息方法
		private static void findStudent(String fileName) throws IOException {
			//创建集合对象
			ArrayList<Student> array = new ArrayList<Student>();
			//把文件中数据读取存入到集合中
			readData(fileName, array);
			// 判断集合中是否有学生信息存在,如果不存在直接返回
			if (array.size() == 0) {
				System.out.println("没有任何学生信息,请重新您的操作!");
				return;
			}
			// 遍历集合获取所有学生信息并打印
			System.out.println("学号\t姓名\t年龄\t居住地");
			for (int i = 0; i < array.size(); i++) {

				Student s = array.get(i);
				System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
			}
		}
}
