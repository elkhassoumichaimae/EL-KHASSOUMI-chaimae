package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.User;

import com.dao.UserDao;
import com.dao.livreDao;
import com.model.livre;

/**
 * Servlet implementation class Livre
 */
@WebServlet("/index2")
public class Livre extends HttpServlet {
	private static final long serialVersionUID = 1L;
     livreDao pm; 
     
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Livre() {
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
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	
	
	
	
	}
	
	
	
	
	
	
	

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession ses = request.getSession(false);
//	User u=(User) ses.getAttribute("user");
//out.print("Bonjour Mr ."+u.getNom());
//		
		
	
	out.print("<h1>Gestion des livres</h1>");

    int idl=0;
	String tit="";
	String cat="";
	int nbp=0;
	String aut="";
	String act="Ajouter";
	
	
	
	if (request.getParameter("op")!=null)
	{ 
		if(request.getParameter("op").equals("edit"))
		{
			act="Modifier";
	     idl= Integer.parseInt(request.getParameter("idl"));
		livre p=pm.findlivreById(idl);
		tit=p.getTitre();
		cat= p.getCatégorie();
		nbp= p.getNbpages();
		aut=p.getAuteur();
		
		
		
	      }
	}
	out.print("<form action='serv1' method='post' ><table>");
	out.print("<tr><td>ID:</td><td><input type='number' readonly name='idl'value='"+idl+"'/></td></tr>");
	
	out.print("<tr><td>Titre:</td><td><input type='text' name='titre'value='"+tit+"'/></td></tr>");
	out.print("<tr><td>Catégorie:</td><td><input type='text' name='catégorie' value='"+cat+"'/></td></tr>");
	out.print("<tr><td>nbpages:</td><td><input type='number' name='nombre_page' value='"+nbp+"'/></td></tr>");
	out.print("<tr><td>Auteur:</td><td><input type='text' name='auteur' value='"+aut+"'/></td></tr>");
	out.print("<tr><td><input type='submit'value='"+act+"' name='add'/></td><td><input type='reset' value='Annuler'name='add'/></td></tr><br/>");

	out.print("</table><form>");
	out.print("<hr/>");
	
	
	List<livre> ps = pm.allivre();
	out.print("<table width = '100%' bgcolor='pink'biorder='2px'>");
	out.print("<thead><tr><th>idl</th><th>Titre</th><th>Catégorie</th><th>Nbr_pages</th><th>Auteur</th><th></th><th></th></tr><thead>");
	out.print("<tbody>");
	for (livre p : ps) {
	out.print("<tr>");
	out.print("<td>"+p.getIdl()+"</td>");
	out.print("<td>"+p.getTitre() +"</td>");
	out.print("<td>"+p.getCatégorie()+"</td>");
	out.print("<td>"+p.getNbpages()+"</td>");
	out.print("<td>"+p.getAuteur()+"</td>");
	 
	
	out.print("<td><a href='serv1?idl="+p.getIdl()+"'>Delet</a></td>");
	out.print("<td><a href='?op=edit&idl="+p.getIdl()+"'>Update</a></td>");

	out.print("</tr>");
	}
	out.print("</tbody>");
	out.print("</table>");


	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
