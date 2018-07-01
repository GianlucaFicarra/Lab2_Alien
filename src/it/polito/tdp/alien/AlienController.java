package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
       
    
    private AlienDictionary dizionario = new AlienDictionary(); //creo classe dove ci vado ad aggiungere Le mie parole
    
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  

    @FXML
    void doReset(ActionEvent event) {
    	dizionario= new AlienDictionary();
    	txtResult.clear();
    	txtWord.clear();
    }
    
    
    /* PUNTO 1
    @FXML
    void doTranslate(ActionEvent event) {
    	   
    	   txtResult.clear();
    	   String rigo=txtWord.getText().toLowerCase();
    	   
    	   //controllo sull'input
    	   if(rigo.length()==0 || rigo==null) {
    		   txtResult.appendText(("Aggiunge le parole!!"));
    		   return;
    	   }
    		   
    	   String[] array=rigo.split(" ");
    	   
    	   if(array.length==1) { //se una parola, la devo tradurre
    		   
    		 //verifico se siano realmente parole
   			if (!array[0].matches("[a-zA-Z]*")) { //matches=true solo se stringa corrisponde all'espressione regolare data
   				txtResult.setText("Inserire solo caratteri alfabetici.");
   				return;
   			}
    		 String traduzione=dizionario.translateWord(array[0]);
    		 
    		 if (traduzione != null) 
    			 txtResult.setText(String.format("La traduzione di %s e': %s\n", array[0], traduzione));
    		 else
    			 txtResult.setText("La parola cercata non esiste nel dizionario.");
    		   
    		 
    	   } else if(array.length==2 && array[1]!=null) { //se due parole le devo aggiungere
    		   
    		   //verifico se siano realmente parole
    			if (!array[0].matches("[a-zA-Z]*") || !array[1].matches("[a-zA-Z]*")) {
    				txtResult.setText("Inserire solo caratteri alfabetici.");
    				return;
    			}
    		   
    		   dizionario.addWord(array[0], array[1]);
    		   txtResult.setText(String.format("Aggiungo la parola %s e la sua traduzione %s\n", array[0], array[1]));
    		   
    	   } else  txtResult.appendText(("Hai sbagliato ad inserire le parole!!")); //nel caso siano di più
    	    	
    }*/
    
    
    //PUNTO 2: traduzioni multiple
    @FXML
    void doTranslate(ActionEvent event) {
 	   
 	   txtResult.clear();
 	   String rigo=txtWord.getText().toLowerCase();
 	   
 	   if(rigo.length()==0 || rigo==null){
 		   txtResult.appendText(("Aggiunge le parole!!"));
 		   return;
		}
 		   
 	   String[] array=rigo.split(" ");
 	   
 	   
 	   if(array.length==1) { //devo tradurre la parola
 	   
 	   if (!array[0].matches("[a-zA-Z]*")) {
   				txtResult.setText("Inserire solo caratteri alfabetici.");
   				return;
   		} else {
 	   
 		 String traduzione=dizionario.translateWord(array[0]);
 		 
 		 if (traduzione != null) 
    			 txtResult.setText(String.format("La traduzione di %s e': %s\n", array[0], traduzione));
    		 else
    			 txtResult.setText("La parola cercata non esiste nel dizionario.");
    		   
   		}
 		   
 	   } else if(array.length==2 && array[1]!=null) { //devo aggiungere parola
 		   
 		 //verifico se siano realmente parole
    			if (!array[0].matches("[a-zA-Z]*") || !array[1].matches("[a-zA-Z]*")) {
    				txtResult.setText("Inserire solo caratteri alfabetici.");
    				return;
    			} 
 		   
 		   dizionario.addWord(array[0], array[1]);
 		   txtResult.appendText(String.format("Aggiungo la parola %s e la sua traduzione %s\n", array[0], array[1]));
 		   
 	   } else  txtResult.appendText(("Hai sbagliato ad inserire le parole!!"));
 	    	
 }
    
}
