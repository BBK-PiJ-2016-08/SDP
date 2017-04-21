package Week05.taskone

/**
  * Created by jakeholdom on 07/02/2017.
  */
sealed trait TrafficLightsAgain{
  def next: TrafficLightsAgain = this match {
    case Red2 => Green2
    case Green2 => Amber2
    case Amber2 => Red2

  }

}

final case object Red2 extends TrafficLightsAgain
final case object Green2 extends TrafficLightsAgain
final case object Amber2 extends TrafficLightsAgain