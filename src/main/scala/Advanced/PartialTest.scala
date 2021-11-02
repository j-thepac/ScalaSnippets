package Advanced

object PartialTest extends App{

  val less=new PartialFunction[Int,String] {
    def apply(x:Int):String=return "less than 5"
     def isDefinedAt(x: Int): Boolean = if(x>5) true else false
  }
  val more:PartialFunction[Int,String] = {case i if (i)<=5 =>"more than 5"}
  val res=(1 to 10).map(less orElse(more))
  print(res)
}
