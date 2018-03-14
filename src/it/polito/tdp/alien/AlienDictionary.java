package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	
	/*PUNTO 1
	List<Word> dizionario;
	
	
	
	public AlienDictionary() {
		dizionario= new LinkedList<Word>();
	}

	public void addWord(String alienWord, String translation) {
		
		Word parola=new Word(alienWord, translation);
		boolean trovata=false;
		
		for(Word w: dizionario) {
			if(w.equals(parola)==true) {
				w.setTranslation(translation);
				trovata=true;
			}	
		}
		
		if(trovata==false) {
			dizionario.add(parola);
		}
		
	}
	
	public String translateWord(String alienWord) {
		for(Word w: dizionario) {
			if(w.getAlienWord().compareTo(alienWord)==0)
				return w.getTranslation();
		}
		
		return null;
	}
	*/
	
	//PUNTO2
    List<WordEnhanced> dizionario;
	
	
	
	public AlienDictionary() {
		dizionario= new LinkedList<WordEnhanced>();
	}

	public void addWord(String alienWord, String translation) {
		
		WordEnhanced parola=new WordEnhanced(alienWord, translation);
		boolean trovata=false;
		
		for(WordEnhanced w: dizionario) {
			if(w.equals(parola)==true) {
				w.setTranslation(translation);
				trovata=true;
			}	
		}
		
		if(trovata==false) {
			dizionario.add(parola);
		}
		
	}
	
	public List<String> translateWord(String alienWord) {
		for(WordEnhanced w: dizionario) {
			if(w.getAlienWord().compareTo(alienWord)==0)
				return w.getTranslation();
		}
		
		return null;
	}

}
