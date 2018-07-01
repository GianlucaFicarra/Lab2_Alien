package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {  //==MODEL
	
	/*PUNTO 1
	private List<Word> dizionario;
	
	
	
	public AlienDictionary() {
		dizionario= new LinkedList<Word>();
	}

	public void addWord(String alienWord, String translation) {
		
		Word parola=new Word(alienWord);
		
		//OPPURE SFRUTTO PROPRIETA LISTA PER L'AGGIUNTA
		 if (dizionario.contains(parola)) {
			 dizionario.get(dizionario.indexOf(parola)).setTranslation(translation);
			 //ritorna l'elemento del dizionario in corrispondenza dell parola word passata e cambia la traduzione
			return;
		}
		 parola.setTranslation(translation);
		 dizionario.add(parola);
		 
		
	}
	
	public String translateWord(String alienWord) {
		
		// SFRUTTO PROPRIETA LISTA PER LA RICERCA:
		Word parola = new Word(alienWord);
		if (dizionario.contains(parola)) {
			return dizionario.get(dizionario.indexOf(parola)).getTranslation();
			 //ritorna la traduzione dell'elemento del dizionario in corrispondenza dell parola word passata
		}
		 
		return null;
	}*/
	
	
	//PUNTO2
    List<WordEnhanced> dizionario;
	
	
	public AlienDictionary() {
		dizionario= new LinkedList<WordEnhanced>();
	}

	public void addWord(String alienWord, String translation) {
		
		WordEnhanced parola=new WordEnhanced(alienWord);
		
		if (dizionario.contains(parola)) {
			dizionario.get(dizionario.indexOf(parola)).setTranslation(translation);
			//set traslation le aggiunge alla lista traduzione se non ripetuta
			return;
		}
		parola.setTranslation(translation);
		dizionario.add(parola);
		
	}
	
	public String  translateWord(String alienWord) {
		WordEnhanced parola = new WordEnhanced(alienWord);
		if (dizionario.contains(parola))
			return dizionario.get(dizionario.indexOf(parola)).getTranslation();
		    //ritorna lista di traduzioni dell'elemento del dizionario in corrispondenza dell parola word passata
		return null;
	}

}
