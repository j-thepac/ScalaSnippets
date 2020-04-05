package ScalaSnippets

object InheritancewithConstructor {
  def main(args: Array[String]): Unit = {
    val i:InheritA=new InheritB("4",5)
    println(i.a)
  }
}


class InheritA(val a:Int)
class InheritB(b:String, override val a:Int) extends InheritA(a)