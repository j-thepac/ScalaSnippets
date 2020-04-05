import org.scalatest.{FunSuite}
import ScalaSnippets.Countpositives_Sumnegatives
class Countpositives_SumnegativesSpec extends FunSuite{
    val tests = List(
      (Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15), (10, -65)),
      (Array(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14), (8, -50)),
      (Array(1), (1, 0)),
      (Array(-1), (0, -1)),
      (Array(0, 0, 0, 0, 0, 0, 0, 0, 0), (0, 0)),
      (Array[Int](), (0, 0))
    )
    var i:Int=1
    tests.foreach {
      case (input, expected) =>{
        test("Test No "+i){
       assert( Countpositives_Sumnegatives.countPositivesSumNegatives(input) == (expected))
        }
        i=i+1
  }

}}
