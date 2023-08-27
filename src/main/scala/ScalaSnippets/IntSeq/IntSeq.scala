/*
"""
Description:
Complete function findSequences. It accepts a positive integer n. Your task is to find such integer sequences:
Continuous positive integer and their sum value equals to n
For example, n = 15
valid integer sequences:
[1,2,3,4,5]  (1+2+3+4+5==15)
[4,5,6]          (4+5+6==15)
[7,8]              (7+8==15)
The result should be an array [sequence 1,sequence 2...sequence n], sorted by ascending order of the length of sequences; If no result found, return [].
Some examples:
findSequences(3) === [[1,2]]
findSequences(15) === [[7,8],[4,5,6],[1,2,3,4,5]]
findSequences(20) === [[2, 3, 4, 5, 6]]
findSequences(100) === [[18, 19, 20, 21, 22], [9, 10, 11, 12, 13, 14, 15, 16]]
findSequences(1) === []
"""

 */
import scala.collection.mutable._
import scala.util.control.Breaks.break
object IntSeq {

  def main(args:Array[String]):Unit={
//    assert(find_sequences(3).sameElements(Array(Array(1, 2))))

    assert(find_sequences(3).deep==Array(Array(1, 2)).deep)
    assert(find_sequences(15).deep == Array(Array(7, 8), Array(4, 5, 6), Array(1, 2, 3, 4, 5)).deep )
//    assert(find_sequences(3)== Array(Array(1, 2)))
//    assert(find_sequences(15) == Array(Array(7, 8), Array(4, 5, 6), Array(1, 2, 3, 4, 5)) )
//    ,(15, Array(Array(7, 8), Array(4, 5, 6), Array(1, 2, 3, 4, 5)))
//    ,(20, Array(Array(2, 3, 4, 5, 6)))
//    ,(100, Array(Array(18, 19, 20, 21, 22), Array(9, 10, 11, 12, 13, 14, 15, 16)))
//    ,(1, Array())
  }
  def find_sequences(n:Int):Array[Array[Int]]={
    val res:ArrayBuffer[ArrayBuffer[Int]]=ArrayBuffer[ArrayBuffer[Int]]()
    for( i <- (0 to n/2)){
      val temp:ArrayBuffer[Int]=ArrayBuffer[Int]()
      var flag:Boolean=true
      var j:Int=i
      while (flag){
        j+=1
        temp.append(j)
        if(temp.sum == n) {
          flag=false
          res.append(temp)
        }else if(temp.sum > n)flag=false
      }
    }
    val fRes:Array[Array[Int]]= res.map(_.toArray).toArray
    return fRes.reverse

  }



}