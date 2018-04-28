package control;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Conexao;
import dao.ProfessorDAO;
import model.Professor;

@WebServlet("/ServletListarProfessores")
public class ServletListarProfessores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conexao = Conexao.getConexao();
		
		ProfessorDAO pd = new ProfessorDAO(conexao);
		
		ArrayList<Professor> professores = pd.getProfessores();
		
		request.setAttribute("professores", professores);
		
		RequestDispatcher rd = request.getRequestDispatcher("listarProfessores.jsp");
		rd.forward(request, response);
		
		
		
	}

}
