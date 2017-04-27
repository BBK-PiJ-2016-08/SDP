package main.scala.facadepattern

/**
  * Created by jakeholdom on 21/04/2017.
  */
//TODO

case class ScheduleServerImpl() extends ScheduleServer {
  override def startBooting: Unit = {
    println("start booting")
    //Start booking
  }

  override def readSystemConfigFile: Unit = {
    println("Read system config file")
    //Read system config file
  }

  override def init: Unit = {
    println("initialise")
    //initialise
  }

  override def initializeContext: Unit = {
    println("Initialise context")
    //Initialise context
  }

  override def initializeListeners: Unit = {
    println("initialise listeners")
    //initialise listeners
  }

  override def createSystemObjects: Unit = {
    println("create system objects")
    //create system objects
  }

  override def releaseProcesses: Unit = {
    println("release processes")
    //release processes
  }

  override def destory: Unit = {
    println("destroy")
    //destroy
  }

  override def destroySystemObjects: Unit = {
    println("destroy System Objects")
    //destroy System Objects
  }

  override def destoryListeners: Unit = {
    println("destroy listeners")
    //destroy listeners
  }

  override def destoryContext: Unit = {
    println("Destroy context")
    //Destroy context
  }

  override def shutdown: Unit = {
    println("shutdown")
    //shutdown
  }
}