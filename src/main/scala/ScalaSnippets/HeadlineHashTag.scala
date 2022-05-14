/*
Write a function that retrieves the top 3 longest words of a newspaper headline and transforms them into hashtags. If multiple words tie for the same length, retrieve the word that occurs first.

*/


object HeadLineHashTag extends App{


val f:String => ArrayArray[String] = (s:String) => s.toLowerCase.split(" ").sortWith(_.length > _.length).slice(0,3).map(i=>"#"+i)


assert(f("How the Avocado Became the Fruit of the Global Trade") == Array("#avocado", "#became", "#global"))
assert(f("Why You Will Probably Pay More for Your Christmas Tree This Year") == Array("#christmas", "#probably", "#will"))
assert(f("Hey Parents, Surprise, Fruit Juice Is Not Fruit")== Array("#surprise", "#parents", "#fruit"))
assert(f("Visualizing Science")==Array("#visualizing", "#science")

}