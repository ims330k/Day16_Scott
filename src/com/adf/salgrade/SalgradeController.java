package com.adf.salgrade;

import java.util.ArrayList;
import java.util.Scanner;

public class SalgradeController {

	public void start() {

		Scanner sc=new Scanner(System.in);
		SalgradeDAO sdao=new SalgradeDAO();
		SalgradeView sv=new SalgradeView();
		SalgradeInput si=new SalgradeInput();
		
		
		
		boolean check=true;

		while(check) {
			ArrayList<SalDTO> sdtoList=null;
			System.out.println("1.전체조회 2.검색조회 3.추가 4.삭제");
			int select=sc.nextInt();
			int result=0;
			switch(select) {
			case 1:
				System.out.println("전체조회");
				sdtoList=sdao.selectAll();
				sv.view(sdtoList);
				break;
			case 2:
				System.out.println("검색할 번호 입력");
				int searchNum=sc.nextInt();//int매개변수, return sdto
				SalDTO sdto=new SalDTO();
				sdto=sdao.selectOne(searchNum);
				sv.view(sdto);
				break;
			case 3:
				
				sdto=si.salInsert();
				sdtoList.add(sdto);

			case 4:
				int num=si.salDelete();
				result=sdao.delete(num);
				if(result>0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				
			case 5:
				System.out.println("종료");
				check=!check;
				break;
			default:
				System.out.println("다시 입력");
			}
		}


	}

}
