import scala.util.matching.Regex

object RegexPin {
    def main(args:Array[String]):Unit={
        val exp:Regex="^\\d{4}$|^||d{6}$".r
        val fn:String=>Boolean = (s:String) => exp.findAllIn(s).length >0
        print(fn("1234"))
        print(fn("12345"))
        print(fn("123456"))
    }


}