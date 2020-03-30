package BehavioralPattern

object ChainOfResponsibilityPattern {
  def main(args: Array[String]): Unit = {
    val obj:Handle=new Fish( new Waste)
    obj.catchfish("waste")
  }
}

abstract class Handle(val obj:Handle=null){
  def catchfish(s:String):Unit
}
class Fish(override val obj:Handle=null) extends Handle(obj:Handle){
  def catchfish(s:String): Unit ={
    if(s.toLowerCase.contentEquals("fish")) println("caught fish")
    else if (this.obj!=null) return ( this.obj.catchfish(s))
  }
}
class Waste(override val obj:Handle=null) extends Handle(obj:Handle){
  def catchfish(s:String): Unit ={
    if(s.toLowerCase.contentEquals("waste")) println("caught waste")
    else if (this.obj!=null) return ( this.obj.catchfish(s))
  }
}