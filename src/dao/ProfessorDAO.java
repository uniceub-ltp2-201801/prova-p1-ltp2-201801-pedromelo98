package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Professor;

public class ProfessorDAO {

	private Connection conexao;

	public ProfessorDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public ArrayList<Professor> getProfessores() {

		ArrayList<Professor> professores = new ArrayList<Professor>();
		String sql = "SELECT * FROM professor ORDER BY nome";
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			ps = conexao.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				professores.add(new Professor( rs.getInt("idprofessor"), rs.getString("nome"), rs.getDate("datanasc"), rs.getString("nomemae"), rs.getInt("titulacao")));
			}
			
			ps.close();
			rs.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return professores;
	}

}
