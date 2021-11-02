package Advanced

object ImplicitTest extends App {

  case class P(val name:String)  {def hi=print("hi"+name)}
implicit def strtoPerson(s:String):P=P(s)
"abc".hi






}
