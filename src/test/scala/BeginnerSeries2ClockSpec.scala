import ScalaSnippets.BeginnerSeries2ClockTest
import org.scalatest.FunSuite


class BeginnerSeries2ClockSpec extends FunSuite {
  test("basic tests") {
    assert(BeginnerSeries2ClockTest.past(0, 1, 1) === 61000)
    assert(BeginnerSeries2ClockTest.past(1, 1, 1) === 3661000)
    assert(BeginnerSeries2ClockTest.past(0, 0, 0) === 0)
    assert(BeginnerSeries2ClockTest.past(1, 0, 1) === 3601000)
    assert(BeginnerSeries2ClockTest.past(1, 0, 0) === 3600000)
  }
}

