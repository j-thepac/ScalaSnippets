
/*
The function is not returning the correct values. Can you figure out why?

get_planet_name(3); //should return "Earth"
 */
package ScalaSnippets
object GetPlanetName{
  def get_planet_name(i:Int):String={
    i match {
      case 1=>"Mercury"
      case 2=>"Venus"
      case 3=>"Earth"
      case 4=>"Mars"
      case 5=>"Jupiter"
      case 6=>"Saturn"
      case 7=>"Uranus"
      case 8=>"Neptune"
      case 9=>"Pluto"}
  }
}
