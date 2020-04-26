package ScalaSnippets

object MinimumSteps {
  def main(args: Array[String]): Unit = {
    val a:Array[Int]=Array(19,98,69,28,75,45,17,98,67)
   // println(minimumSteps(a, 464))

    println(a.slice(0,3))
  }

  def minimumSteps(numbers: Array[Int], k: Int): Int = {
  val sorte=numbers.sorted
    var res,i=0
    do{
      res=sorte(i)+res
      i=i+1
    }while(res<k)
return i-1
  }

}
