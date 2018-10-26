package br.com.crmonline.Entidades;


public class Usuario {
	
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Usuario(Integer codigo, String nif, String nome, String email, String sexo, String password, Integer statu,
			Integer tipo_user) {
		this.codigo = codigo;
		this.nif = nif;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.password = password;
		this.statu = statu;
		this.tipo_user = tipo_user;
	}


	private Integer codigo;
	private String nif;
	private String nome;
	private String email;
	private String sexo;
	private String password;
	private Integer statu = 1;
	private Integer tipo_user = 0;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatu() {
		return statu;
	}
	public void setStatu(Integer statu) {
		this.statu = statu;
	}
	public Integer getTipo_user() {
		return tipo_user;
	}
	public void setTipo_user(Integer tipo_user) {
		this.tipo_user = tipo_user;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
