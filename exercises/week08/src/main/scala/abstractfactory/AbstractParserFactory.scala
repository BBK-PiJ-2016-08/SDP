package main.scala.abstractfactory

import main.scala.abstractfactory.parsers.XMLParser
/**
  * Created by jakeholdom on 05/03/2017.
  */

trait AbstractParserFactory {
  def getParserInstance(parserType: String): XMLParser

}