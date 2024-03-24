/*
Write a function which receives 4 digits and returns the latest time of day that can be built with those digits.

The time should be in HH:MM format.

Examples:

digits: 1, 9, 8, 3 => result: "19:38"
digits: 9, 1, 2, 5 => result: "21:59" (19:25 is also a valid time, but 21:59 is later)
Notes
Result should be a valid 24-hour time, between 00:00 and 23:59.
Only inputs which have valid answers are tested.
 */


object LatestDate extends App{

  assert(latestClock(1, 9, 8, 3) == "19:38")
  assert(latestClock(9, 1, 2, 5) == "21:59")
  assert(latestClock(1, 2, 8, 9) == "19:28")
  assert(latestClock(0, 0, 0, 0) == "00:00")
  assert(latestClock(2, 4, 0, 0) == "20:40")
  print("Done")

  def latestClock(i: Int, i1: Int, i2: Int, i3: Int):String={
    val a:Array[Int]= Array(i,i1,i2,i3)
    val st:Array[String]=a
      .permutations
      .map(_.mkString)
      .filter(i => i.slice(0,2)< "24" && i.slice(2,i.length) <"60")
      .toArray

    val res:String= st.sortWith((acc,ele) => acc > ele)(0)
    return f"${res.slice(0,2)}:${res.slice(2,res.length)}"

  }
}