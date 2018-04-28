package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Disciplina;

public class DisciplinaDAO {

	private Connection conexao;

	public DisciplinaDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public ArrayList<Disciplina> getDisciplinas(int idprofessor){
		
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		String sql = "SELECT * FROM faculdade.disciplina WHERE idprofessor=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			ps = conexao.prepareStatement(sql);
			ps.setInt(1, idprofessor);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				disciplinas.add(new Disciplina(rs.getInt("iddisciplina"), rs.getString("nome"), rs.getString("curso"), rs.getInt("cargahoraria"), rs.getInt("idprofessor")));
			}
			
			ps.close();
			rs.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return disciplinas;
		
	}
	
}
