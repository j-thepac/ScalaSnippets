package StructuralPattern
import scala.collection.mutable._
object DecoratorPattern {
  def main(args: Array[String]): Unit = {
    val coffee:Coffee=new Coffee
    val cream:Cream=new Cream
    val finalCoffee:MadeCoffee=cream.add_cream(coffee.make_coffee)
    println(finalCoffee.cost,finalCoffee.content.toString())
  }
}

case class MadeCoffee(cost:Int, content:ArrayBuffer[String])
class Coffee{
  def make_coffee:MadeCoffee={
    return MadeCoffee(1,ArrayBuffer("sugar","milk","coffee"))
  }
}

class Cream {
  def add_cream(madeCoffee:MadeCoffee):MadeCoffee={
    val temp_Cost:Int=madeCoffee.cost+1
    madeCoffee.content+=("Cream")
    return (MadeCoffee(temp_Cost,madeCoffee.content))
}
}
