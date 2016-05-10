package projc2;

import javax.script.*;
import java.awt.Toolkit;
import java.io.File;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.effect.DropShadow;
import javafx.scene.media.AudioClip;
import javafx.scene.media.*;
import javafx.scene.media.MediaPlayer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Design2 extends Application{
	public static void main(String[] args) {
	 
		Application.launch(args);
	}
	Button [] arr = new Button[10];
 
	TextArea text = new TextArea();
	String res="";
	 static int size=0; 
	
	 DropShadow shadow = new DropShadow();
	@Override
	public void start(Stage st) throws Exception {
		
 
	    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	text.setPrefHeight(90);
	text.setPrefWidth(50);
	GridPane g = new  GridPane();
	g.add(text,0,0,10,1);	
	g.setStyle(
			 " -fx-background-color:#e9c8a7; -fx-background-position: center ;");
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//button = 
		//  
		Button equal = new Button("=");
		equal.setShape(new Circle(1.5));
		 equal.setEffect(shadow);
		g.add(equal,4,5,4,3);
		equal.setPrefSize(190,40);
		equal.setTextFill(Color.WHITE);
		equal.setStyle("-fx-border-color:black; -fx-background-color: #35b90d; -fx-font-weight: bold; -fx-font-size: 17px; ");
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		  for(int i =1; i<10 ;i++){
			  arr[i]= new Button(Integer.toString(i));
			  arr[i].setShape(new Circle(1.5));
			  arr[i].setEffect(shadow);

	    	  arr[i].setTextFill(Color.BLACK);
	    	 arr[i].setStyle("-fx-border-color:black; -fx-background-color: #fafafa; -fx-font-weight: bold;  -fx-font-size: 17px;");
			  arr[i].setPrefSize(140,100);
			  
		  }
		            int k=9;
			     for(int i =2;i<=4 ;i++)
			    	 
			    	 for(int j=2;j>=0;j--)
			    		g.add(arr[k--], j, i,1,1);
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			     /**
			      * 
			      * 
			      */
		      Button []arr2= new Button[10];
		      for(int i =0; i<10 ;i++){	
		    	  arr2[i]= new Button();
		    	  arr2[i].setShape(new Circle(1.5));
		    	  arr2[i] .setEffect(shadow);
		    	  arr2[i].setTextFill(Color.WHITE);
		     	 arr2[i].setStyle("-fx-border-color:black; -fx-background-color:#939393 ; -fx-font-weight: bold;-fx-font-size: 14px;");
		    	  arr2[i].setPrefSize(140,130);
		    	  
		      } 
		      int a=0;
			     for(int i =2;i<=4;i++){
			    	 for(int j=3;j<=5;j++)
			    	g.add(arr2[a++], j, i); 
			    	 
			    	 
			     }
			     arr2[0].setText("/");
			     arr2[1].setText("?");        //
			     arr2[2].setText(" C ");       
			     arr2[3].setText("*");
			     arr2[4].setText("(");
			     arr2[5].setText(")");
			     arr2[6].setText("-");
			     arr2[7].setText("x^2");       //
			     arr2[8].setText("?");          
	///////////////////////////////////////////////////////////////////////////////////////////////////		     
			 
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				       g.setHgap(3);
	                   g.setVgap(3);		
			st.setScene(new Scene(g,300,200));
			st.setResizable(false);
		
		st.show();}}
		/////////////////////////////////////////////////////////////////////////////////
		 