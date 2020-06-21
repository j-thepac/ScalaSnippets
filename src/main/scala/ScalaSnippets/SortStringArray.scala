package ScalaSnippets

object SortStringArray {
  def main(args: Array[String]): Unit = {
val a=(this.sortByLength(Array("i", "to", "beg", "life")))
    for (arg <- a)
      println(arg)
  }

  def sortByLength(arr: Array[String]): Array[String] = {
    arr.sortBy( i => i.length)
  }
}
