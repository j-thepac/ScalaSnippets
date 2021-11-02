package Advanced



object Applytest extends App{
  class A{
    def apply(i:Int)=print("hi")
  }
new A()(1)
}
