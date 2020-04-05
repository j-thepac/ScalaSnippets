
import org.scalatest.{ FunSuite}
import ScalaSnippets.GrasshopperSummation

class GrasshopperSummationSpec extends FunSuite {
  test("GrasshopperSummationSpec1"){GrasshopperSummation.summation(1) ==(1)}
  test("GrasshopperSummationSpec2"){ GrasshopperSummation.summation(8) == (36)}

}