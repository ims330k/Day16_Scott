package com.adf.salgrade;

import java.util.ArrayList;
import java.util.Scanner;

public class SalgradeController {

	public void start() {

		Scanner sc=new Scanner(System.in);
		SalgradeDAO sdao=new SalgradeDAO();
		
		
		
		boolean check=true;

		while(check) {
			System.out.println("1.전체조회 2.검색조회 3.추가 4.삭제");
			int select=sc.nextInt();
			int result=0;
			switch(select) {
			case 1:
				System.out.println("전체조회");
				ArrayList<SalgradeDTO> sdtoList=null;
				sdtoList=sdao.selectAll();
				//salgradeView.view(sdtoList);
				break;
			case 2:
				System.out.println("검색할 번호 입력");
				int searchNum=sc.nextInt();//int매개변수, return sdto
				SalgradeDTO sdto=new SalgradeDTO();
				sdto=sdao.selectOne(searchNum);
				//salgradeView.view(sdto);
				break;
			case 3:
				System.out.println("추가");
				System.out.println("grade : ");
				int grade=sc.nextInt();
				System.out.println("losal : ");
				int losal=sc.nextInt();
				System.out.println("hisal : ");
				int hisal=sc.nextInt();
				SalgradeDTO sdto2=new SalgradeDTO();
				result=sdao.insert(sdto2);
				if(result>0) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}
				break;
			case 4:
				System.out.println("삭제할 grade 입력");
				int num=sc.nextInt();
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
