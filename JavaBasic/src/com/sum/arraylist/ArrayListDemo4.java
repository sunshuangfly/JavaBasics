package com.sum.arraylist;

import java.util.ArrayList;

/**
 * ����:
 * ����һ���ַ�������:{"������","��Զ��","���޼�","����ͤ","�Ŵ�ɽ","Ī����"}
 * �������е�Ԫ����ӵ�������,������"��"��ͷ��������ӡ����
 * 
 * public boolean startsWith(String prefix)
 * ���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ
 * ���������ʾ���ַ������Ǵ��ַ�����ʾ���ַ����е�ǰ׺���򷵻� true�����򷵻� false��
 * @date 2017��9��26��
 */
public class ArrayListDemo4 {
	public static void main(String[] args) {
		//��������
		String[] arr = {"������","��Զ��","���޼�","����ͤ","�Ŵ�ɽ","Ī����"};
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		//��������
		for (int i = 0; i < arr.length; i++) {
			String string = arr[i];
			//������Ԫ����ӵ�������
			array.add(string);
		}
		
		//��������
		for (int i = 0; i < array.size(); i++) {
			//��ȡ����Ԫ�ز��ж�Ԫ���Ƿ���'��'��ͷ
			if(array.get(i).startsWith("��")) {
				//��ӡ����������Ԫ��
				System.out.println(array.get(i));
			}
		}
	}
}
