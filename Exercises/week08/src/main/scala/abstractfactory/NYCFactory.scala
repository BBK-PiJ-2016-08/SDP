package main.scala.abstractfactory

import main.scala.abstractfactory.parsers.XMLParser
/**
  * Created by jakeholdom on 06/03/2017.
  */
class NYCFactory extends AbstractParserFactory{
  override def getParserInstance(parserType: String): XMLParser = ???
}