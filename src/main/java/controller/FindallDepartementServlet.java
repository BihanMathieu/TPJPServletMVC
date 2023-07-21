package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartementDAO;
import dao.DepartementDAOImpl;
import modele.Departement;
import service.DepartementService;
import service.DepartementServiceImpl;

@WebServlet("/FindallDepartementServlet")
public class FindallDepartementServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private DepartementService departementService;

    public FindallDepartementServlet() {
        super();
        DepartementDAO departementDAO = new DepartementDAOImpl();
        departementService = new DepartementServiceImpl(departementDAO);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Departement> departements = departementService.findAllDepartements();
        System.out.println(departements);
        
        
        request.setAttribute("departements", departements);
        
        
        request.getRequestDispatcher("find-all-dept.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}