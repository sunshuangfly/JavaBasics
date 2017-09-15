package com.sun.chapterSix_Array;
/**
 * ֱ��ѡ������
 * �ȴ�������ѡ��������С��ֵ,������ǰ�����̶�λ��,
 * Ȼ��ȡ������һ��������һ�����������бȽ�,���մ�С˳�����,����ִ����ȥ
 * @author ��
 * @date 2017��9��15��
 */
public class SelectSort {

	public static void main(String[] args) {
		//��������
		int[] array = {23,5,43,56,7,24,78};
		//�����������
		SelectSort sort = new SelectSort();
		//����ֱ��ѡ�����򷽷�
		sort.selectSort(array);
		//���ñ���������ӡ
		sort.print(array);
	}

	private void print(int[] array) {
		// ��������
		for (int i : array) {
			System.out.print(">"+i);
		}
		System.out.println();
	}

	private void selectSort(int[] array) {
		//������ʱ����
		int index;
		for (int i = 1; i < array.length; i++) {
			index = 0;
			for (int j = 1; j <= array.length-i; j++) {
				if(array[j] > array[index]) {
					index = j;
				}
			}
			int temp = array[array.length-i];
			array[array.length-i] = array[index];
			array[index] = temp;
			
		}
		print(array);
	}
}
