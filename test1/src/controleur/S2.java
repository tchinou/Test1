package controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import services.ComposantPanier;
import services.GestionPanier;
import Modele.Panier;
import Modele.Produit;

/**
 * Servlet implementation class S2
 */
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
				
		//R�cup�rer les param�tres depuis la jsp et creer un nouvel article
		
		String article = request.getParameter("article");
		String prix = request.getParameter("prix");
		GestionPanier cp = (ComposantPanier) session.getAttribute("service");
		
		Produit p = new Produit (1,article, Integer.parseInt(prix));
		cp.insertProduit(p);
		
		
	
		
		//depart vers la jsp suivante
		getServletContext().getRequestDispatcher("/ajout.jsp").forward(request, response);
				
				
	}

}
