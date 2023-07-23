package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartementDAO;
import dao.DepartementDAOImpl;
import service.DepartementService;
import service.DepartementServiceImpl;

@WebServlet("/DeleteDepartementServlet")
public class DeleteDepartementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DepartementService departementService;

	public DeleteDepartementServlet() {
		super();
		DepartementDAO departementDAO = new DepartementDAOImpl();
		departementService = new DepartementServiceImpl(departementDAO);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");

		departementService.deleteDepartement(Long.parseLong(id));

		response.sendRedirect("FindallDepartementServlet");
	}
}
