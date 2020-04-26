import ScalaSnippets.DescendingOrder
import org.scalatest.FunSuite


class DescendingOrderSpec extends FunSuite {
  test("basic tests") {
    assert(DescendingOrder.descendingOrder(145263) === 654321)
  }
}

