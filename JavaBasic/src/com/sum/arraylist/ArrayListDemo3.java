package com.sum.arraylist;

import java.util.ArrayList;

/**
 * ArrayList���ϵı���
 * 
 * @date 2017��9��26��
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//�򼯺������Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//�������Ԫ��
		//ԭʼ����
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		System.out.println("-----------");
		//�Ľ�
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println("-----------------");
		//���׼�÷�,���ܻ���Ҫ��Ԫ�ز���
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
	}
	
}
