package main.scala.visitor

abstract class HtmlTag extends Element {
  def getTagName(): String
  def setStartTag(tag: String): Unit
  def getStartTag(): String
  def getEndTag(): String
  def setEndTag(tag: String): Unit

  def setTagBody(tagBody: String): Unit = {
    throw new UnsupportedOperationException("Error: Wrong tag")
  }
  def addChildTag(htmlTag: HtmlTag): Unit = {
    throw new UnsupportedOperationException("Error: Wrong tag")

  }
  def removeChildTag(htmlTag: HtmlTag): Unit = {
    throw new UnsupportedOperationException("Error: Wrong tag")

  }
  def getChildren(): List[HtmlTag] = {
    throw new UnsupportedOperationException("Error: Wrong tag")

  }
  def generateHtml(): Unit
}
