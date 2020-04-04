package StructuralPattern


//ABCDFFP
object AdapterPattern {
  def main(args: Array[String]): Unit = {
   new Toaster(new Adapter(new Socket)).on
  }
}

class Socket{val volt:Int=220}
class Toaster(val socket:Socket){
  def on=if (socket.volt>120) println("Blast") else println("Working")
}
class Adapter(socket: Socket) extends Socket {override val volt:Int=120}