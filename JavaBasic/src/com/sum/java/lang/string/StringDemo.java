package com.sum.java.lang.string;
/**
 * String
 * 		�ɶ���ַ���ɵ�һ������
 * 		�ַ����䱾����һ���ַ�����
 * ���췽��:
 * 		String(String original)
 * 			���ַ������ݷ�װ���ַ�������
 * 		String(char[] value)
 * 			���ַ��������ݷ�װ���ַ�������
 * 		String(char[] value, int offset, int count)
 * 			���ַ������е�һ���ַ�װ���ַ�������
 * ע��:�ַ�����һ�ֱȽ������������������,ֱ������ַ�������������Ǹö����е����ݶ��ǵ�ֵַ
 * @author ��
 * @date 2017��9��25��
 */
public class StringDemo {
	public static void main(String[] args) {
		//��ʽ1
		//String(String original)
		String s1 = new String("hello");
		//����Ĳ����ǵ�ֵַ,�����ַ�������.
		System.out.println(s1);
		
		//��ʽ2
		//String(char[] value)
		char[] chs = {'h','e','l','l','o'};
		String s2 = new String(chs);
		System.out.println(s2);
		
		//��ʽ3
		//String(char[] value, int offset, int count)
		//����1Ϊ�ַ�����  ������Ϊ��ʼ��ȡ�ַ����� ������Ϊ��ȡ�����ַ�
		String s3 = new String(chs, 2, 2);
		System.out.println(s3);
		
		//��ʽ4
		//String ������ַ�����Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ��
		String s4 = "hello";
		System.out.println(s4);
	}
}
