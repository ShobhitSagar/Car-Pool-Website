package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.models.Find;
import com.models.Offer;
import com.models.User;
import com.service.ServiceImpl;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		ServiceImpl service = new ServiceImpl();
		RequestDispatcher rd = null;
		HttpSession session = null;
		
		if (action.equals("register")) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			int  contact = Integer.parseInt(request.getParameter("contact"));
			User user = new User(name, email, password, contact);
			service.addUser(user);
			
			rd = request.getRequestDispatcher("login.jsp");
			request.setAttribute("name", name);
			rd.forward(request, response);
		} 
		if (action.equals("viewall")) {
			List<User> allUsers = service.getAllUser();
			for (User c : allUsers) {
				out.print("<p>"+ c.getUname() +"</p>");
			}
		}
		if (action.equals("login")) {
			Boolean eflag = false;
			Boolean pflag = false;
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			List<User> allUsers = service.getAllUser();
			for (User c : allUsers) {
				if (c.getEmail().equals(email)) {
					eflag = true;
					if (c.getPassword().equals(password)) {
						pflag = true;
						break;
					}
				}
			}
			if (eflag) {
				if (pflag) {
					rd = request.getRequestDispatcher("index.jsp");
					String name = request.getParameter("email");
					request.setAttribute("name", name);
					session = request.getSession(true);
					session.setAttribute("name", name);
					rd.forward(request, response);
				} else {
					out.print("<p>Passwod not correct.</p>");
				}
			} else {
				out.print("<p>Email not correct.</p>");
			}
		}
		if (action.equals("logout")) {
			rd = request.getRequestDispatcher("index.jsp");
			session = request.getSession();
			session.removeAttribute("name");
			session.invalidate();
			rd.forward(request, response);
		}
		if (action.equals("publish_offer")) {
			String pickup = request.getParameter("pickup");
			String dropoff = request.getParameter("dropoff");
			String date = request.getParameter("date");
			String time = request.getParameter("time");
			int price = Integer.parseInt(request.getParameter("price"));
			int seats = Integer.parseInt(request.getParameter("seats"));
			Offer offer = new Offer(pickup, dropoff, date, time, price, seats);
			try {
				service.offerRide(offer);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			rd = request.getRequestDispatcher("index.jsp");
//			request.setAttribute("name", name);
			rd.forward(request, response);
		}
		
//		if (action.equals("search")) {
//			String pick = request.getParameter("pick");
//			String drop = request.getParameter("drop");
//			Find find = new Find(pick, drop);
//			try {
//				List<Find> list = service.findRide(find);
//				request.setAttribute("list", list);
//				RequestDispatcher rDispatcher = request.getRequestDispatcher("findride.jsp");
//				rDispatcher.forward(request, response);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

}
