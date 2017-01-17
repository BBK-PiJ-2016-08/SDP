package Week01.src

/**
  * Created by jakeholdom on 10/01/2017.
  */
object TaskOne {

  def main(args: Array[String]){

    var finished = false


    while(!finished) {
      val number = scala.io.StdIn.readInt()

      if (number != 0) {

        val numberHalved = number / 2

        println(numberHalved)

        if (numberHalved > 100) {
          println("That's a big number")

        } else {
          println("That's a Small number")

        }
      }else {

        finished = true
      }

    }


  }

}
