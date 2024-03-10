

object AZ {
  def main(args:Array[String])={
    val testCases = Seq(
      ("a-z", "abcdefghijklmnopqrstuvwxyz"),
      ("h-o", "hijklmno"),
      ("Q-Z", "QRSTUVWXYZ"),
      ("J-J", "J"),
      ("a-b", "ab"),
      ("A-A", "A"),
      ("g-i", "ghi"),
      ("H-I", "HI"),
      ("y-z", "yz"),
      ("e-k", "efghijk"),
      ("a-q", "abcdefghijklmnopq"),
      ("F-O", "FGHIJKLMNO")
    )
    testCases.foreach(i => assert(i._2.equals(gimmeTheLetters(i._1) )))
  }

  val gimmeTheLetters:String => String = (s:String)=>{
    val l=s.split("-")
    val start=l(0).head.toChar
    val end=l(1).head.toChar
    (start to end).mkString
  }

  def gimmeTheLetters3(s:String):String = {
    val l=s.split("-")
    val start=l(0).head.toChar
    val end=l(1).head.toChar
    return (start to end).mkString
  }

  def gimmeTheLetters2(range:String):String={
    val l =range.split("-")
    val start=l(0).getBytes.head.toInt
    val stop=l(1).getBytes.head.toInt
    val res:StringBuilder=new StringBuilder()
    (start to stop).map(i => res.append(i.toChar.toString))
    return res.toString()
  }
}
