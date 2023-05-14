/*
Given a number return the closest number to it that is divisible by 10.

Example input:

22
25
37
Expected output:

20
30
40
 */

object Closest{
  def main(args:Array[String]):Unit={

    val closest: (Int => Int) = (i:Int)=> {
      val i2: Int = i % 10
      val res = if(i2 < 5) Math.floorDiv(i, 10) * 10 else Math.round(i / 10.0) * 10
      res.toInt
    }


    assert (closest(22) == 20)
    assert (closest(25) == 30)
    assert (closest(37) == 40)
    print("done")
  }



}