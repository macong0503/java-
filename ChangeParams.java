package com.fs.test;

import java.util.Arrays;

public class ChangeParams {

	/*
	 * 可变参数与数组作为方法参数时的区别：
	 * 1、从个数来看：可变参数字能有一个，数组可以有多个
	 * 2、从定义位置来看：可变参数只能定义在列表的末尾，数组可以在任意位置
	 * show(String s ,char c,int...a)
	 * show(int a[],String s,char c[])
	 * 3、从传参的形式来看：
	 * （1）、可变参数可以传 数组、null、0个参数、1到多个参数
	 * （2）、数组可以传 数组引用、数组对象、null
	 */
	
	public void show(int...a){
		System.out.println("a的长度为：" + a.length);
		
		//遍历每一个参数
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		
		//排序
		Arrays.sort(a);
		System.out.println("排序后");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ChangeParams cp = new ChangeParams();
		//传递零个参数
		//cp.show();

		//传递null值,但是这个参数不可用
		//cp.show(null);
		
		//传递一个数组对象
		//cp.show(new int[]{10,2,32});
		
		//传递1到多个元素，会被当成数组处理
		cp.show(2,4,3,6);
	}


}