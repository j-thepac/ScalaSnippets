
/*
""
Define n!! as
  n!! = 1 * 3 * 5 * ... * n if n is odd,
n!! = 2 * 4 * 6 * ... * n if n is even.
  Hence 8!! = 2 * 4 * 6 * 8 = 384, there is no zero at the end. 30!! has 3 zeros at the end.
  For a positive integer n, please count how many zeros are there at the end of n!!.
  Example:
    30!! = 2 * 4 * 6 * 8 * 10 * ... * 22 * 24 * 26 * 28 * 30
    30!! = 42849873690624000 (3 zeros at the end)
"""
*/

object Junger  extends App{

//
//  assert(count_zeros_n_double_fact(8) == 0)
  assert(count_zeros_n_double_fact(30) == 3)

  def count_zeros_n_double_fact(n: Int): Int = {
    var a:Array[Int] = if(n % 2 == 0) Array.range(2,n+1,2) else Array.range(1,n+1,2)
    val res:Long = a.map(i => i.toLong).reduce((i,j) => i * j)
    val fRes =res.toString.length - res.toString.reverse.toLong.toString.length
    return fRes

  }

}

