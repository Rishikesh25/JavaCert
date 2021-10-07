package pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    //1.get the data from the FE   11990
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter("name");
		 String email = request.getParameter("emailid");
		 int phoneno = Integer.parseInt( request.getParameter("phoneno"));
		 
		 //2.set the data to the bean
		 EmpBean emp = new EmpBean();
		 emp.setEmpName(name);
		 emp.setEmpemailid(email);
		 emp.setEmpphoneno(phoneno);
		 
		// 3.Establish the connection with the DB & insert data
		 PrintWriter pw = response.getWriter();
		 EmpDAO dao = new EmpDAO();
		 try {
			int status = dao.insert(emp);
			
			if (status>0) {
			System.out.println(status+ "insertion successful");
				RequestDispatcher rd = request.getRequestDispatcher("RegisterDemo");
				 request.setAttribute("EmpObj", emp);
				 rd.forward(request, response);
			}
			else {
				
				pw.print(status+ "insertion Unsuccessful");
			}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 pw.close();
	
		 //3. send the info of the bean to another servlet   
		 //11990
	/*	 RequestDispatcher rd = request.getRequestDispatcher("RegisterDemo");
		 request.setAttribute("EmpObj", emp);
		 rd.forward(request, response);     */
	}

}
