package ScalaSnippets.ParkingLot2
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


class ParkingLot {
val floors:ArrayBuffer[Floor]=new ArrayBuffer[Floor]()

  def entry(vehicle:Vehicle) = ???
  def exit(vehicle:Vehicle):Unit = ???
}

class Floor(val capacity:Int){
  val compactSpots:ArrayBuffer[CompactSpot]=new ArrayBuffer[CompactSpot]()

  def addVehicle(vehicle:Vehicle)={
    vehicle match{
      case _:Compact => {
        if(compactSpots.length<capacity)
         compactSpots.append(CompactSpot(vehicle.asInstanceOf[Car]))
        else print("Capacity Reached ")
      }
    }
  }

}

abstract class Spot(val vehicle:Vehicle)
case class CompactSpot(override val vehicle:Vehicle) extends Spot (vehicle) with Compact




