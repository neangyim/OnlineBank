package co.simplon.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConsulterCompte
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	//private BanqueMetier banqueMetier = null;
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		//je dois vérifier s'il login et password correspondent à qq en base de donné
		//UserDao userDao = new UserDao();
		
		//User user = userDao.isValidLogin(login,password);
		
		//if(user != null) {
		
		if(login.equals("toto") && password.equals("123")) {
			HttpSession session = request.getSession(true);
			session.setAttribute("user", null);	
			request.getRequestDispatcher("vue.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
			
	}

}
