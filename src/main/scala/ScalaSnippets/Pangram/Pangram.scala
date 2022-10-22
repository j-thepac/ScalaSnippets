
object Pangram {
  def main(args:Array[String]):Unit={


    assert(is_pangram("The quick, brown fox jumps over the lazy dog!") == true)
    assert(is_pangram("1bcdefghijklmnopqrstuvwxyz") == false)
    println("Done")
  }



  def is_pangram: String => Boolean =
              (s:String)=>(97 to 122)
                          .map(_.toChar.toString)
                         .forall(i => s.toLowerCase.contains(i))


}
