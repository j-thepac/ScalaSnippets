package ScalaSnippets
import scala.collection.mutable


object Countwords {
  def main(args: Array[String]): Unit = {
this.testit("hi you")
  }

    def testit(s: String): Int ={
      val m:mutable.Map[String,Int]=mutable.Map[String,Int]()
      val se=s.toLowerCase()
        .replace(",","")
        .replace(".","")
        .replace("!","")
        .split(" ")
      se.toSet.toArray.map(i => m += (i -> se.count(_ == i)))
      return (m.values.max)
    }


}
