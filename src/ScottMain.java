import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.adf.Dept.DeptController;
import com.adf.Dept.DeptDAO;
import com.adf.Dept.DeptDTO;
import com.adf.Dept.DeptView;
import com.adf.conrtol.EmpController;
import com.adf.emp.EmpDAO;
import com.adf.emp.EmpDTO;
import com.adf.util.DBConnector;
import com.adf.view.Empview;

public class ScottMain {

	public static void main(String[] args) {

		ArrayList<EmpDTO> dtolist=null;
		DBConnector dbcConnector = new DBConnector();
		Connection con=null;
		//EmpDAO dao=new EmpDAO();
		//EmpDTO dto=new EmpDTO();
		Empview ev=new Empview();
		DeptDTO dto=new DeptDTO();
		DeptDAO dao=new DeptDAO();
		DeptView dv=new DeptView();
		EmpController controller=new EmpController();
		DeptController deptController=new DeptController();
		try {
			//controller.start();
			//con=dbcConnector.getConnect();
			
			//dtolist=dao.getSelectList();	//list
			//ev.view(dtolist);
			
			//dto=dao.getSelectOne(7566);	//테스트용
			//ev.view(dto); 	//ok
			
			//dto=dao.selectOne(55);	//dto 반환
			//dv.view(dto);
			deptController.start();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
