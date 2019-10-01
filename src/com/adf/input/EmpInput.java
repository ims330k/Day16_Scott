package com.adf.input;

import java.util.Scanner;

public class EmpInput {

	private Scanner sc;
	
	public EmpInput() {
		sc=new Scanner(System.in);
	}
	
	public int empnoInput() {
		//empnoInput()
		//사원번호를 입력하세요
		System.out.println("사원번호 입력");
		int no=sc.nextInt();
		
		return no;
	}
	
}
