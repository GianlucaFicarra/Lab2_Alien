package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class Word {
	/*per riscrivere word con un altro nome in tutte le iterazioni, 
	 * refactor rename     */

	//definesce oggetto di ogni singola parola
	private String alienWord;
	private String translation;
		

	public void setTranslation(String translation) {
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
	
	
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}

	public boolean equals(Object o) {
		Word parola=(Word) o;
		if(parola.getAlienWord().compareTo(alienWord)==0)
			return true;
		else
			return false;
	}

}
