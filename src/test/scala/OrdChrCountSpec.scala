import ScalaSnippets.OrdChrCount
import org.scalatest.{FunSpec, FunSuite}

class OrdChrCountSpec extends FunSuite{
  test("basic tests") {
    assert(OrdChrCount.orderedCount("abracadabra") == List[(Char, Int)](('a', 5), ('b', 2), ('r', 2), ('c', 1), ('d', 1)))
    assert(OrdChrCount.orderedCount("Code Wars") == List[(Char, Int)](('C', 1), ('o', 1), ('d', 1), ('e', 1), (' ', 1), ('W', 1), ('a', 1), ('r', 1), ('s', 1)))
  }
}
