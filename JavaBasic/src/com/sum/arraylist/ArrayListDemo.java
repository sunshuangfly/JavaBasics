package com.sum.arraylist;

import java.util.ArrayList;

/**
 * ���ϵ��ص�:���ȿɱ�
 * 
 * ArrayList<E> :
 * 		��С�ɱ�������ʵ��
 * 
 * @date 2017��9��26��
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//��add(E e)�򼯺������Ԫ��
		array.add("hello");
		array.add("word");
		array.add("java");
		
		//��add(int index,E element)�����򼯺�ָ��ָ������λ�����Ԫ��
		array.add(1, "android");
		
		System.out.println(array);
	}
}
