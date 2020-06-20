import ScalaSnippets.Countwords
import org.scalatest.FunSuite

class CountwordsSpec extends FunSuite {
  test("basic tests") {
    assert(Countwords.testit("word")=== 1)
    assert(Countwords.testit("hello world")===1)
    assert(Countwords.testit("My cat waiting for a dog.")===1)
    assert(Countwords.testit("We often read book, a word hidden in the book")===2)
    assert(Countwords.testit("When you in order to do something by a wrong way")===1)
    assert(Countwords.testit("This sentence have one word.This sentence have two word")===2)
    assert(Countwords.testit("One word + one word = three word ;-")===3)
  }
}
