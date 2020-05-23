import org.scalatest._
import ScalaSnippets.FindNumSquared


class FindNumSquaredSpec extends FunSuite {
  test("FindNumSquared") {
    assert(FindNumSquared.isSquare(-1) === false)
    assert(FindNumSquared.isSquare(25) === true)
    assert(FindNumSquared.isSquare(26) === false)

  }
}