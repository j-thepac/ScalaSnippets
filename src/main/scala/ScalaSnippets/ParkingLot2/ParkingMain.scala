package ScalaSnippets.ParkingLot2
object ParkingMain extends App{
  val zen:Car= new Car()
  val floor=new Floor(2)
  floor.addVehicle(zen)
  floor.addVehicle(zen)
  floor.addVehicle(zen)
  print(floor.compactSpots.length)
}