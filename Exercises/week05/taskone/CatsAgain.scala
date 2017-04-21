package Week05.taskone

/**
  * Created by jakeholdom on 07/02/2017.
  */
sealed trait Feline2 {
  def dinner: String

}

final case class Lion2() extends Feline2 {
  def dinner = "Antelope"
}
final case class Tiger2() extends Feline2 {
  def dinner = "Tiger Food"
}
final case class Panther2() extends Feline2 {
  def dinner = "Licorice"
}
final case class Cat2() extends Feline2 {
  def dinner = "Mice"
}


