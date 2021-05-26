package com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.livreDao;
import com.model.livre;

/**
 * Servlet implementation class serv1
 */
@WebServlet("/serv1")
public class serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       livreDao pm;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	pm=new livreDao();
	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int idl= Integer.parseInt(request.getParameter("idl"));
		pm.deletlivre(idl);
		response.sendRedirect("index2");
		  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String titre=request.getParameter("titre");
		String catégorie=request.getParameter("catégorie");
		int nombre_page=Integer.parseInt(request.getParameter("nombre_page"));
		String auteur=request.getParameter("auteur");
//	if(request.getParameter("act").equalsIgnoreCase("ajouter"))
//		{
		        pm.addlivre(titre,catégorie,nombre_page,auteur);
		        response.sendRedirect("index2");
//		}else
//				if(request.getParameter("act").equalsIgnoreCase("Modifier"))
//				{			
//			
//					int idl=Integer.parseInt(request.getParameter("idl"));
//                    
//					livre p=new livre(titre, catégorie, idl, auteur);
//				    pm.updatelivre(idl, p);	
//				   
//				    response.sendRedirect("index2");
//				}
					
					
					
		
	}

}
