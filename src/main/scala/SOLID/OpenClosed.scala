
//SOLID
package SOLID

object OpenClosed {
  def main(args: Array[String]): Unit = {
    val book:DiwaliBook=new DiwaliBook()
    book.getPrice
  }
}


abstract class Book{
  val price:Int=1000
   def getPrice{}
}

class DiwaliBook extends Book{
  override def getPrice = println( this.price-100)
}