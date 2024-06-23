package ScalaSnippets.ParkingLot2

import scala.collection.mutable.ArrayBuffer
object O extends App {
  abstract class Vehicle

  case class Car() extends Vehicle

  case class Parking[+V](value: V)

  //1 Car
  val p1: Parking[Vehicle] = Parking[Car](new Car)

  // n Cars
  val n: ArrayBuffer[Parking[Vehicle]] = new ArrayBuffer[Parking[Vehicle]]()
  n.append(new Parking[Car](new Car()))
}