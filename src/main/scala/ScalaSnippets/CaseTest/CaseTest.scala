package ScalaSnippets.CaseTest
import scala.collection.mutable._
object CaseTest
{
def main(args:Array[String]):Unit={
  val a=1
  a match {
    case i if(i==1)=> println("Working")
  }
 val m :Map[Int,Int]= Map(1 -> 2)
  m(1)=100
  print(m)
}
}
