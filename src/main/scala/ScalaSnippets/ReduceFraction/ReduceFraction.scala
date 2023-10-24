/*
"""
Write a function which reduces fractions to their simplest form! Fractions will be presented as an array/tuple (depending on the language) of strictly positive integers, and the reduced fraction must be returned as an array/tuple:

input:   [numerator, denominator]
output:  [reduced numerator, reduced denominator]
example: [45, 120] --> [3, 8]
All numerators and denominators will be positive integers.

Note: This is an introductory Kata for a series... coming soon!

"""
 */

object ReduceFraction extends App{

  assert(reduce_fraction((80, 120)) == (2, 3))
  assert(reduce_fraction((4, 2)) == (2, 1))
  assert(reduce_fraction((45, 120)) == (3, 8))
  assert(reduce_fraction((1000, 1)) == (1000, 1))
  assert(reduce_fraction((1, 1)) == (1, 1))
println("Done")
  def reduce_fraction(t: (Int, Int)):(Int,Int)={
    if (t._1 % t._2 == 0) return (t._1/t._2 ,1)
    else if (t._2 % t._1 == 0) return ( 1,t._2/t._2)

    val less = if(t._1 > t._2)t._2 else t._1
    var i=2
    while( i <= less){
      if(t._1 % i == 0 && t._2 % i ==0 )
        return reduce_fraction(t._1 /i,t._2/i)
      i=i+1
    }
    return t
  }
}