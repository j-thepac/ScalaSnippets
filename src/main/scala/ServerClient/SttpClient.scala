package ServerClient

/*
libraryDependencies += "com.softwaremill.sttp.client3" %% "core" % "3.5.1"

Bazel Dependencies :
com.softwaremill.sttp.client3.core
com.softwaremill.sttp.client3.model
com.softwaremill.sttp.client3.shared
 */
import sttp.client3._
object SttpClient extends App{

  val url= "http://0.0.0.0:9999/test/1"
  val headers:Map[String,String]=Map("Content-type"->"application/json")
  val payload:String="""{"name":"deepsk"}"""

  post(url,headers,payload)
  get(url,headers)

  def get(url:String,headers:Map[String,String]):Unit={
    val backend = HttpURLConnectionBackend()
    val response = basicRequest.headers(headers) .get(uri"${url}").send(backend)
    println(response.body)
  }

  def post(url:String,headers:Map[String,String],payload:String):Unit={
    val backend = HttpURLConnectionBackend()
    val response = basicRequest.body(payload).headers(headers) .post(uri"${url}").send(backend)
    println(response.body)
  }

}
