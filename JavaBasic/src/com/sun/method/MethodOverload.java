package com.sun.method;
/**
 * ��������:������ͬһ������,�����˷�������ͬ�����
 * 	�������ص��ص�:
 * 		��������ͬ,�����б�ͬ,�뷵��ֵ�޹�!
 * 		�����б�ͬ:
 * 			�����ĸ�����ͬ
 * 			������Ӧ�����Ͳ�ͬ
 * �ڵ��÷�����ʱ��,java�����ͨ�������б�Ĳ�ͬ������ͬ���ķ���
 * @author ��
 * @date 2017��9��16��
 */
public class MethodOverload {
	public static void main(String[] args) {
		//���ò���Ϊint���͵�sum����
		int result = sum(10, 20);
		System.out.println(result);
		
		//���ò���Ϊfloat���͵�sum����
		float result2 = sum(10.0f, 20.0f);
		System.out.println(result2);
		
		//���ò����б�Ϊint,��������Ϊ������sum����
		int result3 = sum(10, 20, 30);
		System.out.println(result3);
	}
	
	/**
	 * ������int���ݺ�
	 */
	public static int sum(int a,int b) {
		return a+b;
	}
	/**
	 * ������float���ݺ�
	 */
	public static float sum(float a,float b) {
		return a+b;
	}
	
	/**
	 * �����������ݺ�
	 */
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
}
