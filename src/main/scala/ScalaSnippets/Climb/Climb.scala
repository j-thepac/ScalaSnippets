
/*
In rock climbing (bouldering specifically), the V/Vermin (USA) climbing grades start at 'VB' (the easiest grade), and then go 'V0', 'V0+', 'V1', 'V2', 'V3', 'V4', 'V5' etc. up to 'V17' (the hardest grade). You will be given a list (lst) of climbing grades and you have to write a function (sort_grades) to return a list of the grades sorted easiest to hardest.

If the input is an empty list, return an empty list; otherwise the input will always be a valid list of one or more grades.

Please do vote, rank, and provide any feedback on the kata.
 */

import scala.collection.mutable._
object Climber extends App{
  assert(sort_grades(Array.empty[String]).sameElements(Array.empty[String]))
  assert(sort_grades(Array("V1")).sameElements(Array("V1")))
  assert(sort_grades(Array("V7", "V12", "V1")).sameElements(Array("V1", "V7", "V12")))
  assert(sort_grades(Array("V13", "V14", "VB", "V0")).sameElements(Array("VB", "V0", "V13", "V14")))
  assert(sort_grades(Array("V0+", "V0", "V16", "V2", "VB", "V6")).sameElements(Array("VB", "V0", "V0+", "V2", "V6", "V16")))
  print("Done")

  def sort_grades(a:Array[String]):Array[String]={
    val buf =ArrayBuffer[String]()++a
    var vb,vop=false
    if(buf.indexOf("VB")!= -1){
      vb= true
      buf.remove(buf.indexOf("VB"))
    }

    if (buf.indexOf("V0+")!= -1) {
      vop = true
      buf.remove(buf.indexOf("V0+"))
    }


    var result = buf.sortBy( (i:String) => i.slice(1,i.length).toInt)

    if(vop){
      if(result(0) == "V0") {
        result= result.slice(1,result.length)
        result.insertAll(0,Array("V0","V0+"))
      }
      else
        result.insertAll(0,Array("V0+"))
    }
    if (vb) {
        result.insertAll(0, Array("VB"))
    }
    return result.toArray
  }

}