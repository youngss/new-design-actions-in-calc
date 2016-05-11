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
		// TODO Auto-generated method stub
		Application.launch(args);
	}
	Button [] arr = new Button[10];
	//TextField text = new TextField();
	TextArea text = new TextArea();
	String res="";
	 static int size=0; 
	
	 DropShadow shadow = new DropShadow();
	@Override
	public void start(Stage st) throws Exception {
		
		
	  /*  Media sound = new Media(new File(ssound).toURI().toString());
	    MediaPlayer mediaPlayer = new MediaPlayer(sound);*/
	    
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
		     arr2[1].setText("CE");        //
		     arr2[2].setText(" C ");       
		     arr2[3].setText("*");
		     arr2[4].setText("(");
		     arr2[5].setText(")");
		     arr2[6].setText("-");
		     arr2[7].setText("x^2");       //
		     arr2[8].setText("sqt");          
///////////////////////////////////////////////////////////////////////////////////////////////////		     
		    //
		     String [] str = {"0",".", "%" ,"+"};
		     Button []last_row= new Button[4];
		    	 for(int i=0;i<4;i++){
		    		 last_row[i]= new Button(str[i]);
		    		 last_row[i].setShape(new Circle(1.5));
		    		 last_row[i] .setEffect(shadow);

		    		  last_row[i].setPrefSize(120,120); 
		    		 g.add(last_row[i], i, 6);
		    		 last_row[i] .setTextFill(Color.BLACK);
		    		 last_row[i].setStyle("-fx-border-color:black; -fx-background-color:#fafafa; -fx-font-weight: bold; -fx-font-size: 17px;");
		    	 }
		    	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			       g.setHgap(3);
                   g.setVgap(3);		
		st.setScene(new Scene(g,300,200));
		st.setResizable(false);
	
	st.show();
	/////////////////////////////////////////////////////////////////////////////////
	arr[1].setOnAction(e->{
		text.setText(text.getText()+arr[1].getText());
		Toolkit.getDefaultToolkit().beep();
		arr[1].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
	});
	arr[2].setOnAction(e->{
		text.setText((text.getText()+arr[2].getText()));
		Toolkit.getDefaultToolkit().beep();
		arr[2].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		//mediaPlayer.play();
	});
	
    
	arr[3].setOnAction(e->{
		text.setText((text.getText()+arr[3].getText()));
		Toolkit.getDefaultToolkit().beep();
		arr[3].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
	});
    
	arr[4].setOnAction(e->{
		text.setText((text.getText()+arr[4].getText()));
		Toolkit.getDefaultToolkit().beep();
		arr[4].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
	});
    
	arr[5].setOnAction(e->{
		text.setText((text.getText()+arr[5].getText()));
		Toolkit.getDefaultToolkit().beep();
		arr[5].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
	});
    
	arr[6].setOnAction(e->{
		text.setText((text.getText()+arr[6].getText()));
		Toolkit.getDefaultToolkit().beep();
		arr[6].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
	});
    
	arr[7].setOnAction(e->{
		text.setText((text.getText()+arr[7].getText()));
		Toolkit.getDefaultToolkit().beep();
		arr[7].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
	});
    
	arr[8].setOnAction(e->{
		text.setText((text.getText()+arr[8].getText()));
		Toolkit.getDefaultToolkit().beep();
		arr[8].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
	});
    
	arr[9].setOnAction(e->{
		text.setText((text.getText()+arr[9].getText()));
		Toolkit.getDefaultToolkit().beep();
		arr[9].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		
	  
		arr2[0].setOnAction(e->{
			text.setText((text.getText()+" " +arr2[0].getText()+" "));
			Toolkit.getDefaultToolkit().beep();
			arr2[0].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		arr2[1].setOnAction(e->{
			String remind= text.getText();
			
			      if(Character.isDigit(remind.charAt(remind.length()-1)))
					text.setText(remind.substring(0, remind.length()-1));
			      
			      else
			    	  text.setText(remind.substring(0, remind.length()-3));  
			      Toolkit.getDefaultToolkit().beep();
			      arr2[1].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});		
		arr2[2].setOnAction(e->{
			text.setText("");
			Toolkit.getDefaultToolkit().beep();
			arr2[2].setStyle("-fx-border-color:black; -fx-background-color: #3e6993;");
		});
		arr2[3].setOnAction(e->{
			text.setText((text.getText()+" "+arr2[3].getText()+" "));
			Toolkit.getDefaultToolkit().beep();
			arr2[3].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		arr2[4].setOnAction(e->{
			text.setText((text.getText()+arr2[4].getText())+" ");
			Toolkit.getDefaultToolkit().beep();
			arr2[4].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		arr2[5].setOnAction(e->{
			text.setText((text.getText()+" " +arr2[5].getText()));
			Toolkit.getDefaultToolkit().beep();
			arr2[5].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		arr2[6].setOnAction(e->{
			text.setText((text.getText()+" " +arr2[6].getText()+" "));
			Toolkit.getDefaultToolkit().beep();
			arr2[6].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		arr2[7].setOnAction(e->{
			text.setText((text.getText()+" " +"^ 2"));
			Toolkit.getDefaultToolkit().beep();
			arr2[7].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		arr2[8].setOnAction(e->{
			text.setText((text.getText()+" " +arr2[8].getText()+" "));
			Toolkit.getDefaultToolkit().beep();
			arr2[8].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		
		
		last_row[0].setOnAction(e->{
			text.setText((text.getText()+last_row[0].getText()));
			Toolkit.getDefaultToolkit().beep();
			last_row[0].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		
		
		last_row[1].setOnAction(e->{
			text.setText((text.getText()+" " +last_row[1].getText()));
			Toolkit.getDefaultToolkit().beep();
			last_row[1].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		
	
		last_row[2].setOnAction(e->{
			text.setText((text.getText()+" " +last_row[2].getText()+" "));
			Toolkit.getDefaultToolkit().beep();
			last_row[2].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
		
		
		last_row[3].setOnAction(e->{
			text.setText((text.getText()+" "+last_row[3].getText()+" "));
			Toolkit.getDefaultToolkit().beep();
			last_row[3].setStyle("-fx-border-color:black; -fx-background-color: #d9dff0;");
		});
////////////////////////////////////////////////////////////////////////////////////
//////equal event /////////////////
		equal.setOnAction(e->{
			String x= text.getText();
			Object result="";
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");
			try {
				 result = engine.eval(x);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		       
			
			text.setText(result+"");
			});
   }}
   
   ////////////////////////////////////////////