package main.scala.abstractfactory

import main.scala.abstractfactory.parsers._

/**
  * Created by jakeholdom on 06/03/2017.
  */
class NYCFactory extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "NYCORDER" => new NYCOrderXMLParser
    case "NYCERROR" => new NYCErrorXMLParser
    case "NYCFEEDBACK" => new NYCFeedbackXML
    case "NYCRESPONSE" => new NYCResponseXMLParser
  }
}
