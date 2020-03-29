import scala.collection.mutable._


/**
 *
Take an array and remove every second element out of that array. Always keep the first element and start removing with the next element.

Example:

myArr = List("Keep", "Remove", "Keep", "Remove", "Keep", ...) */
object Removing2ndElements {
  def main(args: Array[String]): Unit = {
    println(ExpressionsMatterTest.removeEveryOther(List("abc", "sdfsdf","f",1,2)))
  }
}


object ExpressionsMatterTest {
  def removeEveryOther[T](list: List[T]): List[T] = {
    list.indices.collect{case i if i%2==0 => list(i)}.toList
  }}



//OP = abc ,f, 2