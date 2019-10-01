package com.adf.Dept;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptController {

	Scanner sc=new Scanner(System.in);
	DeptDAO dao=new DeptDAO();
	DeptDTO dto=null;
	DeptView dv=new DeptView();
	DeptInput di=new DeptInput();
	ArrayList<DeptDTO> dtolist=null;
	public void start() {

		boolean check=true;
		int num=0;

		while(check) {
			num=0;
			System.out.println("1.사원전체정보 출력 2.사원검색출력 3.종료");
			int select=sc.nextInt();
			int search=0;	//검색할 때마다 초기화
			dto=new DeptDTO();
			switch(select) {
			case 1:
				System.out.println("1.사원전체정보 출력");
				dtolist=dao.getselectList();
				dv.view(dtolist);
				break;
			case 2:
				System.out.println("2.사원검색출력");
				
				//dto 반환
				dv.view(dao.selectOne(di.input()));		//??????????????????????????????????????????????????????????????????????
				
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
