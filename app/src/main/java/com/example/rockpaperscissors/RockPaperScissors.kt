package com.example.rockpaperscissors

fun main() {
    //Day - 3 (07-12-2023)
    //Have to Upload it on Github
    var computerChoice = ""
    //var playerChoice = ""

    println("Rock, Paper or Scissor? Enter your choice!")
    var playerChoice = readln().lowercase()

    //Validate Users Input
    while (playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors") {
        println("Please Enter a valid entry")
        playerChoice = readln().lowercase()
    }


    val randomNumber = (1..3).random()  //How to generate a random number in a range

    computerChoice = when (randomNumber) {
        1 -> "rock"
        2 -> "paper"
        else -> "scissors"
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's a Tie")
    }else {
        println("$winner Won!")
    }
}



