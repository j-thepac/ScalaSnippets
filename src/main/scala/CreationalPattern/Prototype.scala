/**
 * Prototype works for case class
 */

package CreationalPattern

object Prototype {
  def main(args: Array[String]): Unit = {
    val obj1 = ProA(1)
    val obj2= obj1.copy()
    obj2.n=2
    println(obj1.n,obj2.n)

  }
}

sealed case class ProA(var n: Int)