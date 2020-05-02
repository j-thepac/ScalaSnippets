import org.scalatest.{FunSpec, FunSuite}
import ScalaSnippets.GetPlanetName.get_planet_name
class GetPlanetNameSpec extends FunSpec {

  describe("GetPlanetName.get_planet_name") {
    it("should pass fixed tests") {
      assertResult("Venus") {get_planet_name(2)}
      assertResult("Jupiter") {get_planet_name(5)}
      assertResult("Earth") {get_planet_name(3)}
    }
  }
}
