package com.adf.bonus;

import java.util.ArrayList;

public class BonView {

	BonusDTO bdto=null;
	ArrayList<BonusDTO> bdtoList=null;
	
	public void view(BonusDTO bdto) {
		//1개 출력
		System.out.println("ename : "+bdto.getEname());
		System.out.println("job : "+bdto.getJob());
		System.out.println("sal : "+bdto.getSal());
		System.out.println("comm : "+bdto.getComm());
	}
	
	public void view(ArrayList<BonusDTO> bdtoList) {
		for(int i=0;i<bdtoList.size();i++) {
			this.view(bdtoList.get(i));
		}
	}
	
}
