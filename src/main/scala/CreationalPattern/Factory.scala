package CreationalPattern


//Unlike Python , Scala requires type casting
object Factory {
  def main(args: Array[String]): Unit = {
    val obj:Factory1=this.factory("A").asInstanceOf[Factory1] // Type casted to A
    println(obj.a)
  }

  def factory(a:String):Obj={
    val m= Map("A"->new Factory1,"B"->new Factory2)
    return m(a)
  }
}

class Obj
sealed class Factory1 extends Obj{ val a="A"}
sealed class Factory2 extends Obj {val b="B"}

