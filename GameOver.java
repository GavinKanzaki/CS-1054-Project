import javafx.application.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.util.*;
import javafx.scene.paint.*;
import javafx.geometry.*;
import javafx.scene.image.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import java.net.*;
import javafx.geometry.*;


public class GameOver
 {
      private Stage stage;
      private Scene scene;

      public GameOver(Stage stage)
      {
            this.stage = stage;
            createScene();
      }  

      private void createScene()
      {
            VBox root = new VBox();
            root.setAlignment(Pos.CENTER);
  
            Text title = new Text("GAME OVER");
            title.setFont(Font.font("Arial", 40));
           
            scene = new Scene(root, 600, 400);
      }

      public void show()
      {
            stage.setScene(scene);
      }

  }