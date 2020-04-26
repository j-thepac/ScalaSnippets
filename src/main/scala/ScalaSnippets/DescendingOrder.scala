/*
    Details
    Solutions
    Forks (202)
    Discourse (371)

Collect|

Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
Examples:

Input: 21445 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321

 */

package ScalaSnippets

object DescendingOrder {
  def main(args: Array[String]): Unit = {
    println(descendingOrder(145263))
  }

  def descendingOrder(num: Int): Int = {
    return num.toString.split("").sorted(Ordering.String.reverse).mkString.toInt
  }

}
