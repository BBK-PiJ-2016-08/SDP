package one

import org.scalatest.FunSuite
/**
  * Created by jakeholdom on 26/04/2017.
  */
class CounterTest extends FunSuite{


  test("[1] Counter should increment and decrement the number") {

    val counter = new one.Counter(10)

    assert(counter.inc.dec.inc.inc.count == 12)

  }
}
