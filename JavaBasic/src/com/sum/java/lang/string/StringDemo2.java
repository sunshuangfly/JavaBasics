package com.sum.java.lang.string;
/**
 * ͨ�����췽���������ַ��������ֱ�Ӹ��Ʒ�ʽ�������ַ���������ʲô������?
 * 
 * ==:
 * 		������������:�Ƚϵ��ǻ����������͵�ֵ�Ƿ���ͬ
 * 		������������:�Ƚϵ��������������͵ĵ�ֵַ�Ƿ���ͬ
 * 
 * new�������ڶ��ڴ�
 * ֱ�Ӹ�ֵ���ַ����ڷ������ĳ�������,Ϊ�˷����ظ�ʹ��
 * @date 2017��9��26��
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("s1==s2:"+(s1==s2));//false
		
		String s3 = "hello";
		System.out.println("s2==s3:"+(s2==s3));//true
		
		String s4 = new String("hello");
		System.out.println("s1==s4"+(s1==s4));//false
	}
}
