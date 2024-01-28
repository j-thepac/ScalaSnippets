/*
Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).

Given n and firstNumber/first_number/first-number, find the number which is written in the radially opposite position to firstNumber.

Example
For n = 10 and firstNumber = 2, the output should be 7
 */

import scala.collection.mutable._
object Circle {

  def main(args:Array[String]):Unit={

    assert(circle_of_numbers(10, 2) == 7)
    assert(circle_of_numbers(10, 7) == 2)
    assert(circle_of_numbers(4, 1) == 3)
    assert(circle_of_numbers(6, 3) == 0)
    print("Done")
  }

  def circle_of_numbers(n:Int,fst:Int):Int={
    val inp=(0 to n)
    val m:Int=inp.length/2
    val inp1=inp.slice(0,m)
    val inp2=inp.slice(m,inp.length)

    var d=inp1.zip(inp2).toMap
    d=d++inp2.zip(inp1).toMap
    return d(fst)

  }
}