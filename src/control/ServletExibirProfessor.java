package control;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Conexao;
import dao.DisciplinaDAO;
import model.Disciplina;
import model.Professor;

@WebServlet("/ServletExibirProfessor")
public class ServletExibirProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nomeprofessor");
		String nomemae = request.getParameter("nomemae");
		int titulacao = Integer.parseInt(request.getParameter("titulacao"));
		Date datanasc = Date.valueOf(request.getParameter("datanasc"));
		
		Connection conexao = Conexao.getConexao();
		
		DisciplinaDAO dd = new DisciplinaDAO(conexao);
		
		ArrayList<Disciplina> disciplinas = dd.getDisciplinas(id);
		
		Professor p = new Professor(id, nome, datanasc, nomemae, titulacao);

		System.out.println(disciplinas);
		
		request.setAttribute("professor", p);
		request.setAttribute("disciplinas", disciplinas);
		
		RequestDispatcher rd = request.getRequestDispatcher("exibirProfessor.jsp");
		rd.forward(request, response);
		
	}

}
