/*
A number is said to be Disarium if the sum of its digits raised to their respective positions is the number itself.

Create a function that determines whether a number is a Disarium or not.

Examples
is_disarium(75) ➞ False
# 7^1 + 5^2 = 7 + 25 = 32

is_disarium(135) ➞ True
# 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135

is_disarium(544) ➞ False

is_disarium(518) ➞ True

is_disarium(466) ➞ False

is_disarium(8) ➞ True
*/

object Dissort extends App{

    fn(518)
    def fn (d:Int):Boolean={
        val fx =(i:Int) => i.toString.zip(1 to i.toString.size).map(j=> Math.pow(j._1.toInt-48,j._2)).toList
        return (fx(d).sum == d)
    }
}