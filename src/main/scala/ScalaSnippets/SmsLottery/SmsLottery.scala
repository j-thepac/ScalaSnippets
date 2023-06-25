/*
"""
Story
You were asked to write a simple validator for a company that is planning to introduce lottery betting via text messages. The same validator will be used for multiple games: e.g. 5 out of 90, 7 out of 35, etc. (N out of M)
The text messages should contain exactly N unique numbers between 1 and M (both included)== separated by a comma (,) and/or space(s). Any other character makes the bet invalid.
Your task
You receive the game type and the user's text message as input, and you need to check if the bet is valid or not. If it's valid, return the chosen numbers as a list, sorted in increasing order. If it's invalid, return None, null, nil as appropriate to your language.
Note: Leading and trailing spaces will not be tested. Tabs, newlines and other whitespaces are not tested either. Think of a classic Nokia 3310 user for reference :-)
Examples
validate_bet((5, 90), "1 2 3 4 5")       -->  (1, 2, 3, 4, 5)
validate_bet((5, 90), "5 , 3, 1  4,2")   -->  (1, 2, 3, 4, 5)
validate_bet((5, 90), "1, 2; 3, 4, 5")   -->  None / null / nil
validate_bet((5, 90), "1, 2, 3, 4")      -->  None / null / nil
validate_bet((5, 90), "1, 2, 3, 4, 95")  -->  None / null / nil
 */
import scala.util.matching.Regex
import scala.util.Try
object SmsLottery {
  def main(args:Array[String]):Unit={

    assert(validate_bet((5, 90), "1 2 3 4 5").get.sameElements(Array(1, 2, 3, 4, 5)))
    assert(validate_bet((5, 90), "5 , 3, 1  4,2").get.sameElements(Array(1, 2, 3, 4, 5)))
    assert(validate_bet((5, 90), "1, 2, 3; 4, 5").isEmpty)
    assert(validate_bet((5, 90), "1, 2, 3, 4").isEmpty)
    assert(validate_bet((5, 90), "1, 2, 3, 4, 95").isEmpty)
    print("DOne")
  }
 def validate_bet(game:(Int,Int),text:String):Option[Array[Int]]= {
   val regex:Regex= "\\s|,".r
    val ar=regex.split(text)
    val iL:Option[Array[Int]] = validateList(ar,game)
   if(iL.isEmpty )return None
    val res:Array[Int] =  iL.get.sortWith((x,y) => x < y )
    return Some(res)
 }

def validateList(l:Array[String],game: (Int,Int)):Option[Array[Int]]={
    try{
      val iL:Array[Int]= l.filter( i => i!="").map((i:String) => i.toInt)
      if(iL.filter((i:Int) => i> game._2).length >0) return None
      if(iL.length != game._1) return None
      return Some(iL)
    }
    catch {
      case ex:Exception => return None
    }

  }


}
