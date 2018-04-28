package model;


public class Disciplina {

	private int iddisciplina;
	private String nome;
	private String curso;
	private int cargahoraria;
	private int idprofessor;
	
	
	
	
	public Disciplina(int iddisciplina, String nome, String curso, int cargahoraria, int idprofessor) {
		super();
		this.iddisciplina = iddisciplina;
		this.nome = nome;
		this.curso = curso;
		this.cargahoraria = cargahoraria;
		this.idprofessor = idprofessor;
	}
	
	public int getIddisciplina() {
		return iddisciplina;
	}
	public void setIddisciplina(int iddisciplina) {
		this.iddisciplina = iddisciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	public int getIdprofessor() {
		return idprofessor;
	}
	public void setIdprofessor(int idprofessor) {
		this.idprofessor = idprofessor;
	}
	
}
