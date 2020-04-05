import ScalaSnippets.ExpressionsMatterTest2
import org.scalatest.FunSuite


class ExpressionMatterSpec extends  FunSuite {
  test("ExpressionsMatterTest") {
        assert(ExpressionsMatterTest2.expressionMatter(2, 1, 2) === 6)
        assert(ExpressionsMatterTest2.expressionMatter(2, 1, 1) === 4)
        assert(ExpressionsMatterTest2.expressionMatter(1, 1, 1) === 3)
        assert(ExpressionsMatterTest2.expressionMatter(1, 2, 3) === 9)
        assert(ExpressionsMatterTest2.expressionMatter(1, 3, 1) === 5)
        assert(ExpressionsMatterTest2.expressionMatter(2, 2, 2) === 8)
        assert(ExpressionsMatterTest2.expressionMatter(5, 1, 3) === 20)
        assert(ExpressionsMatterTest2.expressionMatter(3, 5, 7) === 105)
        assert(ExpressionsMatterTest2.expressionMatter(5, 6, 1) === 35)
        assert(ExpressionsMatterTest2.expressionMatter(1, 6, 1) === 8)
        assert(ExpressionsMatterTest2.expressionMatter(2, 6, 1) === 14)
        assert(ExpressionsMatterTest2.expressionMatter(6, 7, 1) === 48)
        assert(ExpressionsMatterTest2.expressionMatter(2, 10, 3) === 60)
        assert(ExpressionsMatterTest2.expressionMatter(1, 8, 3) === 27)
        assert(ExpressionsMatterTest2.expressionMatter(9, 7, 2) === 126)
        assert(ExpressionsMatterTest2.expressionMatter(1, 1, 10) === 20)
        assert(ExpressionsMatterTest2.expressionMatter(9, 1, 1) === 18)
        assert(ExpressionsMatterTest2.expressionMatter(10, 5, 6) === 300)
        assert(ExpressionsMatterTest2.expressionMatter(1, 10, 1) === 12)
  }}