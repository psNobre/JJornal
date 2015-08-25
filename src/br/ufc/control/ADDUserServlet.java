package br.ufc.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.dao.UserDAO;
import br.ufc.model.User;

/**
 * Servlet implementation class ADDUserServlet
 */
@WebServlet("/ADDUserServlet")
public class ADDUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ADDUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String nome = request.getParameter("nome");
    	String email = request.getParameter("email");
    	String login = request.getParameter("login");
    	String senha = request.getParameter("senha");
    	
    	User user = new User();
    	user.setNome(nome);
    	user.setEmail(email);
    	user.setLogin(login);
    	user.setSenha(senha);
    
    	UserDAO dao = new UserDAO();
    	dao.salvar(user);
    	
    	response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		PrintWriter out = response.getWriter();
		out.println(" Contato adicionado com sucesso");

	}

}
