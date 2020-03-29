/**
 * With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
 *
 * 1 * (2 + 3) = 5
 * 1 * 2 * 3 = 6
 * 1 + 2 * 3 = 7
 * (1 + 2) * 3 = 9
 *
 * So the maximum value that you can obtain is 9.
 */
object ExpressionsMatter {
  def main(args: Array[String]): Unit = {
    println(ExpressionsMatterTest2.expressionMatter(1,1,1))
  }
}

object ExpressionsMatterTest2 {
  def expressionMatter(a: Int, b: Int, c: Int): Int = {
    val temp_res= Array(a,b,c)
    val res=temp_res(0)*(temp_res(1)+temp_res(2))
    val res_5=temp_res(0)*temp_res(1)+temp_res(2)

    val res_2=temp_res.reduce((i,j)=>i*j)
    val res_3=temp_res.reduce((i,j)=>i+j)

    val res_4=temp_res(0)+temp_res(1)*temp_res(2)
    val res_6=(temp_res(0)+temp_res(1))*temp_res(2)
    return (Array(res,res_2,res_3,res_4,res_5,res_6).max)

  }
}