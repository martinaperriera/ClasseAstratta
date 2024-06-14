package org.gen.italy.model;

public class Chitarra extends Strumento {

	public Chitarra(String nome) {
		super(nome);
	}


	@Override
	public void suona() {
		System.out.println("La chitarra " + getNome() + " fa: ♬ ♬ ♬ ");
	}
	
}
