package com.adf.view;

import java.util.ArrayList;

import com.adf.emp.EmpDTO;

public class Empview {

	public void view(EmpDTO dto) {
		System.out.println("empno : "+dto.getEmpno());
		System.out.println("ename : "+dto.getEname());
		System.out.println("job : "+ dto.getJob());
		System.out.println("mgr : "+ dto.getMgr());
		System.out.println("hiredate : "+ dto.getHiredate());
		System.out.println("sal : "+ dto.getSal());
		System.out.println("comm : "+ dto.getComm());
		System.out.println("deptno : "+dto.getDptno());
	}
	public void view(ArrayList<EmpDTO> dtolist) {
		
		for(int i=0;i<dtolist.size();i++) {
			System.out.println(dtolist.get(i).getEmpno());
			System.out.println(dtolist.get(i).getEname());
			System.out.println(dtolist.get(i).getJob());
			System.out.println(dtolist.get(i).getMgr());
			System.out.println(dtolist.get(i).getHiredate());
			System.out.println(dtolist.get(i).getSal());
			System.out.println(dtolist.get(i).getComm());
			System.out.println(dtolist.get(i).getDptno());
			System.out.println("------------");
		}
	}
	
}
