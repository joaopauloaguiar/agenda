package com.tcc.git;

public class Agenda {
	
	private String nome;
	
	private String numero;
	
	public Agenda (){
		this.nome = "Joao";
		this.numero = "(85)8888-8888";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
