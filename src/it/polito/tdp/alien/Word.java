package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;


/*JAVABEAN
  Nel package it.polito.tdp.alien creare una classe Word per memorizzare l’associazione
  tra parola aliena ed originale
 */

public class Word {
	
	/*per riscrivere word con un altro nome in tutte le iterazioni, 
	 * refactor rename     */

	//definesce oggetto di ogni singola parola
	private String alienWord;
	private String translation;  //una singola traduzione per ogni parola
		
    
	public Word(String alienWord) { //costruttore per la ricerca delle parole
		this.alienWord = alienWord;
	}
    
	public void setTranslation(String translation) {//posso aggiornare le traduzioni delle parole
		this.translation = translation;
	}
	
    public String getTranslation() {
		return translation;
	}
    
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getAlienWord() {
		return alienWord;
	}
	
	//Ridefinire il metodo equals per controllare se la parola alienWord è già presente nel dizionario.
	public boolean equals(Object o) {
		Word parola=(Word) o; //creo nuovo oggetto word dove salvo la o passata
		if(parola.getAlienWord().compareTo(alienWord)==0)
			//se parola passata ha lo stesso nome allieno di questa in memoria sono uguali
			return true;
		else
			return false;
	}
	
	
}
