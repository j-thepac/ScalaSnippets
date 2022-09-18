

object Sumnodups {


def fn:Array[Int]=>Int=(i:Array[Int])=>i.groupBy(j => j).filter(m => m._2.size ==1).keys.sum

def main(args:Array[String]):Unit={
assert(fn(Array(1,2,2,3)) == 4)
println("DOne")
}
}
