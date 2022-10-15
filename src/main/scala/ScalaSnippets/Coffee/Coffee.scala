

object Coffee {

  def main(args: Array[String]): Unit = {
    assert(search(3, Array(6, 1, 2, 9, 2)) == "1,2,2")
    assert(search(14, Array(7, 3, 23, 9, 14, 20, 7)) == "3,7,7,9,14")
//    assert(search(24, Array(2.7, 0, 100.9, 1, 5.5)) == "0,1,2.7,5.5")
    assert(search(14, Array(13, 15, 14, 14, 15, 13)) == "13,13,14,14")
  }

  def search(budget: Int, prices: Array[Double]): String = {
    val res = prices.filter( i=> i<=budget).map(i=> i.toInt).sortWith((i,j) => i<j).mkString(",")
    if(res.size<1) return ""
    println(res)
    return res
  }

}
//  (0, [6, 1, 2, 9, 2], ""),
//  (10, [], ""),
//  (10, [0, 0, 0], "0,0,0"),
//  (0, [0, 0, 0], "0,0,0"),
//  (24, [24, 0, 100, 2, 5], "0,2,5,24"),
//
//  (-1, [1, 2, 3, 4], ""),
//  (-1, [-1, 0, 1, 2, 3, 4], "-1"),
//  (14, [17, 33, 23, 19, 19, 20, 17], ""),
//  (14, [13, 15, 14, 14, 15, 13], "13,13,14,14"),
//}