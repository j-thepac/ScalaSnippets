object NameNoMap{

    def main(args:Array[String]):Unit={
        assert(name_that_number(90)== "ninety")
        assert(name_that_number(1)== "one")
        assert(name_that_number(52)== "fifty two")
        assert(name_that_number(21)== "twenty one")
        assert(name_that_number(99)== "ninety nine")
        assert(name_that_number(0)== "zero")
        assert(name_that_number(53)== "fifty three")
        assert(name_that_number(23)== "twenty three")
        assert(name_that_number(76)== "seventy six")
        print("DONE")
    }

    def name_that_number(i:Int):String={
        val n1:Map[Int,String] = Map(0->"zero",1->"one",2->"two",3->"three",4->"four",5->"five",6->"six",7->"seven",8->"eight",9->"nine",10->"ten")
        val n2:Map[Int,String] = Map(11->"eleven",12->"twelve",13->"thirteen",14->"fourteen",15->"fifteen",16->"sixteen",17->"seventeen",18->"eighteen",19->"nineteen")
        val n3:Map[Int,String] = Map(20->"twenty",30->"thirty",40->"forty",50->"fifty",60->"sixty",70->"seventy",80->"eighty",90->"ninety")

        if(i <= 10) return n1(i)
        else if((i <=19)) return  n2(i)
        else if (i %  10 ==0)return n3(i)
        else{
            val rem= i%10
            val div= (Math.floorDiv(i,10)*10)
            return (f"${n3(div)} ${n1(rem)}")

            }
        }
    


}