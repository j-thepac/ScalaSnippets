/*
In this Kata you have to find the factors of integer down to the limit including the limiting number. There will be no negative numbers. Return the result as an array of numbers in ascending order.

If the limit is more than the integer, return an empty list

As a challenge, see if you can do it in one line
 */

object Factors {
  def main(args:Array[String]):Unit={

    def factors:(Int,Int)=>Seq[Int]=(mx:Int,start:Int)=>(start to mx+1).filter(i=> mx % i ==0)

    assert(factors(5, 1).sameElements(Array(1, 5)))
//    assert(factors(30, 2), Array(2, 3, 5, 6, 10, 15, 30))
//    assert(factors(100, 75), Array(100))
//    assert(factors(40, 5), Array(5, 8, 10, 20, 40))
//    assert(factors(1, 5), Array())
  }
}