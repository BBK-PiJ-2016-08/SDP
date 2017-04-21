/**
  * Created by jakeholdom on 21/03/2017.
  */

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.scene.shape.Rectangle
import scalafx.scene.paint.Color

object FirstGui extends JFXApp {


  stage = new JFXApp.PrimaryStage {
    title = "First GUI Test"
    scene = new Scene(800, 600){
      val button = new Button("Test")
      button.layoutX = 100
      button.layoutY = 100
      val rect = Rectangle(500, 300, 200, 200)
      rect.fill = Color.Cornsilk
      content = List(button, rect)


    }


  }


}
