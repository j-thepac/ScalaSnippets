package Advanced

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import java.util.Calendar

object FutureMap extends App{

  val start =Calendar.getInstance().getTime.getSeconds
  val fx :String => String = (name:String)=>{
    println(f"$name is waiting for 1 sec")
    Thread.sleep(1000)
    (f"$name got result")
  }
  val res= Array("Sam","Ram","jack","jill","Ron","Jon").map( name => Future{fx(name)})
  res.map(i=> Await.result(i , 10 seconds)).foreach(println)
  println(f"${Calendar.getInstance().getTime.getSeconds-start}")

}
