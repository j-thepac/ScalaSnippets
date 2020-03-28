import scala.collection.mutable._

object Removing2ndElements {
  def main(args: Array[String]): Unit = {
    println(Kata.removeEveryOther(List("abc", "sdfsdf","f",1,2)))
  }
}


object Kata {
  def removeEveryOther[T](list: List[T]): List[T] = {
    list.indices.collect{case i if i%2==0 => list(i)}.toList
  }}



