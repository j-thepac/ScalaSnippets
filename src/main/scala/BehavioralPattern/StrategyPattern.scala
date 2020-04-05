package BehavioralPattern

object StrategyPattern {
  def main(args: Array[String]): Unit = {
    val books:Books=new Books
    println(books.price)
   println( books.get_price("Discount10"))
  }
}
class Books{
  var price:Int=100
  val m:Map[String,Int]=Map("Discount10"->this.Discount10)
  def get_price(coupon:String=""): Int = this.m(coupon)
  def Discount10():Int=return (this.price-10)
}

