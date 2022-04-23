//docker run --rm -it -v $PWD:/home/apps -w /home/apps  aa8y/scala Boomerang.scala



object Boomerange extends App{

val countBoomerangs:Array[Int]=> Int = (a:Array[Int]) => 
a.sliding(3).filter( i => (i(0) == i(2) && i(0) != i(1))).length

assert(countBoomerangs(Array(9, 5, 9, 5, 1, 1, 1)) == 2)
assert(countBoomerangs(Array(5, 6, 6, 7, 6, 3, 9)) == 1)
assert(countBoomerangs(Array(4, 4, 4, 9, 9, 9, 9) )== 0)

println("DONE")

}