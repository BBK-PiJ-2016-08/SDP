package main.scala.builder

/**
  * Created by jakeholdom on 07/03/2017.
  */
object SportsCarBuilder extends CarBuilder{
  val car = new Car("Sports")

  override def getCar: Car ={

    this.car
  }
  override def buildBodyStyle(): Unit = car.setBodyStyle("SportsBodyStyle")

  override def buildPower(): Unit = car.setPower("2000Bhp")

  override def buildEngine(): Unit = car.setEngine("SportsEngine")

  override def buildBreaks(): Unit = car.setBreaks("SportsBreaks")

  override def buildSeats(): Unit = car.setSeats("4")

  override def buildWindows(): Unit = car.setWindows("6")

  override def buildFuelType(): Unit = car.setFuelType("SportsFuelType")

}
