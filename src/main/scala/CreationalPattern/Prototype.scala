/**
 * Prototype works for case class
 */

package CreationalPattern

object Prototype {
  def main(args: Array[String]): Unit = {
    val x = A(1)
    val y = x.copy()
    val z = y.copy(2)

  }
}

sealed case class A(n: Int)