package com.sun.method;
/**
 * �Ƚ����������Ƿ����,�������ͷֱ�Ϊ����bute����
 * ����short����,����int����,����long����
 * @author ��
 * @date 2017��9��16��
 */
public class MethodTest6 {
	public static void main(String[] args) {
		//���ò���Ϊbyte���͵�compare����
		boolean result = compare(2, 10);
		System.out.println(result);
		
		//���ò���Ϊshort���͵�compare����
		boolean result2 = compare(12, 34);
		System.out.println(result2);
	
		//���ò���Ϊint���͵�compare����
		boolean result3 = compare(435, 435);
		System.out.println(result3);
	
		//���ò���Ϊlong���͵�compare����
		boolean result4 = compare(34234l, 432l);
		System.out.println(result4);
	}
	
	//byte���ͷ���
	public static boolean compare(byte a,byte b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
	//short���ͷ���
	public static boolean compare(short a,short b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
	//int���ͷ���
	public static boolean compare(int a,int b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
	//long���ͷ���
	public static boolean compare(long a,long b) {
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
}
