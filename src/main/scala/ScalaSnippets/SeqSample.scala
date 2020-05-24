package ScalaSnippets

import scala.collection.mutable._

object SeqSample {
  def main(args: Array[String]): Unit = {
    this.mutableSeq
    this.mapOption

  }

  def mutableSeq={
    val a:ArrayBuffer[Int]=new ArrayBuffer[Int]()
    val b:ArrayBuffer[Int]= ArrayBuffer[Int]()
    val l=ListBuffer(1,"2")
    a.append(5)
    a.append(6)
    b.append(6)
    l.append(false)
    print(a)
    print(b)
    print(l)
  }

  def mapOption={
    val n:Option[Map[String,String]]=Some(Map("a"->"a"))
    println(n.getOrElse("a"))
  }
}
