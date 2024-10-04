package dataStructure;

import java.util.List;



public class AlgorithmClass {

	//阶乘，与数组与列表
	public static int rec(int n) {//完全阶乘
		if(n==0) {return 1;}
		else {return n*rec(n-1);} 
	}
	public static int Jrec(int n) {//奇数阶乘
		if(n==0||n==1) {return 1;}
		else if(n%2==0) {return Jrec(n-1);}//当传入的参数为o数时，返回奇数项。
		else {return n*Jrec(n-2);} //当传入的参数为奇数是，再加一步跳过所有偶数的阶乘，注意当n==3时会有Jrec（1），你要给他返回1；
	}
	public static int Orec(int n) {//偶数阶乘
		if(n==0 ||n==1) {return 1;}
		else if(n%2!=0) {return Orec(n-1);}//当传入的参数为奇数时，退一步返回偶数项。
		else {return n*Orec(n-2);} //当传入的参数为偶数时，再加一步跳过所有奇数的阶乘，注意当n==3时会有Orec（1），你要给他返回1；
	}
	public static int rec(int n,int m) {//自定义阶乘，传入第二个参数，跳过此参数的阶乘
		if(n==0) {return 1;}
		else if(n==m) {return rec(n-1);}
		else {return n*rec(n-1,m);} 
	}
	public static int rec(int n,int[] m,int i) {//自定义阶乘，传入一个数组，跳过此数组里所有元素的阶乘
		if(n==0) {return 1;}
		else if(n==m[i]) { if(i<m.length-1){i++;}; return rec(n-1,m,i); }//这里的length-1很重要，不然当指针i会溢出数组m
		else {return n*rec(n-1,m,i);} 
	}
	public static int rec(int n,List<Integer> m,int i) {//自定义阶乘，传入一个顺序表，跳过此列表里所有元素的阶乘
		if(n==0) {return 1;}
		else if(n==m.get(i)) { if(i<m.size()-1){i++;}; return rec(n-1,m,i); }//这里的size()-1很重要，不然当指针i会溢出数组m
		else {return n*rec(n-1,m,i);} 
	}

	//堆栈（基础堆栈未完成）
	public static int[] stack;
	public static int top;
	public static void StackByArray(int stack_size){
		stack = new int[stack_size];
		top=-1;
	}  
	public static boolean push(int data) {//指定的数据压入堆栈
		if (top>stack.length) {System.out.println("stack has been filled");return false;}
		else {stack[++top]= data;return true;	}
	}
	
















}
