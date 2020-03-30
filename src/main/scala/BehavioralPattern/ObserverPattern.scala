package BehavioralPattern
import scala.collection.mutable._

object ObserverPattern {
  def main(args: Array[String]): Unit = {
    val p:NewUser=new NewUser()
    p.set_name("xyz")
    val observer:Observer=new Observer()
    observer.add_user(p)
    observer.send_notification("10% discount")
  }
}


class NewUser{
  private var name:String=_
  def set_name(name:String){this.name=name}
  def notification(message:String){println(this.name+" received notification "+message)}
}

class Observer{
  val newusers:ArrayBuffer[NewUser]=new ArrayBuffer[NewUser]()
  def add_user(user:NewUser)=newusers.append(user)
  def send_notification(message:String)=for(newuser<-newusers) newuser.notification(message)
}