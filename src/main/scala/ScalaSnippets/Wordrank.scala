/*
Create a function that takes a string of words and returns the highest scoring word. Each letter of a word scores points according to it's position in the alphabet: a = 1, b = 2, c = 3, etc.

Examples
wordRank("The quick brown fox.") ➞ "brown"

wordRank("Nancy is very pretty.") ➞ "pretty"

wordRank("Check back tomorrow, man!") ➞ "tomorrow"

wordRank("Wednesday is hump day.") ➞ "Wednesday"
Notes
If two words score the same, return the word that appears first in the original string.
The returned string should only contain alphabetic characters (a-z).
Preserve case in the returned string (see 4th example above).
*/


object WordRank extends App{

    val n=(0 to 27)
    val alpha=('a' until 'z')
    val m = alpha.zip(n).toMap

    def fn(v:String):String= {
        val res1 = v.split(" ").map(i => i.toList.map(i => m(i)).sum)
        val maxres=res1.max
        return v(v.indexOf(maxres))
    }

}