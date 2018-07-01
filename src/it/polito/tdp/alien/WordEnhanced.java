package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;


/*JAVABEAN
  Nel package it.polito.tdp.alien creare una classe WordEnhanced per memorizzare l’associazione
  tra parola aliena ed originale, si differenzia da word perchè qui ho più di una traduzione per parola
 */

public class WordEnhanced { 
	
	//MODELLO CON WordEnhanced PUNTO 2
			private String alienWord = new String();
			List<String> translation = new LinkedList<String>();  //una lista di traduzioni
		
			
			public WordEnhanced(String alienWord) {
				this.translation = new LinkedList<String>();
				this.alienWord = alienWord;
			}

			public String getTranslation() { //restituisco direttamente la stringa con le traduzioni
				String s = "";
				for (String a : translation) {
					s +=  "\n" + a ;
				}
				return s;
			}

			public void setTranslation(String translation) {//se non era già contenuta aggiungila alla lista
				if (!this.translation.contains(translation)) 
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
