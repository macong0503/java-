package com.fs.test;

import java.util.Arrays;

public class ChangeParams {

	/*
	 * �ɱ������������Ϊ��������ʱ������
	 * 1���Ӹ����������ɱ����������һ������������ж��
	 * 2���Ӷ���λ���������ɱ����ֻ�ܶ������б��ĩβ���������������λ��
	 * show(String s ,char c,int...a)
	 * show(int a[],String s,char c[])
	 * 3���Ӵ��ε���ʽ������
	 * ��1�����ɱ�������Դ� ���顢null��0��������1���������
	 * ��2����������Դ� �������á��������null
	 */
	
	public void show(int...a){
		System.out.println("a�ĳ���Ϊ��" + a.length);
		
		//����ÿһ������
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		
		//����
		Arrays.sort(a);
		System.out.println("�����");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ChangeParams cp = new ChangeParams();
		//�����������
		//cp.show();

		//����nullֵ,�����������������
		//cp.show(null);
		
		//����һ���������
		//cp.show(new int[]{10,2,32});
		
		//����1�����Ԫ�أ��ᱻ�������鴦��
		cp.show(2,4,3,6);
	}


}