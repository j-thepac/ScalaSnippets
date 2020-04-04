package StructuralPattern

object BridgePattern {
  def main(args: Array[String]): Unit = {
    val red:Color=new Red()
    val circle:Pattern=new Circle(red)
    circle.draw(5)
  }
}
abstract class Color{def paint:String}
class Red extends Color{
  override def paint: String = return(" RED")
}
abstract class Pattern(val color: Color) {def draw(cm:Int)}
class Circle (color: Color) extends Pattern (color){
  override def draw(cm:Int)=println("drawing circle of "+cm +"cm , with color "+this.color.paint)
}