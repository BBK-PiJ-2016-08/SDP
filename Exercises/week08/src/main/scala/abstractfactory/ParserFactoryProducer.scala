package main.scala.abstractfactory

/**
  * Created by jakeholdom on 06/03/2017.
  */
abstract case class ParserFactoryProducer() extends AbstractParserFactory {


  def getFactory(factory: String): AbstractParserFactory = {

    if (factory.equals("NYCFactory")) {



    }
    null

  }



}