package main.scala.composite


/**
  * Created by jakeholdom on 21/04/2017.
  */
case class HtmlParentElement(s: String) extends HtmlTag(s) {
  override def setStartTag(tag: String): Unit = startTag = tag

  override def setEndTag(tag: String): Unit = endTag = tag

  override def setTagBody(tagBody: String): Unit = bodyTag = tagBody

  override def generateHtml: Unit = {

    println(startTag)
    print(bodyTag)
    for (child <- children){
      child.generateHtml
    }
    println(endTag)

  }
}
