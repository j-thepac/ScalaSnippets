
object Slide extends App{

val fx:(String,Int) => Array[String] = (s:String,i:Int) =>  s.sliding(i).map(i=>i.toString).toArray
assert(fx("123456",2)== Array("12","23","34","45","56")
}