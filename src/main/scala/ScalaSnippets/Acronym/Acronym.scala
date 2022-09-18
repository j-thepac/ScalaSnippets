/*
Write function which takes a string and make an acronym of it.

Rule of making acronym in this kata:

split string to words by space char
take every first letter from word in given string
uppercase it
join them toghether
Eg:

Code wars -> C, w -> C W -> CW
*/


object Acronym {

val tc =Array(
("Code Wars", "CW"),
("Water Closet", "WC"),
("Portable Network Graphics", "PNG"),
("PHP: Hypertext Preprocessor", "PHP"),
("hyper text markup language", "HTML"))

    def main(args:Array[String]):Unit={
        tc.foreach(i=> assert(fn(i._1)==i._2))
        println("done")
    }

    def fn: String=>String = _.split(" ").map(i => i(0).toString.toUpperCase).mkString("")
}