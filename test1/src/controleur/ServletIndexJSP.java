package controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import services.ComposantPanier;
import services.GestionPanier;
import services.GestiondeLogin;
import Modele.Panier;

/**
 * Servlet implementation class ServletIndex_JSP
 */
public class ServletIndexJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Panier panier = new Panier();
       
    
    public ServletIndexJSP() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//R�cup�rer les param�tres	
		String Nom= request.getParameter("leNom");
		PrintWriter out = 	response.getWriter();

		out.println(Nom);
		GestionPanier cp= new ComposantPanier();
		
		//R�cup�rer la session et y mettre le nom et le panier		
			HttpSession session = request.getSession();
			session.setAttribute("leNom", Nom);
			session.setAttribute("service",cp);
			
			
			// Aller vers la JSPde suite
			getServletContext().getRequestDispatcher("/ajout.jsp").forward(request, response);
			
	}

}
