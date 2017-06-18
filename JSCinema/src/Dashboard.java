import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Dashboard{
	
	public Scene getDashboard(Stage stage) throws Exception{
		stage.setTitle("Dashboard");
		Pane root = new Pane();// root pane 
		
		//Setting Background Image
		FileInputStream imageStream1 = new FileInputStream("1.png");
		Image image = new Image(imageStream1);
		ImageView imgview = new ImageView(image);
		imgview.setFitHeight(960);
		imgview.setFitWidth(1440);
		root.getChildren().add(imgview);
		
		//Create Header
		Pane header = new Pane();
		FileInputStream imageStream2 = new FileInputStream("2.png");
		Image image2 = new Image(imageStream2);
		ImageView imgview2 = new ImageView(image2);
		imgview2.setLayoutY(0);
		header.getChildren().add(imgview2);
		header.setLayoutY(0);
		root.getChildren().add(header);
		
		// Title on header
		Pane title = new Pane();
		FileInputStream imageStream3 = new FileInputStream("3.png");
		Image image3 = new Image(imageStream3);
		ImageView imgview3 = new ImageView(image3);
		imgview3.setLayoutX(542);
		imgview3.setLayoutY(26);
		title.getChildren().add(imgview3);
		root.getChildren().add(title);
		
		//Sidebar
		Pane left = new Pane();
		StackPane leftContainer = new StackPane();
		leftContainer.setPadding(new Insets(180,50,50,40));	
		
		String img1_url = "LeftDashboard/sidebar.png";
		
	    FileInputStream imageStream4 = new FileInputStream(img1_url);
		Image image4 = new Image(imageStream4);
		ImageView imgview4 = new ImageView(image4);
		imgview4.setFitHeight(650);
		imgview4.setFitWidth(350);
	    
	    leftContainer.getChildren().add(imgview4);
	    left.getChildren().add(leftContainer);
	    
	    VBox leftOutline = new VBox(45);
	    leftOutline.setPadding(new Insets(240,50,50,85));
	    
	    HBox hb1 = new HBox();
	    FileInputStream imageStream5 = new FileInputStream("LeftDashboard/1.png"); 
		Image image5 = new Image(imageStream5);
    	ImageView imageView5 = new ImageView(image5);
    	imageView5.setFitHeight(62);
    	imageView5.setFitWidth(62);
    	Button btn1 = new Button("DashBoard");
    	btn1.setGraphic(imageView5);
    	 
    	btn1.setStyle("-fx-text-fill: white;-fx-font-size: 35px;  -fx-padding: 3 20 3 30; "
    			+ "-fx-background-radius: 7,2,1; -fx-border-color: transparent; "
    			+ "-fx-background-color: transparent;");
		
    	btn1.setOnAction(e -> {
    		try {
				stage.setScene(getDashboard(stage));
			} catch (Exception e1) {
				System.out.println("Scene not found");
			}
    	});
    	
    	HBox hb2 = new HBox();
    	FileInputStream imageStream6 = new FileInputStream("LeftDashboard/3.png"); 
		Image image6 = new Image(imageStream6);
    	ImageView imageView6 = new ImageView(image6);
    	imageView6.setFitHeight(62);
    	imageView6.setFitWidth(62);
    	Button btn2 = new Button("Movies");
    	btn2.setGraphic(imageView6);
    	
    	btn2.setStyle("-fx-text-fill: white;-fx-font-size: 35px;  -fx-padding: 3 20 3 30; "
    			+ "-fx-background-radius: 7,2,1; -fx-border-color: transparent; "
    			+ "-fx-background-color: transparent;");
        	
    	HBox hb3 = new HBox();
    	FileInputStream imageStream7 = new FileInputStream("LeftDashboard/4.png"); 
		Image image7 = new Image(imageStream7);
    	ImageView imageView7 = new ImageView(image7);
    	imageView7.setFitHeight(62);
    	imageView7.setFitWidth(62);
    	Button btn3 = new Button("Report");
    	btn3.setGraphic(imageView7);
    	
    	btn3.setStyle("-fx-text-fill: white;-fx-font-size: 35px;  -fx-padding: 3 20 3 30; "
    			+ "-fx-background-radius: 7,2,1; -fx-border-color: transparent; "
    			+ "-fx-background-color: transparent;");
    	
    	btn3.setOnAction(e -> {
    		Report report = new Report();
    		try {
				stage.setScene(report.getReport(stage));
			} catch (Exception e1) {
				System.out.println("Scene not found");
			}
    	});
    	
    	HBox hb4 = new HBox();
    	FileInputStream imageStream8 = new FileInputStream("LeftDashboard/6.png"); 
		Image image8 = new Image(imageStream8);
    	ImageView imageView8 = new ImageView(image8);
    	imageView8.setFitHeight(62);
    	imageView8.setFitWidth(62);
    	Button btn4 = new Button("Users");
    	btn4.setGraphic(imageView8);
    	
    	btn4.setStyle("-fx-text-fill: white;-fx-font-size: 35px;  -fx-padding: 3 20 3 30; "
    			+ "-fx-background-radius: 7,2,1; -fx-border-color: transparent; "
    			+ "-fx-background-color: transparent;");
    	
    	HBox hb5 = new HBox();
    	FileInputStream imageStream9 = new FileInputStream("LeftDashboard/8.png"); 
		Image image9 = new Image(imageStream9);
    	ImageView imageView9 = new ImageView(image9);
    	imageView9.setFitHeight(62);
    	imageView9.setFitWidth(62);
    	Button btn5 = new Button("Logout");
    	btn5.setGraphic(imageView9);
    	
    	btn5.setStyle("-fx-text-fill: white;-fx-font-size: 35px;  -fx-padding: 3 20 3 30; "
    			+ "-fx-background-radius: 7,2,1; -fx-border-color: transparent; "
    			);
    	
    	btn5.setOnAction(e -> {
    		System.exit(1);
    	});
    	
    	hb1.getChildren().add(btn1);
    	hb2.getChildren().add(btn2);
    	hb3.getChildren().add(btn3);
    	hb4.getChildren().add(btn4);
    	hb5.getChildren().add(btn5);

    	leftOutline.getChildren().add(hb1);
    	leftOutline.getChildren().add(hb2);
    	leftOutline.getChildren().add(hb3);
    	leftOutline.getChildren().add(hb4);
    	leftOutline.getChildren().add(hb5);
    	
    	left.getChildren().add(leftOutline);

		// Center content
		Pane centTop = new Pane();
    	StackPane centerTop = new StackPane();
    	centerTop.setPadding(new Insets(185,50,50,400));	
		GridPane ctop1 = new GridPane();
		//ctop1.setGridLinesVisible(true);
		ctop1.setPadding(new Insets(70, 50,50,15));
		ctop1.setHgap(40);
		
		FileInputStream imageStream10 = new FileInputStream("4.png");
		Image image10 = new Image(imageStream10);
		ImageView imgview10 = new ImageView(image10);
		imgview10.setFitHeight(100);
		imgview10.setFitWidth(100);
		GridPane.setRowSpan(imgview10, 5);
		ctop1.add(imgview10, 0, 0);
		
		FileInputStream imageStream11 = new FileInputStream("LeftDashboard/4.png");
		Image image11 = new Image(imageStream11);
		ImageView imgview11 = new ImageView(image11);
		imgview11.setFitHeight(80);
		imgview11.setFitWidth(80);
		GridPane.setRowSpan(imgview11, 5);
		ctop1.add(imgview11, 4, 0);
		
		FileInputStream imageStream12 = new FileInputStream("LeftDashboard/5.png");
		Image image12 = new Image(imageStream12);
		ImageView imgview12 = new ImageView(image12);
		imgview12.setFitHeight(90);
		imgview12.setFitWidth(90);
		GridPane.setRowSpan(imgview12, 5);
		ctop1.add(imgview12, 8, 0);
		
		centerTop.getChildren().add(ctop1);
		
		FileInputStream imageStream13 = new FileInputStream("5.png");
		Image image13 = new Image(imageStream13);
		ImageView imgview13 = new ImageView(image13);
		imgview13.setFitWidth(960);
		imgview13.setFitHeight(180);
		
		centerTop.getChildren().add(imgview13);
		
		centTop.getChildren().add(centerTop);
		
		Text ctText1 = new Text("3");
		Text ctText2 = new Text("movie showing today");
		ctText1.setFont(Font.font(28));
		ctText2.setFont(Font.font(14));
		ctText1.setFill(Color.WHITE);
		ctText2.setFill(Color.WHITE);
		ctop1.add(ctText1, 1, 3);
		ctop1.add(ctText2, 1, 4);
		Text ctText3 = new Text("0");
		Text ctText4 = new Text("booking made today");
		ctText3.setFont(Font.font(28));
		ctText4.setFont(Font.font(14));
		ctText3.setFill(Color.WHITE);
		ctText4.setFill(Color.WHITE);
		ctop1.add(ctText3, 5, 3);
		ctop1.add(ctText4, 5, 4);
		Text ctText5 = new Text("5");
		Text ctText6 = new Text("halls");
		ctText5.setFont(Font.font(28));
		ctText6.setFont(Font.font(14));
		ctText5.setFill(Color.WHITE);
		ctText6.setFill(Color.WHITE);
		ctop1.add(ctText5, 9, 3);
		ctop1.add(ctText6, 9, 4);
		
		root.getChildren().add(centTop);
		
		// 2nd heading
		HBox headingContainer = new HBox();
		headingContainer.setPadding(new Insets(400,50,50,430));
		Text heading1 = new Text("Now Showing:");
		heading1.setFont(Font.font(45));
		heading1.setStyle("-fx-font-weight: bold;");
		heading1.setFill(Color.WHITE);
		
		headingContainer.getChildren().add(heading1);
		root.getChildren().add(headingContainer);
		
		// bottom content
		ScrollPane container = new ScrollPane();
		container.setPrefHeight(200);
		container.setPrefWidth(500);
		container.setPadding(new Insets(50,50,50,50));
		container.setStyle("-fx-background-color : transparent; -fx-background: transparent; ");
		container.setHbarPolicy(ScrollBarPolicy.NEVER);
		container.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		
		StackPane nowShowing = new StackPane();
		nowShowing.setPadding(new Insets(400,50,50,400));
		
		FileInputStream imageStream14 = new FileInputStream("LeftDashboard/container.png");
		Image image14 = new Image(imageStream14);
		ImageView imgview14 = new ImageView(image14);
		imgview14.setFitWidth(1000);
		imgview14.setFitHeight(400);
		nowShowing.getChildren().add(imgview14);
		
		nowShowing.getChildren().add(container);
		root.getChildren().add(nowShowing);
		
		root.getChildren().add(left);
		Scene scene = new Scene(root, 1440, 960);
		return scene;
	}
	
	public void displayNowShowing() throws Exception{
		File file = new File("Exercise1.txt");
		Scanner input = new Scanner(file);
		
		while(input.hasNext()){
			String word = input.nextLine();
			
			String[] splitter = word.split(",");
			
			for(String list: splitter){
				
			}
		}
		
		ArrayList<String> list = new ArrayList<String>();
	}
	
	public String getNowShowingNo() throws Exception{
		
		
		return null;
	}
	
	public String getTotalBookingMade() throws Exception{
		
		
		return null;
	}
}