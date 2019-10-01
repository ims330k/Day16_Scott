package com.adf.Dept;

import java.util.ArrayList;

public class DeptView {

	public void view(DeptDTO dto) {
		if(dto!=null) {
			System.out.println("DEPTNO :"+dto.getDeptno());
			System.out.println("DNAME : "+dto.getDname());
			System.out.println("LOC : "+dto.getLoc());
		}
		else {
			System.out.println("찾는 정보가 없습니다.");
		}
	}
	
	public void view(ArrayList<DeptDTO> dtolist) {
		for(int i=0; i<dtolist.size();i++) {
			this.view(dtolist.get(i));
			System.out.println("-----------------------------");
		}
	}
}
