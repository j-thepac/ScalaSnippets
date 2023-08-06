

object Asciiende{

  def main(args:Array[String]):Unit={
    assert(ascii_encrypt("PASSWORD") == "PBUV[TXK")
    assert(ascii_encrypt("password") == "pbuv{txk")
    assert(ascii_encrypt("") == "")
    assert(ascii_encrypt("zzzzz") == "z{|}~")
    assert(ascii_encrypt("ZZZZZ") == "Z[\\]^")
    assert(ascii_encrypt("aaaa") == "abcd")
    assert(ascii_encrypt("AAAA") == "ABCD")
    assert(ascii_encrypt("0123456789") == "02468:<>@B")
    print("done")
  }

  def ascii_encrypt(str: String):String={
    val ascii:Array[Byte]=str.toCharArray.map(_.toByte)
    val res = Array.range(0,str.length).map( i => ascii(i)+i).map(_.toChar).mkString("")
    res
  }
}