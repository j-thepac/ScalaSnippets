package SOLID
//Instead of machine having abstract methods of print and call .Making it generic
object InterfaceSegregation {
  def main(args: Array[String]): Unit = {
    val cell:Machine=new CellPhone
    val print:Machine=new Printer

    cell.operation
    print.operation

  }
}
abstract class Machine{
  def operation
}
class CellPhone extends Machine{
  override def operation: Unit = println("Performs call")
}
class Printer extends Machine{
  override def operation: Unit = println("Print paper")
}