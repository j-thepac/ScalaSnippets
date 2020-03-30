package BehavioralPattern
import scala.collection.mutable._
object MediatorPattern {
  def main(args: Array[String]): Unit = {
    val user:User=new User("abc")
    val chat:Chat=new Chat()
    user.join(chat)
    user.send_message("Hi")
  }
}


class User(private var name:String){
var chat:Chat=_
  def join(chat:Chat): Unit ={
    this.chat=chat
    this.chat.add_user(this)
  }
  def receive_message(message: String)=println("Received :"+message +" by "+name)
  def send_message(message:String)=this.chat.send_message(message)
}

class Chat{
  var users:ArrayBuffer[User]=new ArrayBuffer[User]()
  def add_user(user:User): Unit =this.users.append(user)
  def send_message(message:String): Unit =for (user<-users)user.receive_message(message)
}