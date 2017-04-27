package main.scala.abstractfactory

import main.scala.abstractfactory.parsers._
/**
  * Created by jakeholdom on 06/03/2017.
  */
class LondonFactory extends AbstractParserFactory{
  override def getParserInstance(parserType: String): XMLParser = parserType match  {
    case "LondonORDER" => new LondonOrderXMLParser
    case "LondonERROR" => new LondonErrorXMLParser
    case "LondonFEEDBACK" => new LondonFeedbackXML
    case "LondonRESPONSE" => new LondonResponseXMLParser

  }
}
