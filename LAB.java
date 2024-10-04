package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class LAB {

	public static void main(String[] args) {
		System.out.println("完全递归"+AlgorithmClass.rec(9));//完全递归
		System.out.println("奇数递归"+AlgorithmClass.Jrec(5));//奇数阶乘
		System.out.println("偶数递归"+AlgorithmClass.Orec(6));//偶数阶乘
		System.out.println("跳过递归"+AlgorithmClass.rec(9,4));//跳过某数的递归
		int[]a= {4,3,2};
		System.out.println("跳过某些数的递归"+AlgorithmClass.rec(5, a,0));//跳过某数组的递归
		List<Integer> b = new ArrayList<>();
		b.add(3);b.add(2);
		System.out.println("跳过某些数的递归"+AlgorithmClass.rec(5, b,0));//跳过某数组的递归
	}
	
	
	
}
