package Advanced



object Companiontest extends App{
  class A{private var a:Int=_}

  object A{
    def apply(i:Int)= {
      val obj = new A()
      obj.a = i
      print(obj.a)
    }
  }
  A(10)
}
