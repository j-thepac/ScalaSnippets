package ScalaSnippets
/*
he accounts of the "Fat to Fit Club (FFC)" association are supervised by John as a volunteered accountant. The association is funded through financial donations from generous benefactors. John has a list of the first n donations: [14, 30, 5, 7, 9, 11, 15] He wants to know how much the next benefactor should give to the association so that the average of the first n + 1 donations should reach an average of 30. After doing the math he found 149. He thinks that he made a mistake. Could you help him?

if dons = [14, 30, 5, 7, 9, 11, 15] then new_avg(dons, 30) --> 149

The function new_avg(arr, navg) should return the expected donation (rounded up to the next integer) that will permit to reach the average navg.

Should the last donation be a non positive number (<= 0) John wants us to throw (or raise) an error or

    return Nothing in Haskell
    return None in F#, Ocaml, Scala
    return -1 in C, Fortran, Nim, PowerShell, Go, Prolog
    echo ERROR in Shell
    raise-argument-error in Racket

so that he clearly sees that his expectations are not great enough.

Notes:

    all donations and navg are numbers (integers or floats), arr can be empty.
    See examples below and "Test Samples" to see which return is to be done.

new_avg([14, 30, 5, 7, 9, 11, 15], 92) should return 645
new_avg([14, 30, 5, 7, 9, 11, 15], 2)
should raise an error (ValueError or invalid_argument or argument-error or DomainError)
or return `-1` or ERROR or Nothing or None depending on the language.
 */
object NewAverage {

  def main(args: Array[String]): Unit = {
    val a1 = Array(14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0)
   println(newAvg(a1, 90.0))
  }

  def newAvg(arr: Array[Double], navg: Double): Option[Int] = {
    var x:Double=navg*(arr.length+1)-arr.sum
    if(x.toInt>=0) {
      if(x.isWhole==false) x=x+1
      return (Some(x.toInt))}
    else
      return None
  }
}
/*
1+2+3
--      =2.0
3
 */