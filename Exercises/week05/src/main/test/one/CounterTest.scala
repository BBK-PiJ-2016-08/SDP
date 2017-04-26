package one

import org.scalatest.FunSuite
/**
  * Created by jakeholdom on 26/04/2017.
  */
class CounterTest extends FunSuite{


  test("[1] Counter should increment and decrement by one") {

    val counter = one.Counter(10)

    assert(counter.inc().dec().inc().inc().count == 12)

  }
  test("[2] Counter should increment and decrement by the number given") {

    val counter = one.Counter(10)

    assert(counter.inc(3).dec(2).inc(4).inc(4).count == 19)

  }

  test("[3] Adder should add numbers to count") {

    val counter = one.Counter(10)
    val adder = new one.Adder(10)

    assert(counter.adjust(adder).count == 20)

  }

}
