package StructuralPattern
import scala.collection.mutable._

object FlyWeightPattern {
  def main(args: Array[String]): Unit = {
    val flyweight:Flyweight=new Flyweight
    val a=flyweight.get_object("a")
    val b=flyweight.get_object("a")
    println(a==b,a.getClass,b.getClass)
  }
}

sealed class FlyTestA{val a=1}

class Flyweight{
  val m= Map[String,Any]()
  def get_object(s:String): Any ={
    try{
      return m(s)
    }catch{
      case ex:Exception =>{
        m+=(s->new FlyTestA())
        return m(s)}}}}