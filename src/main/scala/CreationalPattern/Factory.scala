package CreationalPattern


//Unlike Python , Scala requires type casting
object Factory {
  def main(args: Array[String]): Unit = {
    val obj:A=this.factory("A").asInstanceOf[A] // Type casted to A
    println(obj.a)
  }

  def factory(a:String):Obj={
    val m= Map("A"->new A,"B"->new B)
    return m(a)
  }
}

class Obj
class A extends Obj{ val a="A"}
class B extends Obj {val b="B"}

