/*
Description
"It's the end of trick-or-treating and we have a list/array representing how much candy each child in our group has made out with. We don't want the kids to start arguing, and using our parental intuition we know trouble is brewing as many of the children in the group have received different amounts of candy from each home.

So we want each child to have the same amount of candies, only we can't exactly take any candy away from the kids, that would be even worse. Instead we decide to give each child extra candy until they all have the same amount.

Task
Your job is to find out how much candy each child has, and give them each additional candy until they too have as much as the child(ren) with the most candy. You also want to keep a total of how much candy you've handed out because reasons."

Your job is to give all the kids the same amount of candies as the kid with the most candies and then return the total number candies that have been given out. If there are no kids, or only one, return -1.

In the first case (look below) the most candies are given to second kid (i.e second place in list/array), 8. Because of that we will give the first kid 3 so he can have 8 and the third kid 2 and the fourth kid 4, so all kids will have 8 candies.So we end up handing out 3 + 2 + 4 = 9.

(5, 8, 6, 4) =>  9
(1, 2, 4, 6) => 11
(1, 6)       =>  5
( )          => -1
(6)          => -1 (because only one kid)

 */


object TrickerTreak extends App{

  val testCases = Seq(
    (Seq(5,8,6,4), 9),
    (Seq(1,2,4,6), 11),
    (Seq(1,2), 1),
    (Seq(4,2), 2),
    (Seq(1,3,3,7), 14),
    (Seq(7,7,7,7), 0),
    (Seq(17,20,50,61,42,44), 132),
    (Seq(0), -1),
    (Seq(), -1),
    (Seq(4),  -1)
  )

  val res = testCases.map( tc => {
    if(tc._1.length <2 ) -1 == tc._2
    else
    tc._1.foldLeft(0)((acc, ele) => acc + (tc._1.max - ele)) == tc._2
  }
  )
  res.foreach(println)

}