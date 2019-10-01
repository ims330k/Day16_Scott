package com.adf.conrtol;

import java.util.Scanner;

public class EmpController {

	//start
	//1.사원전체정보 출력
	//2.사원검색출력
	//3.종료
	Scanner sc=new Scanner(System.in);

	public void start() {

		boolean check=true;
		System.out.println("1.사원전체정보 출력 2.사원검색출력 3.종료");
		int select=sc.nextInt();

		while(check) {
			switch(select) {
			case 1:
				System.out.println("1.사원전체정보 출력");
				break;
			case 2:
				System.out.println("2.사원검색출력");
				break;
			case 3:
				System.out.println("3.종료");
				check=!check;
				break;
			default:
				System.out.println("re");
			}
		}
	}
}
