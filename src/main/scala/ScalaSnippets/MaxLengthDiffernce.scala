package ScalaSnippets

object MaxLengthDiffernce {

  def main(args: Array[String]): Unit = {

  }

  def mxdiflg(a1: List[String], a2: List[String]): Int = {
//    val a1_len=a1.map( i=> i.length)
//    val a2_len=a2.map( i=> i.length)
//    val res=a1_len.zip(a2_len).map(i => Math.abs(i._1 - i._2))
//    return res.max
//
////return a1.zip(a2).map( i=>  Math.abs(i._1.length- i._2.length)).max

    try {
      val a1_min: Int = a1.map(i => i.length).min
      val a1_max: Int = a1.map(i => i.length).max
      val a2_min: Int = a2.map(i => i.length).min
      val a2_max: Int = a2.map(i => i.length).max
      if (Math.abs(a1_max - a2_min) > Math.abs(a1_min - a2_max)) return Math.abs(a1_max - a2_min) else Math.abs(a1_min - a2_max)
    }
    catch {
      case ex:Exception=>return  -1
    }
  }
}
