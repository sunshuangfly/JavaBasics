package com.sun.method;
/**
 * дһ������,�����е�ˮ�ɻ�����ӡ����
 * ˮ�ɻ���:����λ�ϵ�������������ӵ���������������λ��
 * @author ��
 * @date 2017��9��16��
 */
public class MethodTest5 {
	public static void main(String[] args) {
		printFlower();
	}
	
	/**
	 * ��ӡ���е�ˮ�ɻ���
	 * ������ȷ:
	 * 	����ֵ����:void
	 * 	�����б�:�޲���
	 */
	public static void printFlower() {
		for(int x=100;x<1000;x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/100%10;
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x) {
				System.out.println(x);
			}
		}
	}
}
