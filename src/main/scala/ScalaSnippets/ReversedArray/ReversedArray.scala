/*
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
  35231 => [1,3,2,5,3]
0 => [0]

*/


object ReversedArray {
  val testCases = List( //n, expected
    (35231L, Seq(1, 3, 2, 5, 3)),
    (348597L, Seq(7, 9, 5, 8, 4, 3)),
    (0L, Seq(0)),
    (23582357L, Seq(7, 5, 3, 2, 8, 5, 3, 2)),
    (984764738L, Seq(8, 3, 7, 4, 6, 7, 4, 8, 9)),
    (45762893920L, Seq(0, 2, 9, 3, 9, 8, 2, 6, 7, 5, 4)),
    (548702838394L, Seq(4, 9, 3, 8, 3, 8, 2, 0, 7, 8, 4, 5))
  )
  def main(args:Array[String]):Unit={

    print(this.digitize(23582357L))
    this.testCases.map(i=> assert(this.digitize(i._1)==i._2))
    println("Done")
  }

  def digitize(n: Long): Seq[Int] = {
    return n.toString.split("").map(_.toInt).reverse.toList
  }

}


