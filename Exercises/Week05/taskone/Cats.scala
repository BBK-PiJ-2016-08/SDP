package Week05.taskone

/**
  * Created by jakeholdom on 07/02/2017.
  */
sealed trait Feline {
  def dinner: String = this match {

    case Lion() => "Antelope"
    case Tiger() => "Tiger Food"
    case Panther() => "Licorice"
    case Cat() => "Mice"

  }

}

final case class Lion() extends Feline
final case class Tiger() extends Feline
final case class Panther() extends Feline
final case class Cat() extends Feline