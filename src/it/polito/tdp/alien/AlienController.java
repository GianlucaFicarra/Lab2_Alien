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
       
    
    private AlienDictionary dizionario = new AlienDictionary(); //creo classe dove ci vado ad aggiungere e mie parole
    
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    /* PUNTO 1
    @FXML
    void doTranslate(ActionEvent event) {
    	   
    	   String rigo=txtWord.getText().toLowerCase();
    	   if(rigo.length()==0)
    		   txtResult.appendText(("Aggiunge le parole!!"));
    		   
    	   String[] array=rigo.split(" ");//da fare
    	   
    	   if(array.length==1) {
    		   //devo tradurre la parola
    		 String traduzione=dizionario.translateWord(array[0]);
    		 txtResult.setText(String.format("La traduzione di %s e': %s\n", array[0], traduzione));
    		   
    	   } else if(array.length==2 && array[1]!=null) {
    		   //devo aggiungere parola
    		   dizionario.addWord(array[0], array[1]);
    		   txtResult.setText(String.format("Aggiungo la parola %s e la sua traduzione %s\n", array[0], array[1]));
    		   
    	   } else  txtResult.appendText(("Hai sbagliato ad inserire le parole!!"));
    	    	
    }
    */
    
    //PUNTO 2
    @FXML
    void doTranslate(ActionEvent event) {
 	   
 	   String rigo=txtWord.getText().toLowerCase();
 	   if(rigo.length()==0)
 		   txtResult.appendText(("Aggiunge le parole!!"));
 		   
 	   String[] array=rigo.split(" ");
 	   
 	   if(array.length==1) {
 		   //devo tradurre la parola
 		 String traduzione="";
 		 for(String w: dizionario.translateWord(array[0]) )
 			 traduzione+=w+"\n";
 		 
 		 txtResult.appendText(String.format("La traduzione di %s e':\n%s", array[0], traduzione));
 		   
 	   } else if(array.length==2 && array[1]!=null) {
 		   //devo aggiungere parola
 		   dizionario.addWord(array[0], array[1]);
 		   txtResult.appendText(String.format("Aggiungo la parola %s e la sua traduzione %s\n", array[0], array[1]));
 		   
 	   } else  txtResult.appendText(("Hai sbagliato ad inserire le parole!!"));
 	    	
 }
    
    @FXML
    void doReset(ActionEvent event) {
    	dizionario= new AlienDictionary();
    	txtResult.clear();
    	txtWord.clear();
    }
    
}
