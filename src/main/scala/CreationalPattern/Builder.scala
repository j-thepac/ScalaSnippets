package CreationalPattern

object Builder {
  def main(args: Array[String]): Unit = {
    val a:A=new A(1)
    val b:A=new A("a")
    val c:A=new A(List("1","2","3"))
  }
}

sealed class A(val p:Any){
println(p)
}

