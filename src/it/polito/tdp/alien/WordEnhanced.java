package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {
	
	//MODELLO CON WordEnhanced PUNTO 2
		//definesce oggetto di ogni singola parola
			private String alienWord = new String();
			List<String> translation = new LinkedList<String>();
		
			

			public WordEnhanced(String alienWord, List<String> translation) {
				super();
				this.alienWord = alienWord;
				this.translation = translation;
			}

			public List<String> getTranslation() {
				return translation;
			}

			public void setTranslation(String translation) {
				this.translation.add(translation);
			}

			public void setAlienWord(String alienWord) {
				this.alienWord = alienWord;
			}

			public String getAlienWord() {
				return alienWord;
			}
			
			
			public WordEnhanced(String alienWord, String translation) {
				this.alienWord = alienWord;
				this.translation.add(translation);
			}

			public boolean equals(Object o) {
				WordEnhanced parola=(WordEnhanced) o;
				if(parola.getAlienWord().compareTo(alienWord)==0)
					return true;
				else
					return false;
			}

}
