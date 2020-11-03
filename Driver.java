import javafx.application.Application;
import javafx.geometry.*;
import javafx.embed.swing.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;
import javafx.scene.text.Text;
import java.util.*;
import java.io.*;

public class Driver extends Application{
  static Stage menu = new Stage();
//  public Stage stage;
  private ToadsAndFrogs toadsAndFrogsGame = new ToadsAndFrogs();
  private TopplingDominoes topplingDominoesGame = new TopplingDominoes();
  private ElephantsAndRhinos elephantsAndRhinosGame = new ElephantsAndRhinos();
  private Chomp chompGame = new Chomp();
  private Mines minesGame = new Mines();
  private ColorChomp colorGame = new ColorChomp();

  public void start(Stage primaryStage){
    menu = primaryStage;
    primaryStage.setTitle("Game Menu");
    HBox h = new HBox(10);
    VBox v = new VBox(10);

    Button topplingDominoes = new Button("Toppling Dominoes");
    Button toadsAndFrogs = new Button("Toads And Frogs");
    Button elephantsAndRhinos = new Button("Elephants And Rhinos");
    Button chomp = new Button("Chomp");
    Button mines = new Button("Mines");
    Button color = new Button("Color Chomp");

    topplingDominoes.setMinSize(75,125);
    toadsAndFrogs.setMinSize(75,125);
    elephantsAndRhinos.setMinSize(75,125);
    chomp.setMinSize(75,125);
    mines.setMinSize(75,125);
    color.setMinSize(75,125);

    h.getChildren().add(toadsAndFrogs);
    h.getChildren().add(topplingDominoes);
    h.getChildren().add(elephantsAndRhinos);
    h.getChildren().add(chomp);
    h.getChildren().add(color);
    h.getChildren().add(mines);
    v.getChildren().add(h);

    ScrollPane menuWindow = new ScrollPane(v);
    menu.setScene(new Scene(menuWindow));
    menu.show();
    menu.sizeToScene();


    toadsAndFrogs.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e){
        toadsAndFrogsGame.gameOver = false;
        toadsAndFrogsGame.start(ToadsAndFrogs.lightedStage);
        menu.close();
      }
    });

    topplingDominoes.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e){
        topplingDominoesGame.gameOver = false;
        topplingDominoesGame.start(TopplingDominoes.lightedStage);
        menu.close();
      }
    });

    elephantsAndRhinos.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e){
        elephantsAndRhinosGame.gameOver = false;
        elephantsAndRhinosGame.start(ElephantsAndRhinos.lightedStage);
        menu.close();
      }
    });

    chomp.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e){
        chompGame.gameOver = false;
        chompGame.start(Chomp.lightedStage);
        menu.close();
      }
    });

    color.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e){
        colorGame.gameOver = false;
        colorGame.start(ColorChomp.lightedStage);
        menu.close();
      }
    });

    mines.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e){
        minesGame.gameOver = false;
        minesGame.start(Mines.lightedStage);
        menu.close();
      }
    });

  }
}
