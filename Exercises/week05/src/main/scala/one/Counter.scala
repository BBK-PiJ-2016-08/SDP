package one

/**
  * Created by jakeholdom on 26/04/2017.
  */
class Counter(int: Int) {

  var number : Int = int

  def inc: Counter = {
    new Counter(number + 1)
  }
  def dec: Counter ={
    new Counter(number - 1)
  }
  def count : Int = {

    number
  }
}
