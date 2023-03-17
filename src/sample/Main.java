package sample;

//imports
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.util.Random;


//main func
public class Main extends Application { //start class

    public static void main(String[] args) {
        launch(args);



    } //end main




    //starts stage
    @Override
    public void start(@NotNull Stage window) throws Exception {

        //creates new image for rock button
        ImageView view = new ImageView(getClass().getResource("rockpicjava.png").toExternalForm());
        //sets fit height to 80
        view.setFitHeight(80);
        //preserves image size when adding to button
        view.setPreserveRatio(true);
        //creates button for rock
        Button rockbutton = new Button();
        //sets button x coordinate
        rockbutton.setTranslateX(25);
        //sets button y coordinate
        rockbutton.setTranslateY(300);
        //sets the size of the button
        rockbutton.setPrefSize(80, 80);
        //sets graphic view to rock image
        rockbutton.setGraphic(view);

        //creates new image for paper button
        ImageView view2 = new ImageView(getClass().getResource("paperpicjava.png").toExternalForm());
        //sets fit height to 80
        view2.setFitHeight(80);
        //preserves image size when adding to button
        view2.setPreserveRatio(true);
        //creates paper button
        Button paperbutton = new Button();
        //sets x coordinate
        paperbutton.setTranslateX(170);
        //sets y coordinate
        paperbutton.setTranslateY(300);
        //sets size
        paperbutton.setPrefSize(80, 80);
        //sets graphic view to paper image
        paperbutton.setGraphic(view2);

        //creates new image for scissors button
        ImageView view3 = new ImageView(getClass().getResource("scissorspicjava.png").toExternalForm());
        //sets height
        view3.setFitHeight(80);
        //preserves ratio
        view3.setPreserveRatio(true);
        //creates scissors button
        Button scissorsbutton = new Button();
        //sets x coor
        scissorsbutton.setTranslateX(300);
        //sets y coor
        scissorsbutton.setTranslateY(300);
        //sets size
        scissorsbutton.setPrefSize(80, 80);
        //sets view to scissor image
        scissorsbutton.setGraphic(view3);

        //creates new image for lizard button
        ImageView view4 = new ImageView(getClass().getResource("lizardpicjava.png").toExternalForm());
        //sets height
        view4.setFitHeight(80);
        //preserves ratio
        view4.setPreserveRatio(true);
        //creates button for lizard
        Button lizardbutton = new Button();
        //sets x coor
        lizardbutton.setTranslateX(430);
        //sets y coor
        lizardbutton.setTranslateY(300);
        //sets size of button
        lizardbutton.setPrefSize(80, 80);
        //sets image to button
        lizardbutton.setGraphic(view4);

        //new image for button
        ImageView view5 = new ImageView(getClass().getResource("spockpicjava.png").toExternalForm());
        //sets height
        view5.setFitHeight(80);
        //preserves image ratio
        view5.setPreserveRatio(true);
        //creates new button for spock
        Button spockbutton = new Button();
        //sets x coor
        spockbutton.setTranslateX(545);
        //sets y coor
        spockbutton.setTranslateY(300);
        //sets size of button
        spockbutton.setPrefSize(80, 80);
        //sets image to button
        spockbutton.setGraphic(view5);

        //creates value to randomize computer decision
        int upperbound = 5;
        //creates new random to randomize comp value
        Random rand = new Random();
        //randomizes value and sets equal to int called computerChoice
        int computerChoice = rand.nextInt(upperbound);

        //creates a circle to place image
        Circle circle = new Circle();
        //sets x coor center
        circle.setCenterX(300.0f);
        //sets y coor center
        circle.setCenterY(55.0f);
        //sets radius of circle
        circle.setRadius(45.0f);
        //removes fill
        circle.setFill(null);
        //sets stroke color
        circle.setStroke(Color.LIGHTGRAY);

        //creates a circle to place image
        Circle circle2 = new Circle();
        //sets x coor center
        circle2.setCenterX(300.0f);
        //sets y coor center
        circle2.setCenterY(150.0f);
        //sets radius
        circle2.setRadius(45.0f);
        //sets fill to empty
        circle2.setFill(null);
        //sets stroke
        circle2.setStroke(Color.LIGHTGRAY);

        //creates new text called computer to label computer's circle
        Text computer = new Text("Computer");
        //sets font, size, bolds
        computer.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        //sets x coor for text
        computer.setTranslateX(100);
        //sets y coor for text
        computer.setTranslateY(150);

        //creates text for option selection prompt
        Text optionSelect = new Text("Select an option: ");
        //sets font, size, bolds
        optionSelect.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        //sets x coor for text
        optionSelect.setTranslateX(100);
        //sets y coor for text
        optionSelect.setTranslateY(280);

        //creates new text called player to label player's circle
        Text player = new Text("Player");
        //font, size, bolds
        player.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        //sets x coor for text
        player.setTranslateX(100);
        //sets y coor for text
        player.setTranslateY(50);



        // creates a label for rock button
        Label rock = new Label("Rock");
        //sets font, size, bolds
        rock.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets x coor of label
        rock.setTranslateX(30);
        //sets y coor of label
        rock.setTranslateY(395);

        //creates new image for rock action event
        ImageView userimageview = new ImageView(getClass().getResource("rockpicjava2.png").toExternalForm());
        //sets image equal to node to add to Group
        Node rockuser = userimageview;
        //sets height
        userimageview.setFitHeight(80);
        //preserves ratio
        userimageview.setPreserveRatio(true);
        //sets x coor
        rockuser.setTranslateX(25);
        //sets y coor
        rockuser.setTranslateY(300);

        //creates new image for rock to translate to circle
        ImageView compimageviewrock = new ImageView(getClass().getResource("rockpicjava2.png").toExternalForm());
        //sets height
        compimageviewrock.setFitHeight(80);
        //preserves ratio
        compimageviewrock.setPreserveRatio(true);
        //sets x coor
        compimageviewrock.setTranslateX(25);
        //sets y coor
        compimageviewrock.setTranslateY(300);
        //sets equal to node for Group
        Node comprockimage = compimageviewrock;


        // creates a label
        Label paper = new Label("Paper");
        //sets font, bolds, size
        paper.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets x coor
        paper.setTranslateX(175);
        //sets y coor
        paper.setTranslateY(395);

        //creates new image for paper action event
        ImageView userimageview2 = new ImageView(getClass().getResource("paperpicjava.png").toExternalForm());
        //creates node for image
        Node paperuser = userimageview2;
        //sets height
        userimageview2.setFitHeight(80);
        //preserves ratio
        userimageview2.setPreserveRatio(true);
        //sets x coor
        paperuser.setTranslateX(170);
        //sets y coor
        paperuser.setTranslateY(300);

        //creates image to translate into circle
        ImageView compimageviewpaper = new ImageView(getClass().getResource("paperpicjava.png").toExternalForm());
        //sets height
        compimageviewpaper.setFitHeight(80);
        //preserves ratio
        compimageviewpaper.setPreserveRatio(true);
        //sets x coor
        compimageviewpaper.setTranslateX(170);
        //sets y coor
        compimageviewpaper.setTranslateY(300);
        //creates node to hold image
        Node comppaperimage = compimageviewpaper;



        // creates a label for scissors
        Label scissors = new Label("Scissors");
        //sets size, font, bolds
        scissors.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets x coor
        scissors.setTranslateX(295);
        //sets y coor
        scissors.setTranslateY(395);

        //creates image for scissors action event
        ImageView userimageview3 = new ImageView(getClass().getResource("scissorspicjava.png").toExternalForm());
        //creates node to hold image
        Node scissoruser = userimageview3;
        //sets height
        userimageview3.setFitHeight(80);
        //preserves ratio
        userimageview3.setPreserveRatio(true);
        //sets x coor
        scissoruser.setTranslateX(300);
        //sets y coor
        scissoruser.setTranslateY(300);

        //creates image for scissor translation into circle after button clicked
        ImageView compimageviewscissors = new ImageView(getClass().getResource("scissorspicjava.png").toExternalForm());
        //fits height
        compimageviewscissors.setFitHeight(80);
        //preserves ratio
        compimageviewscissors.setPreserveRatio(true);
        //sets x coor
        compimageviewscissors.setTranslateX(300);
        //sets y coor
        compimageviewscissors.setTranslateY(300);
        //sets image to node
        Node compscissorsimage = compimageviewscissors;




        // creates a label for lizard button
        Label lizard = new Label("Lizard");
        //sets font, size, bolds
        lizard.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets x coor
        lizard.setTranslateX(425);
        //sets y coor
        lizard.setTranslateY(395);

        //creates image for action event
        ImageView userimageview4 = new ImageView(getClass().getResource("lizardpicjava.png").toExternalForm());
        //sets to node
        Node lizarduser = userimageview4;
        //sets height
        userimageview4.setFitHeight(80);
        //preserves ratio
        userimageview4.setPreserveRatio(true);
        //sets x coor
        lizarduser.setTranslateX(430);
        //sets y coor
        lizarduser.setTranslateY(300);

        //creates new imageview for translation of image to circle
        ImageView compimageviewlizard = new ImageView(getClass().getResource("lizardpicjava.png").toExternalForm());
        //sets height
        compimageviewlizard.setFitHeight(80);
        //preserves ratio
        compimageviewlizard.setPreserveRatio(true);
        //sets x coor
        compimageviewlizard.setTranslateX(430);
        //sets y coor
        compimageviewlizard.setTranslateY(300);
        //sets equal to node
        Node complizardimage = compimageviewlizard;


        // creates a label for spock
        Label spock = new Label("Spock");
        //sets font, size, bolds
        spock.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets x coor
        spock.setTranslateX(550);
        //sets x coor
        spock.setTranslateY(395);

        //creates new image for action event
        ImageView userimageview5 = new ImageView(getClass().getResource("spockpicjava.png").toExternalForm());
        userimageview5.setPreserveRatio(true);
        userimageview5.setFitHeight(80);
        //sets equal to node
        Node spockuser = userimageview5;
        //sets x coor
        spockuser.setTranslateX(545);
        //sets y coor
        spockuser.setTranslateY(300);

        //creates image for action event
        ImageView compimageviewspock = new ImageView(getClass().getResource("spockpicjava.png").toExternalForm());
        //sets height
        compimageviewspock.setFitHeight(80);
        //preserves ratio
        compimageviewspock.setPreserveRatio(true);
        //sets x coor
        compimageviewspock.setTranslateX(430);
        //sets y coor
        compimageviewspock.setTranslateY(300);
        //sets equal to node
        Node compspockimage = compimageviewspock;

        //creates label for player wins
        Label playerwins = new Label("You win!");
        //sets size, font, bolds
        playerwins.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node playerwon = playerwins;

        //creates label for player loss
        Label playerloses = new Label("You lose!");
        //sets font, size, bolds
        playerloses.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node playerlost = playerloses;

        //creates label for tie
        Label itsatie = new Label("It's a tie!");
        //sets font, size, bolds
        itsatie.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node tie = itsatie;

        //creates label for rock beats lizard scenario
        Label rockcrushlizard = new Label("Rock crushes Lizard!");
        //sets font, size, bolds
        rockcrushlizard.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node rockbeatlizard = rockcrushlizard;

        //creates label for rock beats scissors scenario
        Label rockcrushesscissors = new Label("Rock crushes Scissors!");
        //sets font, size, bolds
        rockcrushesscissors.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node rockbeatscissors = rockcrushesscissors;

        //creates label for paper beats rock scenario
        Label papercoversrock = new Label("Paper covers Rock!");
        //sets font, size, bolds
        papercoversrock.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node paperbeatrock = papercoversrock;

        //creates label for paper beats spock scenario
        Label paperdisprovesspock = new Label("Paper disproves Spock!");
        //sets font, size, bolds
        paperdisprovesspock.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node paperbeatspock = paperdisprovesspock;

        //creates label for scissors beats paper scenario
        Label scissorscutspaper = new Label("Scissors cuts Paper!");
        //sets font, size, bolds
        scissorscutspaper.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node scissorbeatpaper = scissorscutspaper;

        //creates label for scissors beats lizard scenario
        Label scissorsdecapitateslizard = new Label("Scissors decapitates Lizard!");
        //sets font, size, bolds
        scissorsdecapitateslizard.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node scissorbeatlizard = scissorsdecapitateslizard;

        //creates label for lizard beats paper scenario
        Label lizardeatspaper = new Label("Lizard eats Paper!");
        //sets font, size, bolds
        lizardeatspaper.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node lizardbeatpaper = lizardeatspaper;

        //creates label for lizard beats spock scenario
        Label lizardpoisonsspock = new Label("Lizard poisons Spock!");
        //sets font, size, bolds
        lizardpoisonsspock.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        //sets font, size, bolds
        Node lizardbeatspock = lizardpoisonsspock;

        //creates label for spock beats rock scenario
        Label spockvaporizesrock = new Label("Spock vaporizes Rock!");
        //sets font, size, bolds
        spockvaporizesrock.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node spockbeatrock = spockvaporizesrock;

        //creates label for spock beats scissors scenario
        Label spocksmashesscissors = new Label("Spock smashes Scissors!");
        //sets font, size, bolds
        spocksmashesscissors.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        //sets equal to node to add to group
        Node spockbeatscissors = spocksmashesscissors;

        //turns off text visibility
        tie.setVisible(false);
        rockbeatscissors.setVisible(false);
        rockbeatlizard.setVisible(false);
        paperbeatspock.setVisible(false);
        paperbeatrock.setVisible(false);
        scissorbeatlizard.setVisible(false);
        scissorbeatpaper.setVisible(false);
        lizardbeatpaper.setVisible(false);
        lizardbeatspock.setVisible(false);
        spockbeatrock.setVisible(false);
        spockbeatscissors.setVisible(false);
        playerlost.setVisible(false);
        playerwon.setVisible(false);

        //action event of rock
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {

                //redeclares height in action event
                userimageview.setFitHeight(80);
                //represerves ratio
                userimageview.setPreserveRatio(true);
                //sets new x coor for image
                rockuser.setTranslateX(258);
                //sets new y coor image
                rockuser.setTranslateY(15);


                //cancels buttons after after event
//	    	            	rockbutton.setCancelButton(true);
//	    	            	paperbutton.setCancelButton(true);
//            				spockbutton.setCancelButton(true);
//            				scissorsbutton.setCancelButton(true);
//            				lizardbutton.setCancelButton(true);

                //if true statement to set randomized computer numbers equal to different scenarios
                if (true) {

                    //if comp is randomized number is 0
                    if (computerChoice == 0) {

                        //translates x coor
                        comprockimage.setTranslateX(258);
                        //translates y coor
                        comprockimage.setTranslateY(110);

                        //translates text x coor
                        tie.setTranslateX(400);
                        //translates text y coor
                        tie.setTranslateY(110);
                        //turns visibility on
                        tie.setVisible(true);



                    }

                    //if comp is randomized number is 1
                    else if (computerChoice == 1) {

                        //translates x coor
                        comppaperimage.setTranslateX(258);
                        //translates y coor
                        comppaperimage.setTranslateY(110);

                        //translates text x coor
                        paperbeatrock.setTranslateX(400);
                        //translates text y coor
                        paperbeatrock.setTranslateY(110);
                        //toggles visibility
                        paperbeatrock.setVisible(true);

                        //translates text x coor
                        playerlost.setTranslateX(400);
                        //translates text y coor
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);
                    }

                    //if comp is randomized number is 2
                    else if (computerChoice == 2) {

                        //translates x coor
                        compscissorsimage.setTranslateX(258);
                        //translates y coor
                        compscissorsimage.setTranslateY(110);

                        //translates text x coor
                        rockbeatscissors.setTranslateX(400);
                        //translates text y coor
                        rockbeatscissors.setTranslateY(110);
                        //toggles visibility
                        rockbeatscissors.setVisible(true);

                        //translates text x coor
                        playerwon.setTranslateX(400);
                        //translates text y coor
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);

                    }

                    //if comp is randomized number is 3
                    else if (computerChoice == 3) {

                        //translates x coor
                        complizardimage.setTranslateX(258);
                        //translates y coor
                        complizardimage.setTranslateY(110);

                        //translates text x coor
                        rockbeatlizard.setTranslateX(400);
                        //translates text y coor
                        rockbeatlizard.setTranslateY(110);
                        //toggles visibility
                        rockbeatlizard.setVisible(true);
                        //translates text x coor
                        playerwon.setTranslateX(400);
                        //translates text y coor
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);
                    }

