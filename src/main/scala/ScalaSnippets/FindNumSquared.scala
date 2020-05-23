package ScalaSnippets

object FindNumSquared {
  def main(args: Array[String]): Unit = {
    println(this.isSquare(3))
  }

  def isSquare(x: Int): Boolean = {
    math.sqrt(x).isWhole()
  }

}
