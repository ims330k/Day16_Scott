package com.adf.conrtol;

import java.util.ArrayList;
import java.util.Scanner;

import com.adf.emp.EmpDAO;
import com.adf.emp.EmpDTO;
import com.adf.view.Empview;

public class EmpController {

	//start
	//1.사원전체정보 출력
	//2.사원검색출력
	//3.종료
	Scanner sc=new Scanner(System.in);
	EmpDTO dto=new EmpDTO();
	EmpDAO dao=new EmpDAO();
	Empview ev=new Empview();
	ArrayList<EmpDTO> dtolist=new ArrayList<EmpDTO>();

	public void start() {

		boolean check=true;

		while(check) {
			
			System.out.println("1.사원전체정보 출력 2.사원검색출력 3.종료");
			int select=sc.nextInt();
			int search=0;	//검색할 때마다 초기화
			switch(select) {
			case 1:
				System.out.println("1.사원전체정보 출력");
				dtolist=dao.getSelectList();
				ev.view(dtolist);
				break;
			case 2:
				System.out.println("2.사원검색출력");
				search=sc.nextInt();
				dto=dao.getSelectOne(search);
				ev.view(dto);
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
