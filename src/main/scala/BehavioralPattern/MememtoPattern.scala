package BehavioralPattern

 object MememtoPattern{
   def main(args: Array[String]): Unit = {
     val account:Account=new Account
     val memento:Memento=account.credit(100)
     println(account.balance)
     account.recover(memento)
     println(account.balance)
   }
 }
class Memento(val balance:Int)
class Account{
   var balance:Int=1000
  def credit(amt:Int): Memento ={
    val memento:Memento=new Memento(balance)
    this.balance+=amt
    return memento
  }
  def recover(memento: Memento)={this.balance=memento.balance}
}