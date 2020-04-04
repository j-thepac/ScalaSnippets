package CreationalPattern

object Builder {
  def main(args: Array[String]): Unit = {
    val a:BuildA=new BuildA()
    val b:BuildA=new BuildA(List("1","2","3"))
    val c:BuildB[Int]=new BuildB[Int](1)
  }
}

//Any
sealed class BuildA(val p:Any=1){
println(p)
}

sealed class BuildB[T](val p:T){
  println(p)
}
