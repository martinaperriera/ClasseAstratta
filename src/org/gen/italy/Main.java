package org.gen.italy;

import java.util.ArrayList;

import org.gen.italy.model.Chitarra;
import org.gen.italy.model.Pianoforte;
import org.gen.italy.model.Strumento;

public class Main {

	public static void main(String[] args) {

		
		//array di strumenti
		ArrayList<Strumento> strumenti = new ArrayList<Strumento>();
		strumenti.add(new Chitarra ("Acustica"));
		strumenti.add(new Chitarra ("Rock"));
		strumenti.add(new Pianoforte("a coda"));
	
		Chitarra c =new Chitarra("Gibson"); //creo nuova istanza chitarra 
		Pianoforte p=new Pianoforte("Organo");
		
	
		strumenti.add(new Chitarra ("Rock"));

		

		//POLIMORFISMO ciclo for per chiamare il metodo suona che nonostante il nome uguale avrà un suono diverso per ogni strumento
		for (Strumento strumento : strumenti) {
            strumento.suona();
	}

} 
}
