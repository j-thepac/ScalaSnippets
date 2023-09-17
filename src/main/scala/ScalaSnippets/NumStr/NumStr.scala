/*
"""
In this Kata, you will be given a string that has lowercase letters and numbers. Your task is to compare the number groupings and return the largest number. Numbers will not have leading zeros.
For example, solve("gh12cdy695m1") = 695, because this is the largest of all number groupings.
Good luck!
Please also try Simple remove duplicates
"""

 */
import scala.util.matching._
object NumStr{

  def main(args:Array[String]):Unit={
    assert(solve("gh12cdy695m1")==695)
    assert(solve("2ti9iei7qhr5")==9)
  }

def solve:String => Int=(s:String)=>{
  val regex="[0-9]*".r
  regex.findAllIn(s).filter(_.length>0).map(_.toInt).max
}
}