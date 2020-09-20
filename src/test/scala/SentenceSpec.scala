import ScalaSnippets.Sentence
import org.scalatest.FunSuite

class SentenceSpec extends FunSuite{
  test(" countCapitalLettersParagraph ") {
    val sentence:String=
      """Hi Deepak.
        |Hello this is a new program""".stripMargin
    assert(Sentence.countCapitalLettersParagraph(sentence).diff(Array(2,1)).length==0)
  }

  test(" countWordParagraph ") {
    val sentence:String=
      """Hi Deepak.
        |Hello this is a new program.An""".stripMargin
    assert(Sentence.countWordParagraph(sentence).diff(Array(2,6)).length==0)
  }
  test(" countVowelCapitalLettersParagraph ") {
    val sentence:String=
      """Hi Deepak.
        |Hello this is a new program.An""".stripMargin
    assert(Sentence.countVowelCapitalLettersParagraph(sentence).diff(Array(0,1)).length==0)
  }
}
