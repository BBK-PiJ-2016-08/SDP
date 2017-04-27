package main.scala.abstractfactory
import main.scala.abstractfactory.NYCFactory
import main.scala.abstractfactory.LondonFactory

/**
  * Created by jakeholdom on 06/03/2017.
  */
object ParserFactoryProducer{


  def getFactory(factory: String): AbstractParserFactory = factory match {
    case "NYCFactory" => new NYCFactory
    case "LondonFactory" => new LondonFactory
  }



}