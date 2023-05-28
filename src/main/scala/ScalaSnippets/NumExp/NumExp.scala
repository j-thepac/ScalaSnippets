

object NumExp{

  def main(args:Array[String]):Unit={
    val n:Int = 1233
    val s =n.toString()
    s.map(println)

    val res = s.map(i => fn(i.toString,s))
    print(res)
//    val aRes:Array[Int]=Array.range(s.length-1,-1,-1).map((i:Int) => s(i).toInt*Math.pow(10,i)).map(_.toInt)
//    print(aRes.mkString(","))

  }

  def fn(i:String,s:String):Int={

    val res = i.toInt*Math.pow(10,(s.length-s.indexOf(i)-1))
      return res.toInt
  }

}