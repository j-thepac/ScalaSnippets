package CreationalPattern

object Singleton {
  def main(args: Array[String]): Unit = {
    println(SingletonObject.proper)
    SingletonObject.fn
  }
}


 object SingletonObject{
  val proper="property"
  def fn=println("method")
}