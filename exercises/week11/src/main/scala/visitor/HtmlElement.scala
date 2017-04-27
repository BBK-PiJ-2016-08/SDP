package main.scala.visitor

case class HtmlElement(var tagName: String) extends HtmlTag {
  var startTag: String = ""
  var endTag: String = ""

  private var tagBody: String = ""

  override def setTagBody(tagBody: String): Unit = this.tagBody = tagBody
  override def generateHtml(): Unit = {
    print(startTag)
    print(tagBody)
    println(endTag)
  }
  override def accept(visitor: Visitor): Unit = visitor.visit(this)

  def getEndTag(): String = this.endTag
  def getStartTag(): String = this.startTag
  def getTagName(): String = this.tagName
  def setEndTag(tag: String): Unit = this.endTag = tag
  def setStartTag(tag: String): Unit = this.startTag = tag
}
