object SealedCaseClass {
  def main(args: Array[String]): Unit = {
    val a:SCC=new SCC(10)
    println(a.a)
  }

}

sealed case class SCC(val a:Int)

sealed trait ST{
  val a:Int=3
}
 trait ST2{
  val a:Int=3
}