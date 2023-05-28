/*
"""

These arrays are too long! Let's reduce them!

Description
Write a function that takes in an array of integers from 0-9, and returns a new array:

Numbers with no identical numbers preceding or following it returns a 1: 2, 4, 9  => 1, 1, 1
Sequential groups of identical numbers return their count: 6, 6, 6, 6 => 4
Example

Array(0, 4, 6, 8, 8, 8, 5, 5, 7) => Array(1, 1, 1, 3, 2, 1)

Your function should then repeat the process on the resulting array, and on the resulting array of that, until it returns a single integer:

Array(0, 4, 6, 8, 8, 8, 5, 5, 7) =>  Array(1, 1, 1, 3, 2, 1) => Array(3, 1, 1, 1) => Array(1, 3) => Array(1, 1) => Array(2)
"""
 */


package ScalaSnippets.SetReduce

object SetReduce {
  val sample_test_cases: Array[(Int, Array[Int])] = Array(
    (2, Array(0, 4, 6, 8, 8, 8, 5, 5, 7)),
    (2, Array(8, 1, 6, 1, 2, 7, 7, 7, 7, 6, 5, 3, 2, 1, 8)),
    (2, Array(0, 0, 8, 6, 6, 7, 8, 6, 6, 4, 7, 6, 4, 0, 1, 1, 2, 1, 2, 9, 9, 0, 3, 3, 0, 4)),
    (3, Array(6, 3, 5, 7, 4, 2, 0, 0, 1, 6, 9, 6, 1, 3, 9, 3, 2)),
//    (5, Array(1, 4, 0, 1, 2, 6, 6, 0, 8, 4, 7, 9, 9, 4, 3, 7, 2, 6, 7, 5, 0, 9, 8)),
//    (23, Array(4, 6, 8, 1, 9, 3, 8, 4, 1, 4, 0, 8, 3, 7, 1, 5, 6, 3, 2, 1, 8, 4, 9)),
//    (3, Array(8, 3, 2, 6, 2, 7, 9, 9, 6, 8, 2, 4, 3, 6, 9, 5, 2, 4, 9)),
//    (3, Array(7, 2, 0, 6, 5, 7, 3, 9, 1, 8, 4, 5, 5, 5, 8, 9, 8, 1, 9, 1, 2, 7, 2, 6, 0, 8, 0, 2)),
//    (5, Array(8, 5, 1, 1, 1, 5, 9, 7, 4, 8, 8, 8, 2, 4, 3, 1, 2, 1, 3, 5, 6, 4)),
//    (3, Array(2, 4, 4, 6, 2, 1, 1, 5, 6, 7, 8, 8, 8, 8, 9, 0, 1, 1, 5, 4, 4)),
  )
  def main(args:Array[String]):Unit={
    sample_test_cases.foreach(i=> assert(i._1==finResult(i._2)))

  }
def finResult(ip:Array[Int]):Int={
  var temp=ip
  while (temp.length != 1)
    temp = fn(temp)
//  println(temp.mkString(","))
  temp(0)
}
def fn:Array[Int]=>Array[Int] = (i:Array[Int])=> i.groupBy(i=>i).map(i=> i._2.length).toArray[Int]
}
