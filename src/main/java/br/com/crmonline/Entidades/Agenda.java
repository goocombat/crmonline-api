package br.com.crmonline.Entidades;

import java.util.Date;

public class Agenda {

	public Agenda() {
		
	}

	private Integer codigo;
	private String nome;
	private String atendente;
	private Date data;
	private String hora;
	private Integer id_visitante = 1;
	private Integer estadovisita = 0;
	private String classificacao;
	private String observacao;
	private Integer id_cliente;
	private Integer curso;

	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Integer getId_visitante() {
		return id_visitante;
	}

	public void setId_visitante(Integer id_visitante) {
		this.id_visitante = id_visitante;
	}

	public Integer getEstadovisita() {
		return estadovisita;
	}

	public void setEstadovisita(Integer estadovisita) {
		this.estadovisita = estadovisita;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

}
