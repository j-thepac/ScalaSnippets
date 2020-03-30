package CreationalPattern

object Builder {
  def main(args: Array[String]): Unit = {
    val a:BuildA=new BuildA(1)
    val b:BuildA=new BuildA("a")
    val c:BuildA=new BuildA(List("1","2","3"))
  }
}

sealed class BuildA(val p:Any){
println(p)
}

