package com.sum.object.oriented;
/**
 * �ֻ�������
 * @author ��
 * @date 2017��9��25��
 */
public class PhoneDemo {
	public static void main(String[] args) {
		//��������
		Phone p = new Phone();
		//�����Ա����
		System.out.println(p.brand);
		System.out.println(p.price);
		System.out.println(p.color);
		System.out.println("-------------------");
		//��ֵ
		p.brand = "����";
		p.price = 3000;
		p.color = "��ɫ";
		
		//�ٴ������Ա����
		System.out.println(p.brand);
		System.out.println(p.price);
		System.out.println(p.color);
		//���ó�Ա����
		p.call("������");
		p.setMessage();
	}
	
	
}
