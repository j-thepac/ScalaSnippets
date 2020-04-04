package StructuralPattern
import scala.collection.mutable._
object DecoratorPattern {
  def main(args: Array[String]): Unit = {
    val coffee:Coffee=new Coffee
    val addons:Addons=new Addons
    val finalCoffee:MadeCoffee=addons.add_cream(coffee.basic_coffee)
    println(finalCoffee.cost,finalCoffee.content.toString())
  }
}

case class MadeCoffee(cost:Int, content:ArrayBuffer[String])
class Coffee{
  def basic_coffee:MadeCoffee=return MadeCoffee(1,ArrayBuffer("sugar","milk","coffee"))
}

class Addons {
  def add_cream(madeCoffee:MadeCoffee):MadeCoffee={
    val temp_Cost:Int=madeCoffee.cost+1
    madeCoffee.content+=("Cream")
    return (MadeCoffee(temp_Cost,madeCoffee.content))
}
}
