package BehavioralPattern
import scala.collection.mutable._

object ObserverPattern {
  def main(args: Array[String]): Unit = {
    val p:NewUser=new NewUser("xyz")
    val observer:Observer=new Observer()
    observer.add_user(p)
    observer.send_notification("10% discount")
  }
}
class NewUser(private val name:String){
  def notification(message:String){println(this.name+" received notification "+message)}
}
class Observer{
  val newusers:ArrayBuffer[NewUser]=new ArrayBuffer[NewUser]()
  def add_user(user:NewUser)=newusers.append(user)
  def send_notification(message:String)=for(newuser<-newusers) newuser.notification(message)
}