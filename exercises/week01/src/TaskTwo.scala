/**
  * Created by jakeholdom on 10/01/2017.
  */
object TaskTwo {

  def main(args: Array[String]){

    var finished = false


    while(!finished) {
      val number = scala.io.StdIn.readInt()

      if (number != 0) {

        println("You entered the number " + number + " The square root is " + scala.math.sqrt(number))

      }else {

        finished = true
      }

    }


  }

}
