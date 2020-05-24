import org.scalatest._
import ScalaSnippets.NewAverage
class NewAverageSpec extends FunSuite {
  test("NewAverageSpec"){
    val a1 = Array(14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0)
    assert(NewAverage.newAvg(a1, 90.0)== Some(628));
    val a2 = Array(14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0)
    assert(NewAverage.newAvg(a2, 92.0)== Some(645));
    val a3 = Array(14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0)
    assert(NewAverage.newAvg(a3, 2.0)== None);
  }

}
