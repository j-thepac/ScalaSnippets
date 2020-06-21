import org.scalatest.FunSuite
import ScalaSnippets.SortStringArray
class SortStringArraySpec extends FunSuite {
  test("Sorting based on length"){
   val res1:String= SortStringArray.sortByLength(Array("beg", "life", "i", "to")).mkString(" ")
    assert(res1=="i to beg life")

    val res2:String= SortStringArray.sortByLength(Array("longer", "longest", "short")).mkString(" ")
    assert(res2=="short longer longest")
//    assert(SortStringArray.sortByLength(Array("", "moderately", "brains", "pizza"))  ==Array("", "pizza", "brains", "moderately"))
//    assert(SortStringArray.sortByLength(Array("longer", "longest", "short") ) == Array("short", "longer", "longest"))
//    assert(SortStringArray.sortByLength(Array("dog", "food", "a", "of"))  ==Array("a", "of", "dog", "food"))
//    assert(SortStringArray.sortByLength(Array("", "dictionary", "eloquent", "bees"))  ==Array("", "bees", "eloquent", "dictionary"))
//    assert (SortStringArray.sortByLength(Array("a longer sentence", "the longest sentence", "a short sentence"))  ==Array("a short sentence", "a longer sentence", "the longest sentence"))


  }

}
