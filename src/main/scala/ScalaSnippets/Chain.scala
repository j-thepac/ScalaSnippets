/*
Write a generic function chainer
Write a generic function chainer that takes a starting value, and an array of functions to execute on it (array of symbols for Ruby).

The input for each function is the output of the previous function (except the first function, which takes the starting value as its input). Return the final value after execution is complete.

def add10(x): return x + 10
def mul30(x): return x * 30

chain(50, [add10, mul30])
# returns 1800

*/


object Chain {

    def main(args:Array[String]):Unit={
        def add30:Int=>Int=(i:Int)=> i+30
        def mul30:Int=>Int= (i:Int) => i*30
        var d:Int=30

        val res=(add30 compose mul30)(30)
//        Array(add30,mul30).foreach(f => {d=f(d)} )
        println(res)


    }
}