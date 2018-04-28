package model;

import java.sql.Date;

public class Professor {
	
	private int idprofessor;
	private String nome;
	private Date datanasc;
	private String nomemae;
	private int titulacao;
	
	
	public Professor(int idprofessor, String nome, Date datanasc, String nomemae, int titulacao) {
		super();
		this.idprofessor = idprofessor;
		this.nome = nome;
		this.datanasc = datanasc;
		this.nomemae = nomemae;
		this.titulacao = titulacao;
	}
	
	public int getIdprofessor() {
		return idprofessor;
	}
	
	public void setIdprofessor(int idprofessor) {
		this.idprofessor = idprofessor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDatanasc() {
		return datanasc;
	}
	
	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}
	
	public String getNomemae() {
		return nomemae;
	}
	
	public void setNomemae(String nomemae) {
		this.nomemae = nomemae;
	}
	
	public int getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(int titulacao) {
		this.titulacao = titulacao;
	}
	

}
