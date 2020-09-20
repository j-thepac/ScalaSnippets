package ScalaSnippets

object Sentence {

  def countCapitalLettersParagraph(paragraphs:String):Array[Int]={
    paragraphs.split("\n").map(i => i.filter(_.isUpper).length)
  }
  def countWordParagraph(paragraphs:String):Array[Int]={
    paragraphs.split("\n").map(i => i.split(" |\\.").filter(_.length>1).length)
  }

  def countVowelCapitalLettersParagraph(paragraphs:String):Array[Int]={
    paragraphs.split("\n").map(i => i.filter("AEIOU".contains(_)).length)
  }
}
