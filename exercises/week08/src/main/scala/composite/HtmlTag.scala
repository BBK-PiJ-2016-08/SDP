package main.scala.composite

/**
  * Created by jakeholdom on 21/04/2017.
  */
abstract class HtmlTag(tagName: String) {
  var startTag :String = ""
  var endTag : String = ""
  var bodyTag: String = ""

  var children:List[HtmlTag] = Nil


  def getTagName: String = tagName

  def setStartTag(tag: String)

  def setEndTag(tag: String)

  def setTagBody(tagBody: String) = bodyTag = bodyTag

  def addChildTag(htmlTag: HtmlTag) = children = children :+ htmlTag

  def removeChildTag(htmlTag: HtmlTag) = children = children.filter(!_.equals(htmlTag))

  def getChildren: List[HtmlTag] = children

  def generateHtml
}

