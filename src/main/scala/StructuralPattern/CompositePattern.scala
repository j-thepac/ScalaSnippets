package StructuralPattern
import scala.collection.mutable._
object CompositePattern {
  def main(args: Array[String]): Unit = {
    val kennel:Dogs=new Dogs()
    val Tommy:Dog=new Pommerian
    kennel.add_Dog(Tommy)
    kennel.bark
  }
}
abstract class Dog{ def bark}
class Dogs extends Dog{
  val dogs:ArrayBuffer[Dog]=new ArrayBuffer[Dog]()
  def add_Dog(dog:Dog)=this.dogs.append(dog)
  override def bark: Unit = {
    for (dog<-dogs)
      dog.bark
  }
}
class Pommerian extends Dog{
  override def bark: Unit = println("tommy : Wof Wof ...")
}