package ScalaSnippets.Implicit

object ImplicitCon extends App {
  implicitFn
  implicitVal
  def implicitFn= {
    case class A(i: Int) {def double = i + i}
    implicit def fn(i: Int): A = A(i)
    println(1.double)

  }
  def implicitVal={
    implicit val a =5
    def fn(implicit x:Int)=x+1
    println(fn)

  }
}