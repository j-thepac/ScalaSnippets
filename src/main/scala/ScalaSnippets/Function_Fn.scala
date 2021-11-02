package ScalaSnippets

object Function_Fn {


  def main(args: Array[String]): Unit = {
   fn( (i:Int, j:Int) => (i to j).reduce(_ + _))
    val a = f2(_)
    a(6)
  }


  def fn(f:(Int,Int)=>Int):Int=>Int={
    println(f(1,2))
    val a =( i:Int)=>(1 to i).reduce(_ + _)
    return a
  }

  def f2(i:Int)=println(i)

}
