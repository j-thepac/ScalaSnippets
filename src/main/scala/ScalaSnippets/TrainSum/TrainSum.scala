

object TrainSum extends App{


  def f(arr: Array[Int]): Double = {
    val fx: Array[Int] => String = (as: Array[Int]) => as.map{
      case i if(i %2==0) => Math.pow(i,2)
      case i if(i %2!=0) => Math.sqrt(i)
    }.reduce(_+_).toString
    val res :String = fx(arr)
    val dot:Int=res.indexOf(".")
    val finalres:String= res.slice(0,dot+3)
    finalres.toDouble

  }




  assert(f(Array(4, 5, 7, 8, 1, 2, 3, 0)) == 91.61)
  assert(f(Array(1, 14, 9, 8, 17, 21)) == 272.70)


}