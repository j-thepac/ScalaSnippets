/*
"""

Implement a function which takes a sequence of objects and a property name, and returns a sequence containing the named property of each object.

For example:

objs = [{"a":1,"b":2,"c": 3},{"a":4,"b":5,"c": 6},{"a":7,"b":8,"c": 9},{"a":10,"b":11}]

assert(pluck(objs, 'a')== [1,4,7,10])
assert(pluck(objs, 'b')== [2,5,8,11])
assert(pluck(objs, 'c')== [3,6,9,None])

"""
 */

import net.liftweb.json._


case class A(a: Int, b: Int, c: Option[Int])

 object Pluck extends App {
   implicit val formats = DefaultFormats

   val json = """[{"a":1,"b":2,"c":3},{"a":4,"b":5,"c":6},{"a":7,"b":8,"c":9},{"a":10,"b":11}]"""

   try {
     val p = parse(json).extract[List[A]]
     println(prettyRender(Extraction.decompose(p)))
   } catch {
     case e: Exception => println(s"Error: $e")
   }


 }