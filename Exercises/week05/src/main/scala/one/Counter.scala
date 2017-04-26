package one

/**
  * Created by jakeholdom on 26/04/2017.
  */
case class Counter(int: Int = 0) {

  var number : Int = int

  def inc(int: Int = 1): Counter = {
    Counter(number + int)
  }
  def dec(int: Int = 1): Counter ={
    Counter(number - int)
  }
  def count : Int = {

    number
  }


  def adjust(adder: Adder) : Counter = {
    Counter(adder.add(number))
  }

}


