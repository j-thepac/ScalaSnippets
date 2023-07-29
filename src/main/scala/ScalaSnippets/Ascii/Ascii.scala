package ScalaSnippets.Ascii

object Ascii extends App{

  val convert:String=>String=(s:String)=>s.grouped(2).map(_.toInt.toChar).mkString("")


  assert(convert("65")== "A")
  assert(convert("656667")== "ABC")
  assert(convert("676584")== "CAT")
  assert(convert("73327673756932858080698267658369")== "I LIKE UPPERCASE")
  assert(convert("32327332327679866932328380656769833232")== "  I  LOVE  SPACES  ")
  assert(convert("84726982693273833278793270857832737832657889327984726982326765836983")== "THERE IS NO FUN IN ANY OTHER CASES")
print("Done")

}