                    //if comp is randomized number is 4
                    else if(computerChoice == 4) {

                        //translates x coor
                        compspockimage.setTranslateX(258);
                        //translates y coor
                        compspockimage.setTranslateY(110);

                        //translates text x coor
                        spockbeatrock.setTranslateX(400);
                        //translates text y coor
                        spockbeatrock.setTranslateY(110);
                        //toggles visibility
                        spockbeatrock.setVisible(true);

                        //translates text x coor
                        playerlost.setTranslateX(400);
                        //translates text y coor
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);

                    }



                }


            }

        };





        //sets action of button
        rockbutton.setOnAction(event);



        //action event if paper
        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                //redeclares height in action event
                userimageview2.setFitHeight(80);
                //represerves ratio
                userimageview2.setPreserveRatio(true);
                //sets new x coor for image
                paperuser.setTranslateX(258);
                //sets new y coor for image
                paperuser.setTranslateY(15);

                //cancels paper button event after one click
                paperbutton.setCancelButton(true);

                if (true) {

                    //cancels all buttons
                    rockbutton.setCancelButton(true);
                    spockbutton.setCancelButton(true);
                    scissorsbutton.setCancelButton(true);
                    lizardbutton.setCancelButton(true);

                    //if comp is randomized number is 0
                    if (computerChoice == 0) {

                        //translates image to circle
                        comprockimage.setTranslateX(258);
                        comprockimage.setTranslateY(110);

                        //translates text to screen
                        paperbeatrock.setTranslateX(400);
                        paperbeatrock.setTranslateY(110);
                        //toggles visibility
                        paperbeatrock.setVisible(true);

                        //translates text to screen
                        playerwon.setTranslateX(400);
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);


                    }

                    //if comp is randomized number is 1
                    else if (computerChoice == 1) {

                        //translates image to circle
                        comppaperimage.setTranslateX(258);
                        comppaperimage.setTranslateY(110);

                        //translates text to screen
                        tie.setTranslateX(400);
                        tie.setTranslateY(90);
                        //toggles visibility
                        tie.setVisible(true);


                    }

                    //if comp is randomized number is 2
                    else if (computerChoice == 2) {

                        //translates image to screen
                        compscissorsimage.setTranslateX(258);
                        compscissorsimage.setTranslateY(110);

                        //translates text to screen
                        scissorbeatpaper.setTranslateX(400);
                        scissorbeatpaper.setTranslateY(110);
                        //toggles visibility
                        scissorbeatpaper.setVisible(true);

                        //translates text to screen
                        playerlost.setTranslateX(400);
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);
                    }

                    //if comp is randomized number is 3
                    else if (computerChoice == 3) {

                        //translates image to screen
                        complizardimage.setTranslateX(258);
                        complizardimage.setTranslateY(110);

                        //translates text to screen
                        lizardbeatpaper.setTranslateX(400);
                        lizardbeatpaper.setTranslateY(110);
                        //toggles visibility
                        lizardbeatpaper.setVisible(true);

                        //translates text to screen
                        playerlost.setTranslateX(400);
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);
                    }

                    //if comp is randomized number is 4
                    else if(computerChoice == 4) {

                        //translates image to screen
                        compspockimage.setTranslateX(258);
                        compspockimage.setTranslateY(110);

                        //translates text to screen
                        paperbeatspock.setTranslateX(400);
                        paperbeatspock.setTranslateY(110);
                        //toggles visibility
                        paperbeatspock.setVisible(true);

                        //translates text to screen
                        playerwon.setTranslateX(400);
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);
                    }
                }
            }


        };

        //sets action of button
        paperbutton.setOnAction(event2);

        //action event of scissors
        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                //sets image to screen
                userimageview3.setFitHeight(80);
                userimageview3.setPreserveRatio(true);
                scissoruser.setTranslateX(258);
                scissoruser.setTranslateY(15);

                //button event ends after one click
                scissorsbutton.setCancelButton(true);

                if (true) {
                    //events end after one click
                    paperbutton.setCancelButton(true);
                    spockbutton.setCancelButton(true);
                    rockbutton.setCancelButton(true);
                    lizardbutton.setCancelButton(true);

                    //if comp is randomized number is 0
                    if (computerChoice == 0) {

                        //translates image to screen
                        comprockimage.setTranslateX(258);
                        comprockimage.setTranslateY(110);

                        //translates text to screen
                        rockbeatscissors.setTranslateX(400);
                        rockbeatscissors.setTranslateY(110);
                        //toggles visibility
                        rockbeatscissors.setVisible(true);

                        //translates text to screen
                        playerlost.setTranslateX(400);
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);
                    }

                    //if comp is randomized number is 1
                    else if (computerChoice == 1) {

                        //translates image to screen
                        comppaperimage.setTranslateX(258);
                        comppaperimage.setTranslateY(110);

                        //translates text to screen
                        scissorbeatpaper.setTranslateX(400);
                        scissorbeatpaper.setTranslateY(110);
                        //toggles visibility
                        scissorbeatpaper.setVisible(true);
                        //translates text to screen
                        playerwon.setTranslateX(400);
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);


                    }

                    //if comp is randomized number is 2
                    else if (computerChoice == 2) {

                        //translates image to screen
                        compscissorsimage.setTranslateX(258);
                        compscissorsimage.setTranslateY(110);

                        //translates text to screen
                        tie.setTranslateX(400);
                        tie.setTranslateY(90);
                        //toggles visibility
                        tie.setVisible(true);
                    }

                    //if comp is randomized number is 3
                    else if (computerChoice == 3) {

                        //translates image to screen
                        complizardimage.setTranslateX(258);
                        complizardimage.setTranslateY(110);

                        //translates text to screen
                        scissorbeatlizard.setTranslateX(400);
                        scissorbeatlizard.setTranslateY(110);
                        //toggles visibility
                        scissorbeatlizard.setVisible(true);

                        //translates text to screen
                        playerwon.setTranslateX(400);
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);
                    }

                    //if comp is randomized number is 4
                    else if(computerChoice == 4) {

                        //translates image to screen
                        compspockimage.setTranslateX(258);
                        compspockimage.setTranslateY(110);

                        //translates text to screen
                        spockbeatscissors.setTranslateX(400);
                        spockbeatscissors.setTranslateY(110);
                        //toggles visibility
                        spockbeatscissors.setVisible(true);

                        //translates text to screen
                        playerlost.setTranslateX(400);
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);
                    }

                }


            }


        };

        //sets action of button
        scissorsbutton.setOnAction(event3);





        // action event of lizard
        EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {

                //sets image to screen
                userimageview4.setFitHeight(80);
                userimageview4.setPreserveRatio(true);
                lizarduser.setTranslateX(270);
                lizarduser.setTranslateY(15);

                //cancels event after one click
                lizardbutton.setCancelButton(true);

                if (true) {
                    //cancels events after one click
                    paperbutton.setCancelButton(true);
                    rockbutton.setCancelButton(true);
                    scissorsbutton.setCancelButton(true);
                    spockbutton.setCancelButton(true);

                    //if comp is randomized number is 0
                    if (computerChoice == 0) {

                        //translates image to screen
                        comprockimage.setTranslateX(258);
                        comprockimage.setTranslateY(110);

                        //translates text to screen
                        rockbeatlizard.setTranslateX(400);
                        rockbeatlizard.setTranslateY(110);
                        //toggles visibility
                        rockbeatlizard.setVisible(true);

                        //translates text to screen
                        playerlost.setTranslateX(400);
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);
                    }

                    //if comp is randomized number is 1
                    else if (computerChoice == 1) {

                        //translates image to screen
                        comppaperimage.setTranslateX(258);
                        comppaperimage.setTranslateY(110);

                        //translates text to screen
                        lizardbeatpaper.setTranslateX(400);
                        lizardbeatpaper.setTranslateY(110);
                        //toggles visibility
                        lizardbeatpaper.setVisible(true);

                        //translates text to screen
                        playerwon.setTranslateX(400);
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);


                    }

                    //if comp is randomized number is 2
                    else if (computerChoice == 2) {

                        //translates image to screen
                        compscissorsimage.setTranslateX(258);
                        compscissorsimage.setTranslateY(110);

                        //translates text to screen
                        scissorbeatlizard.setTranslateX(400);
                        scissorbeatlizard.setTranslateY(110);
                        //toggles visibility
                        scissorbeatlizard.setVisible(true);

                        //translates text to screen
                        playerlost.setTranslateX(400);
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);
                    }

                    //if comp is randomized number is 3
                    else if (computerChoice == 3) {

                        //translates image to screen
                        complizardimage.setTranslateX(258);
                        complizardimage.setTranslateY(110);

                        //translates text to screen
                        tie.setTranslateX(400);
                        tie.setTranslateY(110);
                        //toggles visibility
                        tie.setVisible(true);
                    }

                    //if comp is randomized number is 4
                    else if(computerChoice == 4) {

                        //translates image to screen
                        compspockimage.setTranslateX(258);
                        compspockimage.setTranslateY(110);

                        //translates text to screen
                        lizardbeatspock.setTranslateX(400);
                        lizardbeatspock.setTranslateY(110);
                        //toggles visibility
                        lizardbeatspock.setVisible(true);

                        //translates text to screen
                        playerwon.setTranslateX(400);
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);

                    }
                }
            }


        };

        //sets action of lizard button
        lizardbutton.setOnAction(event4);



        // action event of spock button
        EventHandler<ActionEvent> event5 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                //sets image to screen
                userimageview5.setFitHeight(80);
                userimageview5.setPreserveRatio(true);
                spockuser.setTranslateX(255);
                spockuser.setTranslateY(15);

                //cancels button after one click
                spockbutton.setCancelButton(true);
                if (true) {

                    paperbutton.setCancelButton(true);
                    rockbutton.setCancelButton(true);
                    scissorsbutton.setCancelButton(true);
                    lizardbutton.setCancelButton(true);

                    //if comp is randomized number is 0
                    if (computerChoice == 0) {

                        //translates image to screen
                        comprockimage.setTranslateX(258);
                        comprockimage.setTranslateY(110);

                        //translates text to screen
                        spockbeatrock.setTranslateX(400);
                        spockbeatrock.setTranslateY(110);
                        //toggles visibility
                        spockbeatrock.setVisible(true);

                        //translates text to screen
                        playerwon.setTranslateX(400);
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);

                    }

                    //if comp is randomized number is 1
                    else if (computerChoice == 1) {

                        //translates image to screen
                        comppaperimage.setTranslateX(258);
                        comppaperimage.setTranslateY(110);

                        //translates text to screen
                        paperbeatspock.setTranslateX(400);
                        paperbeatspock.setTranslateY(110);
                        //toggles visibility
                        paperbeatspock.setVisible(true);

                        //translates text to screen
                        playerlost.setTranslateX(400);
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);


                    }

                    //if comp is randomized number is 2
                    else if (computerChoice == 2) {

                        //translates image to screen
                        compscissorsimage.setTranslateX(258);
                        compscissorsimage.setTranslateY(110);

                        //translates text to screen
                        spockbeatscissors.setTranslateX(400);
                        spockbeatscissors.setTranslateY(110);
                        //toggles visibility
                        spockbeatscissors.setVisible(true);

                        //translates text to screen
                        playerwon.setTranslateX(400);
                        playerwon.setTranslateY(90);
                        //toggles visibility
                        playerwon.setVisible(true);
                    }

                    //if comp is randomized number is 3
                    else if (computerChoice == 3) {

                        //translates image to screen
                        complizardimage.setTranslateX(258);
                        complizardimage.setTranslateY(110);

                        //translates text to screen
                        lizardbeatspock.setTranslateX(400);
                        lizardbeatspock.setTranslateY(110);
                        //toggles visibility
                        lizardbeatspock.setVisible(true);

                        //translates text to screen
                        playerlost.setTranslateX(400);
                        playerlost.setTranslateY(90);
                        //toggles visibility
                        playerlost.setVisible(true);
                    }

                    //if comp is randomized number is 4
                    else if(computerChoice == 4) {

                        //translates image to screen
                        compspockimage.setTranslateX(258);
                        compspockimage.setTranslateY(110);

                        //translates text to screen
                        tie.setTranslateX(400);
                        tie.setTranslateY(110);
                        //toggles visibility
                        tie.setVisible(true);
                    }
                }
            }





        };

        //sets action of button
        spockbutton.setOnAction(event5);



        //puts all nodes and buttons on scene
        Group root = new Group(playerwon, playerlost, spockbeatrock, spockbeatscissors, scissorbeatlizard, lizardbeatpaper, lizardbeatspock, paperbeatspock, scissorbeatpaper, paperbeatrock, rockbeatscissors, rockbeatlizard, compspockimage, complizardimage, compscissorsimage, comppaperimage, tie, comprockimage, spockuser, lizarduser, scissoruser, paperuser, rockuser, rockbutton, paperbutton, scissorsbutton, lizardbutton, spockbutton, computer, player, rock, paper, scissors, lizard, spock, optionSelect, circle, circle2);
        //sets stage
        Scene scene = new Scene(root, 700, 550, Color.GHOSTWHITE);

        //sets window title
        window.setTitle("Rock-Paper-Scissors-Lizard-Spock Game!");
        //starts scene in window
        window.setScene(scene);
        //shows scene
        window.show();


    }//end stage


}//end class
