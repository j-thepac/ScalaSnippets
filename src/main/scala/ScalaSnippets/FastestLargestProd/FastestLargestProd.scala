package ScalaSnippets.FastestLargestProd
/*
Rick wants a faster way to get the product of the largest pair in an array.
Your task is to create a performant solution to find the product of the largest two integers in a unique array of positive numbers.
All inputs will be valid.
Passing Array(2, 6, 3) should return 18, the product of Array(6, 3).
 */
import scala.collection.mutable._
object FastestLargestProd extends App{
  val max_product: Array[Int] => Int = (a: Array[Int]) =>
    a.sortWith((x: Int, y: Int) => x > y)
      .slice(0, 2)
      .reduce((x: Int, y: Int) => x * y)


  assert(max_product(Array(2, 1, 5, 0, 4, 3) ) == 20)
  assert(max_product(Array(7, 8, 9) ) == 72)
  assert(max_product(Array(33, 231, 454, 11, 9, 99, 57)) ==104874 )
  print("done")

}
