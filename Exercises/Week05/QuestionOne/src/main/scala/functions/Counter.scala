package functions

/**
  * Created by jakeholdom on 10/02/2017.
  */
case class Counter(var number : Int = 0) {


  def inc(numToInc : Int = 1): Counter = {

    val decNumber = copy(number + numToInc)
    decNumber
  }

  def dec(numToDec : Int = 1): Counter = {

    val decNumber = copy(number - numToDec)

    decNumber
  }

  def count: Counter ={
    this
  }

  def getNumber: Int ={
    this.number
  }


}

