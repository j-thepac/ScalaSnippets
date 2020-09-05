import ScalaSnippets.MaxLengthDiffernce
import org.scalatest.FunSuite

class MaxLengthDiffernceSpec extends FunSuite {
  test("MaxLengthDiffernceSpec1")
  {
    val a1 = List("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
    val a2 = List("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
    val result = 13
    assert( MaxLengthDiffernce.mxdiflg(a1,a2) ==(13))
  }



}
