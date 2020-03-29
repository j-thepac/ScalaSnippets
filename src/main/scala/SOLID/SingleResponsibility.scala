package SOLID

object SingleResponsibility {
  def main(args: Array[String]): Unit = {
    val person:Person=new Person()
    val file:File=new File()
    file.SaveName(person)
  }
}


class Person{
  def name:String=return "Sam"
}

class File{
  def SaveName(person:Person)=println("Saving .. "+person.name)
}