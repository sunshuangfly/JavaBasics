package com.sun.array;
/**
 * 二维数组遍历原理
 * @author 飞
 * @date 2017年9月15日
 */
public class DoubleDimensionalArray {
	public static void main(String[] args) {
		//定义二位数组
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		//原始获取二维数组中的元素
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
//		System.out.println(arr[2][0]);
//		System.out.println(arr[2][1]);
//		System.out.println(arr[2][2]);
		
	/*	//循环获取第一个一维数组
		for (int i = 0; i < arr[0].length; i++) {
			System.out.println(arr[0][i]);
		}
		//循环获取第二个一维数组
		for (int i = 0; i < arr[1].length; i++) {
			System.out.println(arr[1][i]);
		}
		//循环获取第三个一维数组
		for (int i = 0; i < arr[2].length; i++) {
			System.out.println(arr[2][i]);
		}*/
		
		/*//通过上面三次循环,可以遍历出二维数组中所有元素,那么可以用循环来控制需要遍历几次
		//外循环遍历出二维数组中所有的一维数组
		for (int i = 0; i < 3; i++) {
			//内循环中arr[i].length为每个一维数组的个数,下标从0开始,所以要小于个数
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}*/
		
		//上面遍历中条件语句是写死的数据,这里可以再进行改进
		//二维数组的长度就是一维数组的个数
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
		System.out.println();
	}
	
}
