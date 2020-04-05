package ScalaSnippets

import com.google.inject.matcher.Matchers


object GrasshopperSummation {
  def main(args: Array[String]): Unit = {
println(this.summation(8))
  }

  def summation(n: Int): Int = return (Array.range(0,n+1).sum)

}



