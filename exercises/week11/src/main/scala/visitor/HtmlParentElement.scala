package main.scala.visitor


case class HtmlParentElement(var tagName: String) extends HtmlTag {
  var startTag: String = ""
  var endTag: String = ""

  private var childrenTag = List[HtmlTag]()

  override def addChildTag(htmlTag: HtmlTag): Unit = {
    childrenTag = childrenTag :+ htmlTag
  }
  override def removeChildTag(htmlTag: HtmlTag): Unit = {

    childrenTag = childrenTag.filter(!_.equals(htmlTag))
  }
  override def getChildren() = childrenTag
  override def generateHtml(): Unit = {
    println(startTag)
    for (child <- childrenTag){
      child.generateHtml()
    }
    println(endTag)

  }
  override def accept(visitor: Visitor): Unit = visitor.visit(this)

  def getEndTag(): String = this.endTag
  def getStartTag(): String = this.startTag
  def getTagName(): String = tagName
  def setEndTag(tag: String): Unit = this.endTag = tag
  def setStartTag(tag: String): Unit = this.startTag = tag
}
