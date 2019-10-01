package com.adf.Dept;

import java.util.Scanner;

public class DeptInput {

	Scanner sc=new Scanner(System.in);
	
	public int input() {
		System.out.println("번호 입력");
		int num=sc.nextInt();
		
		return num;
	}
}
