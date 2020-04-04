package BehavioralPattern

object TemplatePattern {
  def main(args: Array[String]): Unit = {
    val pizza:Pizza=new Pizza
    val burger:Burger=new Burger
    pizza.cook
    pizza.prepare
  }
}
abstract class Dish{
  def prepare
  def cook
}
class Pizza extends Dish{
  override def prepare=println("Buying Pizza Base , ketchup ,Cheese")
  override def cook=println("Cooking in oven")
}
class Burger extends Dish{
  override def prepare=println("Buying Buns, Cheese")
  override def cook=println("Toaster")
}