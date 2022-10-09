import scala.util.control.Breaks.{break, breakable}

object NoRepeat {

/*
Write a function named first_non_repeating_letter that takes a string input, and returns the first character that is not repeated anywhere in the string.
For example, if given the input "stress", the function should return "t", since the letter t only occurs once in the string, and occurs first in the string.
As an added challenge, upper- and lowercase letters are considered the same character, but the function should return the correct case for the initial letter. For example, the input "sTreSS" should return "T".
If a string contains all repeating characters, it should return an empty string ("") or None -- see sample tests.
 */
  def main(args:Array[String]):Unit={

    assert(first_non_repeating_letter("a")== "a")
    assert(first_non_repeating_letter("stress")== "t")
    assert(first_non_repeating_letter("moonmen")== "e")
    assert(first_non_repeating_letter("")== "")
    assert(first_non_repeating_letter("abba")== "")
    assert(first_non_repeating_letter("aa")== "")
    assert(first_non_repeating_letter("~><#~><")== "#")
    assert(first_non_repeating_letter("hello world, eh?")== "w")
    assert(first_non_repeating_letter("sTreSS")== "T")
    assert(first_non_repeating_letter("Go hang a salami, I\"m a lasagna hog!")== ",")
    print("Done")

  }


  def first_non_repeating_letter(s:String):String={
    var res2:String=""
    val res:Array[String]=s.toLowerCase.groupBy(i => i)
      .map(i=>(i._1.toString,i._2.split("").size))
      .filter(i=> i._2==1)
      .map(i=>i._1)
      .toArray

    breakable {
      for (i <- s.split("")) {
        if (res.contains(i.toLowerCase())) {
          res2=i.toString
          break
        }
      }
    }

    return res2
  }
}