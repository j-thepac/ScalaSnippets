/*
Seven Boom!
Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

Examples
sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
// 7 contains the number seven.

sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
// None of the items contain 7 within them.

sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
// 97 contains the number seven.
*/

object SevenBoom extends App{
    //val res:Array[Int]=>Boolean = (a:Array[Int]) => a.mkString("").contains("7")
    val fn:Array[Int]=>String = (a:Array[Int]) => {if (a.mkString("").contains("7")) "Boom!" else "no 7"}
     
    assert( fn(Array(1, 2, 3, 4, 5, 6, 7)) == "Boom!")
    assert( fn(Array(8, 6, 33, 100)) == "no 7")
    assert( fn(Array(2, 55, 60, 97, 86)) == "Boom!")


}