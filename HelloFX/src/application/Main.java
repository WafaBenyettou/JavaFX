/*Hello, 
 * so today imma talk a little bit about Stages in JavaFx and what i learned from Bro code YT channel 
 * 
 * Whats a JavaFX ?
 * JavaFx is a set of graphics and media packages that enable you to design create test debug etc ... rich client app 
 * 
 * javaFx app contains one + stages each stage has a scene attached to it and each scene has a graph of control, layout etc attached to it called scene graph 
 * 
 * so whats a STAGE ?
 * 
 * Stage is a top level container to hold our FX GUI application similar to JFrame in swing and its basically our window -outer frame of JavaFX-
 * 
 * whats a scene ? 
 * scene is a drawing serface for graphical content similar to a JPanel in swing 
 * 
 * Scene-graph ?
 * 
 *  hierarchical tree of nodes -tree data stru - that hold and arrange nodes
 *  
 *  nodes ?
 *  all the different component that we add to the scene (img,buttons,text-box.etc) and they are arranged in the tree beginning with the root node
 *  */



package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	
	
	public void start(Stage stage) throws Exception {
		
		/* create stage
		 * you create a stage like any other java object 
		 * 
		 * ------Stage stage = new Stage();---------
		 * 
		*/
		
		
		/*in order to display anything inside a JavaFX stage you must set a JavaFX scene object on the stage 
		 * 
		 * -----Scene scene = new Scene();---------
		 * 
		 * and in order to construct the scene we need to add a root node we will pass a root node as an arg to
		 * the constructor of the scene class ( there are various diff types of root nodes but lets use 
		 * the Group root 
		 * 
		 * ----------Group root = new Group();--------
		 * 
		 * and then we can add the root node to the scene
		 * 
		 * ----------Scene scene = new Scene(root);-------
		 * 
		 * if you want to change the color of the scene just add 
		 * 
		 * ----------------Scene scene = new Scene(root,Color.BLACK);------------------
		 * 
	    */
		
		
		Group root = new Group();
		Scene scene = new Scene(root,Color.BLACK);
		
		/* after that you can just set the scene by 
		 * 
		 *  ------------stage.setScene(scene); -----------------*/
		
		
	
		stage.setScene(scene);
		
		
		/*we can change edit our scene by using the following */
		
		/*change the background of the scene
		 * .....Scene scene = new Scene(root,Color.BLACK);... */

		Image icon = new Image("icon.jpg"); //change the icon at the top left corner of the stage 
		stage.getIcons().add(icon); 
		
		stage.setWidth(420);//set the width of the stage
		stage.setHeight(420);//set the height of the stage
		stage.setResizable(false); // cant resize the window 
		
		  /* set the position of the stage in this case top left of the pc screen 
		   stage.setX(50);
		   stage.setY(50);
		   */
		stage.setFullScreen(true); //set stage to be full screen 
		
		stage.setFullScreenExitHint("press 'a' if you want to exit "); //change the exit screen hint
		
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("a"));
			
		stage.setTitle("stage hihihihi"); //add a title to the stage 
		
		stage.show(); //used to show the stage
		 
	}
}
