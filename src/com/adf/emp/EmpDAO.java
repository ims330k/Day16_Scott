package com.adf.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.adf.util.DBConnector;

public class EmpDAO {

	DBConnector dbConnector =new DBConnector();
	Connection con=null;
	PreparedStatement st=null;
	ResultSet rs=null;
	EmpDTO dto=null;
	ArrayList<EmpDTO> dtolist=null;
	
	public ArrayList<EmpDTO> getSelectList() {
		//전체사원정보 - 최신 입사일순
		try {
			dtolist=new ArrayList<EmpDTO>();
			con=dbConnector.getConnect();
			String sql="select empno, ename, job, mgr, hiredate, sal, nvl(comm, 0) as comm, deptno from emp order by hiredate desc";
			st=con.prepareStatement(sql);
			rs=st.executeQuery();
			//st.setInt(1, deptno);			
			//rs=st.executeQuery();
			while(rs.next()) {
				dto=new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDptno(rs.getInt("deptno"));
				
				dtolist.add(dto);
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dtolist;
	}
	
	public EmpDTO getSelectOne(int empno) {
		//getSelectOne()
		//매개변수로 사원번호 
		try {
			con=dbConnector.getConnect();
			
			//같은 사원번호 찾기 
			String sql="select empno, ename, job, mgr, hiredate, sal, nvl(comm, 0) as comm, deptno from emp where empno=?";
			st=con.prepareStatement(sql);
			
			st.setInt(1, empno);
			
			rs=st.executeQuery();
			
			if(rs.next()) {
				dto=new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getNString("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDptno(rs.getInt("deptno"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return dto;
	}
	
	
}
