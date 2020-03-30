package StructuralPattern
import java.util.Calendar
import java.text.SimpleDateFormat

object ProxyPattern {
  def main(args: Array[String]): Unit = {
    val asst:AsstManager=new AsstManager()
    asst.service
  }
}


class Manager{
  def service=println("Im busy for next 3 seconds helping client")
}

class AsstManager extends Manager{
  override def service={
    val mm=new SimpleDateFormat("ss")
    if(mm.format(Calendar.getInstance().getTime()).toLong%3==0)super.service else println("Manager is busy")
  }
}