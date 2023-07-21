//package controller;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import dao.DepartementDAO;
//import dao.DepartementDAOImpl;
//import modele.Departement;
//import service.DepartementService;
//import service.DepartementServiceImpl;
//
//@WebServlet("/UpdateDepartementServlet")
//public class UpdateDepartementServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//    
//    private DepartementService departementService;
//
//    public UpdateDepartementServlet() {
//        super();
//        DepartementDAO departementDAO = new DepartementDAOImpl();
//        departementService = new DepartementServiceImpl(departementDAO);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String id = request.getParameter("id");
//        Long idParam = Long.parseLong(id);
//        
//        Departement departement = departementService.findDepartementByNum(idParam);
//        
//        
//        request.setAttribute("departement", departement);
//        
//        
//        request.getRequestDispatcher("update_departement.jsp").forward(request, response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	 String id = request.getParameter("id");
//    	    if (id != null && !id.isEmpty()) {
//    	        String deptNum = request.getParameter("deptNum");
//    	        String deptName = request.getParameter("deptName");
//
//    	        
//    	        Departement departement = departementService.findDepartementByNum(Long.parseLong(id));
//    	        if (departement != null) {
//    	           
//    	            departement.setDeptName(deptName);
//    	            departementService.updateDepartement(deptNum, departement.getDeptNum(), deptName);
//    	        }
//    	    }
//
//    	    
//    	    response.sendRedirect("FindallDepartementServlet");
//    }
//}
