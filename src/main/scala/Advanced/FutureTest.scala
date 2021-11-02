package Advanced

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FutureTest extends App{
val f=Future{
  Thread.sleep(500)
  20}
  while (f.isCompleted==false){
    Thread.sleep(100)
  }
  f.onComplete {
    case Success(value)=>print(value)
    case Failure(exception)=>print(exception.getCause)
  }
print("hi")
}
