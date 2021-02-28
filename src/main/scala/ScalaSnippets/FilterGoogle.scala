
/*
Log filtering
Input data: a simplified log of a web server (i.e., a textual file)
Each line of the file is associated with a URL request

Output: the lines containing the word "google"
Store the output in a local folder, for simplicity

Example of data
Input data
66.249.69.97 --[24/Sep/2014:22:25:44 +0000] "GET http://www.google.com/bot.html”
66.249.69.97 --[24/Sep/2014:22:26:44 +0000] "GET http://www.google.com/how.html”
66.249.69.97 --[24/Sep/2014:22:28:44 +0000] "GET http://dbdmg.polito.it/course.html”
71.19.157.179 --[24/Sep/2014:22:30:12 +0000] "GET http://www.google.com/faq.html”
66.249.69.97 --[24/Sep/2014:31:28:44 +0000] "GET http://dbdmg.polito.it/thesis.html”

Output data
66.249.69.97 --[24/Sep/2014:22:25:44 +0000] "GET http://www.google.com/bot.html”
66.249.69.97 --[24/Sep/2014:22:26:44 +0000] "GET http://www.google.com/how.html”
71.19.157.179 --[24/Sep/2014:22:30:12 +0000] "GET http://www.google.com/faq.html”
 */
package ScalaSnippets
import org.apache.spark.sql.SparkSession
object FilterGoogle extends App {

  val spark:SparkSession=SparkSession.builder().master("local").appName("googlefilter").getOrCreate()
  import spark.implicits._

  val data=
    """
      |66.249.69.97 --[24/Sep/2014:22:25:44 +0000] "GET http://www.google.com/bot.html”
      |66.249.69.97 --[24/Sep/2014:22:26:44 +0000] "GET http://www.google.com/how.html”
      |66.249.69.97 --[24/Sep/2014:22:28:44 +0000] "GET http://dbdmg.polito.it/course.html”
      |71.19.157.179 --[24/Sep/2014:22:30:12 +0000] "GET http://www.google.com/faq.html”
      |66.249.69.97 --[24/Sep/2014:31:28:44 +0000] "GET http://dbdmg.polito.it/thesis.html”
      |""".stripMargin

  data.split("\n").filter(_.contains("google")).foreach(println)


}
