/*
Create a function that takes a string as an argument and returns true if each letter in the string is surrounded by a plus sign. Return false otherwise.

Examples
plusSign("+f+d+c+#+f+") ➞ true

plusSign("+d+=3=+s+") ➞ true

plusSign("f++d+g+8+") ➞ false

plusSign("+s+7+fg+r+8+") ➞ false
Notes
For clarity, each letter must have a plus sign on both sides.
*/


object Neighbour {

    val fx:String=>Boolean=(s:String)=>("a"+s).split("\\+").map(_.size).forall(_==1)


    def main(args:Array[String]):Unit={
        assert(fx("+f+d+c+#+f+")==true)
        assert(fx("+d+=3=+s+")==false)

    }



}
