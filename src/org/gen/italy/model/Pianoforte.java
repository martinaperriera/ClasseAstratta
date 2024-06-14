package org.gen.italy.model;

public class Pianoforte extends Strumento {

	public Pianoforte(String nome) {
		super(nome);
	}
	@Override
	public void suona() {
        System.out.println("Il pianoforte " + getNome() + " fa: ♩ ♬ ♩ ♬ ♩ ♬ ♩");

	}

}
