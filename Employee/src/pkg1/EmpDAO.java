package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAO {
          //CRUD operations create , update , delete, retrieval of data
	      // insert,select, update, delete in SQL
	
	int insert (EmpBean emp) throws ClassNotFoundException, SQLException {
		
	Connection con =  DBUtil.getConnection();
	String sql= "insert into empTab values(?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, emp.getEmpName());
	ps.setString(2, emp.getEmpemailid());
	ps.setInt(3, emp.getEmpphoneno());
	

	return ps.executeUpdate(); //1 row inserted
	
	
	
}}
