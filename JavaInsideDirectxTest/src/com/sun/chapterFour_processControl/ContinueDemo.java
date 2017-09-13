package com.sun.chapterFour_processControl;

import org.junit.Test;

/**
 * continue语句
 * continue语句是针对break语句的补充
 * continue不是立即跳出循环,而是跳过本次循环,回到条件测试部分,继续执行下一次循环
 * @author 飞
 * @date 2017年9月13日
 */
public class ContinueDemo {

	/**
	 * 输出0~100之间奇数和
	 */
	@Test
	public void test1() {
		//定义变量用来统计和
		int sum = 0;
		for(int x = 0;x <=100;x++) {
			if(x % 2 == 0) {
				continue;
			}
			sum+=x;
		}
		System.out.println("0~100的奇数和为:"+sum);
	}
}
