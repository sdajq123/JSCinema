import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Report {
	public Scene getReport(Stage stage) throws Exception{
		stage.setTitle("Report");
		System.out.println("Entered report page!");
		Pane root = new Pane();// root pane 
		
		//Setting Background Image
		FileInputStream imageStream1 = new FileInputStream("PageLayout/1.png");
		Image image = new Image(imageStream1);
		ImageView imgview = new ImageView(image);
		imgview.setFitHeight(960);
		imgview.setFitWidth(1440);
		//root.getChildren().add(imgview);
		
		//Create Header
		Pane header = new Pane();
		FileInputStream imageStream2 = new FileInputStream("PageLayout/2.png");
		Image image2 = new Image(imageStream2);
		ImageView imgview2 = new ImageView(image2);
		imgview2.setLayoutY(0);
		header.getChildren().add(imgview2);
		header.setLayoutY(0);
		root.getChildren().add(header);
		
		// Title on header
		Pane title = new Pane();
		FileInputStream imageStream3 = new FileInputStream("PageLayout/3.png");
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
    			Dashboard dashboard = new Dashboard(); // Create a dashboard object from dashboard class
				stage.setScene(dashboard.getDashboard(stage)); // change to dashboard scene
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
    		try {
				stage.setScene(getReport(stage)); // back to report scene
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
    			+ "-fx-background-color: transparent;");
    	
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
    	
    	HBox graph = displayGraph();
    	graph.setPadding(new Insets(200,50,50,395));
    	
    	root.getChildren().add(graph);// Calling graph pane
    	root.getChildren().add(left);// adding left sidebar to root pane
		Scene scene = new Scene(root, 1440, 960);
		return scene;
	}
	
	public int getMoviesBooked() throws Exception{
		int num = 0;
		File file = new File("MovieData/bookingmade.txt");
		
		if(file.exists()){
    		System.out.println("File Opened! Calculating number of movies");
    		Scanner input = new Scanner(file);
    		
    		while(input.hasNextLine()){
    			num++;
    			input.nextLine();
    		}
    		input.close();
    	}else{
    		System.out.println("File not found, No graph to be shown");
    	}
		return num/2;
	}
	
	public HBox displayGraph() throws Exception{
		HBox graph = new HBox();
    	
    	CategoryAxis xAxis = new CategoryAxis();
    	NumberAxis yAxis = new NumberAxis();
    	
    	xAxis.tickLabelFontProperty().set(Font.font(20));
    	yAxis.tickLabelFontProperty().set(Font.font(20));
    	
    	BarChart<String,Number> bc = 
                new BarChart<String,Number>(xAxis,yAxis);

    	bc.setTitle("Booking summary");
    	xAxis.setLabel("Date");
    	yAxis.setLabel("Number of Booking");
    	bc.setPrefHeight(600);
    	bc.setPrefWidth(1000);
    	
    	XYChart.Series series1 = new XYChart.Series<>();
    	
    	File file = new File("MovieData/bookingmade.txt");
    	
    	if(file.exists()){
    		System.out.println("File Opened!");
    		Scanner input = new Scanner(file);
    		
    		while(input.hasNextLine()){
    			String movieTitle = input.nextLine();
    			String bookingmade = input.nextLine();
    			series1.setName(movieTitle);
    			series1.getData().add(new XYChart.Data(movieTitle,
    					Integer.parseInt(bookingmade)));
    		}
    		input.close();
    	}else{
    		System.out.println("File not found, No graph to be shown");
    	}
    	
    	bc.getData().add(series1);
    	graph.getChildren().add(bc);
		return graph;
	}
}
