package com.sum.arraylist;

import java.util.ArrayList;

/**
 * ͨ��API���ҷ������
 * ��ȡԪ��
 * 		public E get(int index):����ָ����������Ԫ��
 * ���ϳ���
 * 		public int size():���ش��б��е�Ԫ����
 * ɾ��Ԫ��
 * 		public boolean remove(Object o):ɾ��ָ��Ԫ��,�����Ƿ�ɾ���ɹ�
 * 		public E remove(int index):ɾ��ָ������Ԫ��,���ر�ɾ��Ԫ��
 * �޸�Ԫ��
 * 		public E set(int index,E element):�޸�ָ����������Ԫ��,���ر��޸�Ԫ��
 * 
 * @date 2017��9��26��
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//���
		System.out.println("array:"+array);
		
		//��ȡԪ��:public E get(int index)
		String string = array.get(1);
		System.out.println(string);
		
		//��ȡ���ϳ���public int size()
		int size = array.size();
		System.out.println("���ϵĳ���Ϊ:"+size);
		
		//ɾ��ָ��Ԫ��public boolean remove(Object o)
		boolean remove = array.remove("hello");
		System.out.println("Ԫ���Ƿ�ɾ��:"+remove);
		System.out.println(array);
		
		array.add(0, "hello");
		System.out.println(array);
		
		//ɾ��ָ��������Ԫ��public E remove(int index)
		String remove2 = array.remove(0);
		System.out.println("��ɾ����Ԫ����:"+remove2);
		System.out.println(array);
		
		//�޸�ָ��������Ԫ��public E set(int index,E element)
		String set = array.set(0, "android");
		System.out.println("���޸ĵ�Ԫ����:"+set);
		System.out.println(array);
	}
}
