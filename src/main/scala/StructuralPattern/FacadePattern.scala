package StructuralPattern

object FacadePattern {
  def main(args: Array[String]): Unit = {
    new Facade()
  }
}
class CPU{println("CPU started ... Fan Running")}
class Memory{println("Memory alloted ....")}
class Facade{
  new CPU()
  new Memory()
}