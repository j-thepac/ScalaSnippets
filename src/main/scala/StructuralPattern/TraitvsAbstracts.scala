package StructuralPattern

object TraitvsAbstracts {
  def main(args: Array[String]): Unit = {

  }
}


trait AbTrait{}
trait AbTrait2{
  def fn=println("hi")
}
abstract class TraitAbs (val a:Int){
  def fn=println("hi")
}
abstract class TraitAbs2{
  def fn=println("hi")
}

class AbsTraitTest extends TraitAbs(3) with AbTrait
