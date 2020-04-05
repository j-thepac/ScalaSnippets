package ScalaSnippets
import scala.collection.mutable

object Countpositives_Sumnegatives {
  def main(args: Array[String]): Unit = {
    println(  this.countPositivesSumNegatives(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
  }
  def countPositivesSumNegatives(integers: Array[Int]): (Int, Int) = {
          try{
          return (integers.filter(i => i>0).length,integers.filter(i => i<0).sum) //filter(_>0).length , filter(_<0).sum
          }catch{
              case ex:Exception => return(0,0)
            }}
}

//  Solution 2 : (integers.count(_ > 0), integers.filter(_ < 0).sum)
// Solution 3:  integers.partition(_ > 0) match { case (pos, neg) => (pos.size, neg.sum) }
