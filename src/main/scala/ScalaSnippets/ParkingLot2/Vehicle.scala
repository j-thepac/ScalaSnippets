package ScalaSnippets.ParkingLot2

sealed abstract class Vehicle {

}


class Car extends Vehicle with Compact
