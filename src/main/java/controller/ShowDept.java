package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.DeptPair;
import service.NumDeptMapper;

/**
 * Servlet implementation class ShowDept
 */
@WebServlet("/ShowDept")
public class ShowDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDept() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        String departement = request.getParameter("departement");

        departement = departement.trim();

        String address;

        if (departement.isEmpty()) {
            address = "/WEB-INF/results/missing-num.jsp";
        } else {
            NumDeptMapper deptMapper = new NumDeptMapper();
            String nomDept = deptMapper.findDept(departement);

            DeptPair deptPair = new DeptPair(departement, nomDept);
            
            if (nomDept != null) {
                request.setAttribute("deptPair", deptPair);
                address = "/WEB-INF/results/show-departement.jsp";
            } else {
                request.setAttribute("deptPair", deptPair);
                address = "/WEB-INF/results/unknown-num.jsp";
            }
        }
        request.getRequestDispatcher(address).forward(request, response);
	}

}