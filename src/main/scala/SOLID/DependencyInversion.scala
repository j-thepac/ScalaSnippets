package SOLID
import scala.collection.mutable._
object DependencyInversion {
  def main(args: Array[String]): Unit = {
    val qa:Employee=new QA
    val dev:Employee=new Dev
    val manager:Manager=new Manager

    manager.add_emp(qa)
    manager.add_emp(dev)
    println(manager.emp.length)
  }
}


//CORRECT
class Employee{}
class QA extends Employee
class Dev extends Employee
class Manager{
  var emp:ArrayBuffer[Employee]=new ArrayBuffer[Employee]()
  def add_emp(emp:Employee): Unit ={
    this.emp.append(emp)
  }
}

//WRONG
class Manager2{
  var qa:ArrayBuffer[QA]=new ArrayBuffer[QA]()
  var dev:ArrayBuffer[Dev]=new ArrayBuffer[Dev]()
  def add_qa(qa:QA)=this.qa.append(qa)
}