//package ScalaSnippets.RockPaper


/*
In this kata, your task is to implement an extended version of the famous rock-paper-scissors game. The rules are as follows:

Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
Task:
Given two values from the above game, return the Player result as "Player 1 Won!", "Player 2 Won!", or "Draw!".


 */
object Rockpaper {

  val m:Map[String,(String,String)] = Map(
    "scissors" -> ("paper", "lizard")
    , "paper"-> ("rock", "spock")
    , "rock"->("lizard", "scissors")
    , "lizard"-> ("spock", "paper")
    , "spock"-> ("rock", "scissors")
  )

   def main(args: Array[String]): Unit={
     assert(rpsls("rock", "lizard")== "Player 1 Won!")
     assert(rpsls("paper", "rock")== "Player 1 Won!")
     assert(rpsls("scissors", "lizard")== "Player 1 Won!")
     assert(rpsls("lizard", "paper")== "Player 1 Won!")
     assert(rpsls("spock", "rock")== "Player 1 Won!")
     assert(rpsls("lizard","scissors")== "Player 2 Won!")
     assert(rpsls("spock","lizard")== "Player 2 Won!")
     assert(rpsls("paper","lizard")== "Player 2 Won!")
     assert(rpsls("scissors","spock")== "Player 2 Won!")
     assert(rpsls("rock","spock")== "Player 2 Won!")
     assert(rpsls("rock", "rock")== "Draw!")
     assert(rpsls("spock", "spock")== "Draw!")
     print("done")
   }
  
  def rpsls(s1:String,s2:String):String={
    if(s1==s2) return "Draw!"
    else if(m(s1).productIterator.contains(s2)) return "Player 1 Won!"
    else
      return "Player 2 Won!"
  }
}
