package ScalaSnippets.Lazytest

object Lazytest extends App{

  class A{lazy val a:Int =1}
  val a:A = new A(){override lazy val a:Int =6}
println(a.a)
}
