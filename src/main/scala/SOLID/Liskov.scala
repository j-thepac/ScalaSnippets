package SOLID

object Liskov {
  def main(args: Array[String]): Unit = {
    val eagle:FlyingBird=new Eagle()
    eagle.fly
  }
}
abstract class Bird{}
trait FlyingBird extends Bird{
  def fly=println("This bird flies")
}
class Eagle extends FlyingBird
class Penguine extends Bird