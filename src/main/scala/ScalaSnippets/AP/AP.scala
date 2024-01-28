import scala.util.control.Breaks.break

object AP extends App{
  val testCases = List(
    (Seq(1, 2, 3, 4, 6, 7, 8, 9), 5),
//    (Seq(1, 3, 4, 5, 6, 7, 8, 9), 2)
  )

  testCases.map(i=> fn(i._1,i._2)).foreach(println)

  def fn(s:Seq[Int],verify:Int): Int ={
    var diff:Int=0
    var result=0
    if(s(1)-s(0) == s(s.length-1)-s(s.length-2)) diff = s(1)-s(0)
    else if(s(1)-s(0) == s(2)-s(1))diff = s(1)-s(0)
    else diff = s(s.length-1)-s(s.length-2)

    for (i <- s.length -1 to 1 by -1){
      if(s(i)-s(i-1)!=diff) {
        result = s(i - 1) + diff
        return result
      }
    }
    return result
  }

}