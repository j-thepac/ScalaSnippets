

//https://blog-en.richardimaoka.net/akka-http-quickstart
//https://medium.com/@knoldus/introduction-to-akka-http-c43388db6ae2
//AKka Actor > Stream > Http
//Akka HTTP is on top of the other two layers
//  Akka Stream (ActorMaterializer) handles internal processing of Akka HTTP
//Akka Actor (ActorSystem) is the base for running Akka Stream

package Server

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Route



//import akka.http.scaladsl.server.Route
//import akka.http.scaladsl.Http
//import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import org.json._

object SimpleServer extends App {
  implicit val system = ActorSystem("UsingDirectives")
  implicit val materializer = ActorMaterializer()

  import system.dispatcher

  val html: String = """ <html><body>Hello</body></html>""".stripMargin
  val jsonObject: JSONObject = new JSONObject();
  jsonObject.put("name", "deepak");
  jsonObject.put("address", "Bangalore");


//  curl -X GET http://localhost:8080/resource/hi/1?id=5 -H "header:123"

  val resource:Route =
    path("resource"  / Segment /IntNumber) {
      (id, inventory) =>get {
        parameters('id.as[Int],'value.as[String]){
          case (id:Int,value:String) =>complete(HttpResponse(StatusCodes.OK))}
                                    println(s"resource: $id, $inventory")
        //                              optionalHeaderValueByName("header") {
        //                                case Some(s) =>temp_id=s //complete(HttpResponse(status = StatusCodes.OK, entity = s))
        //                                case _ => complete(HttpEntity(ContentTypes.`text/html(UTF-8)`,"No headers ") )}}
        complete(HttpResponse(StatusCodes.OK))
      }
  }

//  def getRoute : Route = get {
//    path("dataSourceByName" / Segment /IntNumber) {
//      parameters('name.as[String]) {
//        (name) => complete(HttpResponse(StatusCodes.OK))
//
//      }
//    }
//  }

    Http().bindAndHandle(resource, "localhost", 8080)

}
