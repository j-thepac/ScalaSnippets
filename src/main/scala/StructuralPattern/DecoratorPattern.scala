package StructuralPattern
import scala.collection.mutable._
object DecoratorPattern {
  def main(args: Array[String]): Unit = {
    val coffee:Prep=new Prep
    val addons:Addons=new Addons
    val finalCoffee:Coffee=addons.add_cream(coffee.basiccoffee)
    println(finalCoffee.cost,finalCoffee.content.toString())
  }
}

case class Coffee(cost:Int, content:ArrayBuffer[String])
class Prep{
  def basiccoffee:Coffee=return Coffee(1,ArrayBuffer("sugar","milk","coffee"))
}

class Addons {
  def add_cream(c:Coffee):Coffee={
    return (Coffee(c.cost+1,c.content+=("Cream")))
}
}
