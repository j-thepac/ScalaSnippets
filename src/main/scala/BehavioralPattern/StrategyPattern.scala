package BehavioralPattern

object StrategyPattern {
  def main(args: Array[String]): Unit = {
    val books:Books=new Books
    println(books.price)
    books.get_price("Discount10")
    println(books.price)
  }
}
class Books{
  var price:Int=100
  def get_price(coupon:String=null): Unit = if(coupon.contentEquals("Discount10"))this.Discount10
  def Discount10: Unit =this.price-=10
}

