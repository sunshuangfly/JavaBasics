package com.sun.array;
/**
 * ��ά�������ԭ��
 * @author ��
 * @date 2017��9��15��
 */
public class DoubleDimensionalArray {
	public static void main(String[] args) {
		//�����λ����
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		//ԭʼ��ȡ��ά�����е�Ԫ��
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
//		System.out.println(arr[2][0]);
//		System.out.println(arr[2][1]);
//		System.out.println(arr[2][2]);
		
	/*	//ѭ����ȡ��һ��һά����
		for (int i = 0; i < arr[0].length; i++) {
			System.out.println(arr[0][i]);
		}
		//ѭ����ȡ�ڶ���һά����
		for (int i = 0; i < arr[1].length; i++) {
			System.out.println(arr[1][i]);
		}
		//ѭ����ȡ������һά����
		for (int i = 0; i < arr[2].length; i++) {
			System.out.println(arr[2][i]);
		}*/
		
		/*//ͨ����������ѭ��,���Ա�������ά����������Ԫ��,��ô������ѭ����������Ҫ��������
		//��ѭ����������ά���������е�һά����
		for (int i = 0; i < 3; i++) {
			//��ѭ����arr[i].lengthΪÿ��һά����ĸ���,�±��0��ʼ,����ҪС�ڸ���
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}*/
		
		//������������������д��������,��������ٽ��иĽ�
		//��ά����ĳ��Ⱦ���һά����ĸ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
		System.out.println();
	}
	
}
