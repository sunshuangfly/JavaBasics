package com.sum.object.oriented;
/**
 * �ֻ���:
 * 		��Ա����:Ʒ��,�۸�,��ɫ
 * 		��Ա����:��绰,������
 * @author ��
 * @date 2017��9��25��
 */
public class Phone {
	//Ʒ��
	String brand;
	int price;
	String color;
	
	//��绰
	public void call(String name) {
		System.out.println("��"+name+"��绰");
	}
	
	//������
	public void setMessage() {
		System.out.println("������");
	}
}
