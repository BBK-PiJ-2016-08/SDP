package main.scala.builder

/**
  * Created by jakeholdom on 07/03/2017.
  */
object SedanCarBuilder extends CarBuilder {

  val car = new Car("Sedan")


  override def buildBodyStyle(): Unit = car.setBodyStyle("SedanBodyStyle")

  override def buildPower(): Unit = car.setPower("1000Bhp")

  override def buildEngine(): Unit = car.setEngine("SedanEngine")

  override def buildBreaks(): Unit = car.setBreaks("SedanBreaks")

  override def buildSeats(): Unit = car.setSeats("4")

  override def buildWindows(): Unit = car.setWindows("6")

  override def buildFuelType(): Unit = car.setFuelType("SedanFuelType")

  override def getCar: Car = {

    this.car
  }

}
