package ScalaSnippets

object OrdChrCount {

  def main(args: Array[String]): Unit = {
    println(orderedCount("aabcdd"))
  }

  def orderedCount(chars: String): List[(Char, Int)] = {
    chars.distinct.map(c=>(c,chars.count(_ == c))).toList
  }

}
