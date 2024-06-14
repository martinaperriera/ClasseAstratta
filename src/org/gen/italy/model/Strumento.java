package org.gen.italy.model;

public abstract class Strumento {
	protected String nome; 
	public Strumento (String nome) {
		this.nome =nome;
	}
	public String getNome() {
		return nome;
	
	}
	public abstract void suona();

}
