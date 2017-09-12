package com.sun.chapterThree;
/**
 * 实现将unicode表中某些位置上的字符一级一些字符在unicode表中的位置在控制台输出
 * 
 * @author Administrator
 *
 */
public class charType {

	public static void main(String[] args) {
		char word1 = 'd',word2='@';
		int p = 23423,p2 = 43543;
		System.out.println("d在unicode表总的顺序位置是:"+(int)word1);
		System.out.println("@在unicode表总的顺序位置是:"+(int)word1);
		System.out.println("unicode表中第23423位是:"+(char)p);
		System.out.println("unicode表中第43543位是:"+(char)p2);
	}
}
