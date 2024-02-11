/*
Introduction
There is a war...between alphabets!
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began. The letters called airstrike to help them in war - dashes and dots are spread throughout the battlefield. Who will win?

Task
Write a function that accepts a fight string which consists of only small letters and * which represents a bomb drop place. Return who wins the fight after bombs are exploded. When the left side wins return Left side wins!, and when the right side wins return Right side wins!. In other cases, return Let's fight again!.

The left side letters and their power:

 w - 4
 p - 3
 b - 2
 s - 1
The right side letters and their power:

 m - 4
 q - 3
 d - 2
 z - 1
The other letters don't have power and are only victims.
The * bombs kill the adjacent letters ( i.e. aa*aa => a___a, **aa** => ______ );

Example
AlphabetWar("s*zz");           //=> Right side wins!
AlphabetWar("*zd*qm*wp*bs*"); //=> Let's fight again!
AlphabetWar("zzzz*s*");       //=> Right side wins!
AlphabetWar("www*www****z");  //=> Left side wins!

 */
import scala.util.matching.Regex
import scala.collection.mutable._

object LetterBomb {
  def main(args:Array[String]):Unit={
    assert("Right side wins!"== alphabetWar("z"));
    assert("Let's fight again!"== alphabetWar("****"));
    assert("Let's fight again!"== alphabetWar("z*dq*mw*pb*s"));
    assert("Let's fight again!"== alphabetWar("zdqmwpbs"));
    assert("Right side wins!"== alphabetWar("zz*zzs"));
    assert("Left side wins!"== alphabetWar("sz**z**zs"));
    assert("Left side wins!"== alphabetWar("z*z*z*zs"));
    assert("Left side wins!"== alphabetWar("*wwwwww*z*"));
    print("Done")

    def alphabetWar(str: String):String={
      val exp: Regex = """.\*+.|.\*|\*.""".r
      val res=exp.replaceAllIn(str,"")
      val m1= Map("w" -> 4,"p" -> 3,"b" -> 2,"s" -> 1 )
      val m2= Map("m" -> 4,"q" -> 3,"d" -> 2,"z" -> 1 )
      var r1,r2=0
      for( i <- res){
        if(m1.keys.exists(_.contains(i)))r1=r1+m1(i.toString)
        else if(m2.keys.exists(_.contains(i)))r2=r2+m2(i.toString)
      }
      if(r1 > r2) return "Left side wins!"
      else if(r1 < r2) return "Right side wins!"
      return "Let's fight again!"
    }
  }
}