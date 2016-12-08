package controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pizzeria.factory.fabrique.FabriqueAlger;
import com.pizzeria.factory.fabrique.FabriqueParis;
import com.pizzeria.factory.pizza.Pizza;
import com.pizzeria.factory.test.Pizzeria;

/**
 * Servlet implementation class ServletPizzeria
 */
public class ServletPizzeria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPizzeria() {
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
		//doGet(request, response);
		HttpSession session=request.getSession();
		
		String pizzerya=request.getParameter("pizzeria");
		String ville=request.getParameter("ville");
		String codee=request.getParameter("code");
		
		
		PrintWriter out=response.getWriter();
		
		
		int id=(int) Math.random();
		
		if(ville.equals("paris")){
			Pizzeria p=new Pizzeria(new FabriqueParis());
			
			Pizzeria pizzeria =new Pizzeria(id, pizzerya, ville, Integer.parseInt(codee)); 

			Pizza pp=p.commanderPizza("fromage");
			FabriqueParis fab = new FabriqueParis();
			fab.insertionPizzeria(pizzeria);
	
		}
		else if(ville.equals("alger")){
			Pizzeria p=new Pizzeria(new FabriqueAlger());	
			Pizzeria pizzeria =new Pizzeria(id, pizzerya, ville, Integer.parseInt(codee)); 

			Pizza pp=p.commanderPizza("fromage");
			p.commanderPizza("fruits");
			FabriqueAlger fab = new FabriqueAlger();
			fab.insertionPizzeria(pizzeria);

		}
		//créer fabrique
		
		//insérer l'element après instanciation de l'objet avec paramètres
		out.println(pizzerya);
		out.println(ville);
		getServletContext().getRequestDispatcher("/Pizzeria.jsp").forward(request, response);
	}

}
