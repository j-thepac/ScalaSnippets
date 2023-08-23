/*
"""
Given a set of elements (integers or string characters, characters only in RISC-V)== where any element may occur more than once, return the number of subsets that do not contain a repeated element.

Let's see with an example:

set numbers = {1, 2, 3, 4}
The subsets are:

{{1}, {2}, {3}, {4}, {1,2}, {1,3}, {1,4}, {2,3}, {2,4}, {3,4}, {1,2,3}, {1,2,4}, {1,3,4}, {2,3,4}, {1,2,3,4}}
There are 15 subsets. As you can see, the empty set, {}, is not counted.

Let's see an example with repetitions of an element:

set letters = {a, b, c, d, d}
The subsets for this case (including only those that have no repeated elements inside) will be:

{{a}, {b}, {c}, {d}, {a,b}, {a,c}, {a,d}, {b,c}, {b,d}, {c,d}, {a,b,c}, {a,b,d}, {a,c,d}, {b,c,d}, {a,b,c,d}}
There are 15 subsets.

The function est_subsets() (javascript: estSubsets()) will calculate the number of these subsets.

It will receive the array as an argument and according to its features will output the amount of subsets that do not contain a repeated element.

est_subsets(Array(1, 2, 3, 4)) == 15 #4C1 , 4C2 , 4C3 = 4, (4x3/2x1),(4*3*2/
est_subsets(Array('a', 'b', 'c', 'd', 'd')) == 15
Features of the random tests:

Low Performance Tests: 40
Length of the arrays between 6 and 15

High Performance Tests: 80
Length of the arrays between 15 and 100 (Python and Ruby) between 15 and 63 (C++) and between 15 and 50 in javascript and Lua
Just do it!
"""
*/

object Subset extends App{

  assert(est_subsets(Array(1, 2, 3, 4)) ==15)
  assert(est_subsets(Array('a', 'b', 'c', 'd', 'd'))==15)
  assert(est_subsets(Array(2, 3, 4, 5, 5, 6, 6, 7, 8, 8)) ==127)

  def est_subsets2(a:Array[Int]):Int={
    var res=0
    val num:(Int,Int)=>Int =(i:Int,j:Int)=> {Array.range(i ,0,-1).slice(0,j).foldLeft(1)(_*_)/Array.range(j,0,-1).foldLeft(1)(_*_)}
    val data:Int=a.toSet.toArray.length
    for ( i <- (1 to data)){
      res+=num(data,i)
    }

    res
  }

  def est_subsets(a: Array[Int]): Int = {

    val num: (Int, Int) => Int = (i: Int, j: Int) => {
      Array.range(i, 0, -1).slice(0, j).foldLeft(1)(_ * _) / Array.range(j, 0, -1).foldLeft(1)(_ * _)
    }
    val data: Int = a.toSet.toArray.length
    val res =(1 to data).foldLeft(0)((acc,i)=>num(data,i)+acc)
    return res
  }




  
}