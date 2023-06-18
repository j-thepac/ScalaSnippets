import scala.collection.mutable._
import scala.reflect.ClassTag
object FindArray extends App{



//print()
//  val res = find_array(Array('a', 'a', 'a', 'a', 'a'), Array(2, 4))
  assert(find_array(Array('a', 'a', 'a', 'a', 'a'), Array(2, 4)).sameElements(Array('a', 'a')))
//  assert(find_array(Array(0, 1, 5, 2, 1, 8, 9, 1, 5), Array(1, 4, 7))== Array(1, 1, 1))
//  assert(find_array(Array(1, 2, 3, 4, 5), Array(0))== Array(1))
//  assert(find_array(Array(0, 3, 4), Array(2, 6))== Array(4))
//  assert(find_array(Array(1), Array())== Array())
//  assert(find_array(Array(), Array(2))== Array())
//  assert(find_array(Array(), Array())== Array())

  def find_array[T: ClassTag](arr1: Array[T], arr2: Array[Int]): Array[T] = {
    val res: ArrayBuffer[T] = new ArrayBuffer[T]()
    for (a <- arr2; if a < arr1.length && a >= 0) {
      res.append(arr1(a))
    }
    res.toArray

  }
print("Done")

  
}