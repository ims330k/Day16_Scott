package com.adf.Dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.adf.util.DBConnector;

public class DeptDAO {

	DBConnector dbConnector=new DBConnector();
	Connection con=null;
	PreparedStatement st=null;
	ResultSet rs=null;
	DeptDTO dto=null;
	 ArrayList<DeptDTO> dtolist=null;
	
	//selectOne(int num) return DTO
	public DeptDTO selectOne(int deptno) {
	
		try {
			con=dbConnector.getConnect();
			String sql="select * from dept where deptno=?";
			st=con.prepareStatement(sql);
			st.setInt(1, deptno);
			rs=st.executeQuery();
			
			if(rs.next()) {
				dto=new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
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
		
		return dto;
	}
	//getselectList(arrayList list) return list
	public ArrayList<DeptDTO> getselectList() {
		try {
			String sql="select * from dept";
			con=dbConnector.getConnect();
			st=con.prepareStatement(sql);
			rs=st.executeQuery();
			dtolist=new ArrayList<DeptDTO>();
			DeptDTO dto=null;
			while(rs.next()) {
				dto=new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
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
	
}
