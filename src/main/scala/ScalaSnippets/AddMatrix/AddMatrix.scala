import scala.collection.mutable._

object AddMatrix{
  def main(args:Array[String]):Unit={
    val a:Array[Array[Int]] = Array(Array(1,2),Array(1,2))
    val b:Array[Array[Int]] = Array(Array(2,3),Array(2,3))

    val c:Array[Array[Int]] = Array(Array(3,5),Array(3,5))
    assert(this.matrix_addition(a,b).deep ==  c.deep )
    print("Done")
  }

  def matrix_addition(a:Array[Array[Int]],b:Array[Array[Int]]):Array[Array[Int]]={
    var res:ArrayBuffer[ArrayBuffer[Int]]=ArrayBuffer[ArrayBuffer[Int]]()
    for (i <- (0 to a.length-1)){
      val temp:ArrayBuffer[Int]=ArrayBuffer[Int]()
      for (j <- (0 to a.length-1)){
        temp.append(a(i)(j)+b(i)(j))
      }
      res.append(temp)
    }
    return res.map(_.toArray).toArray

  }
}

//Array(Array(1,2),(1,2))