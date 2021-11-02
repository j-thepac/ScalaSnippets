package Advanced

import scala.concurrent.{Future,Await}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
object FutureTest2 extends App{

  val f:Future[(Int,Int,Int)]= for{
    a <- Future{Thread.sleep(100);1}
    b <- Future{Thread.sleep(100);2}
    c <- Future{Thread.sleep(300);2}
  }yield (a,b,c)


print(Await.result(f,5 seconds))
}
