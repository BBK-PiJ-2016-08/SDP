/**
  * Created by jakeholdom on 17/01/2017.
  */

object Hammurabi {


  def hammurabi: Unit ={

    var starved = 0 // how many people starved
    var immigrants = 5 // how many people came to the city
    var population = 100
    var harvest = 3000 // total bushels harvested
    var bushelsPerAcre = 3 // amount harvested for each acre planted
    var rats_ate = 200 // bushels destroyed by rats
    var bushelsInStorage = 2800
    var acresOwned = 1000
    var pricePerAcre = 19 // each acre costs this many bushels
    var plagueDeaths = 0

    printIntroductoryMessage()

    var i = 0
    for (i <- 1 to 10){

      println("O great Hammurabi!\nYou are in year " + i +
        " of your ten year rule.\nIn the previous year " + starved +
        " people starved to death.\nIn the previous year " + immigrants +
        " people entered the kingdom.\nThe population is now " + population +
        ".\nWe harvested " + harvest + " bushels at " + bushelsPerAcre +
        " bushels per acre.\nRats destroyed " + rats_ate +
        " bushels, leaving " + bushelsInStorage +
        " bushels in storage.\nThe city owns " + acresOwned +
        " acres of land.\nLand is currently worth " + pricePerAcre +
        " bushels per acre.\nThere were " + plagueDeaths + " deaths from the plague.")

    }


  }

  def readInt(message: String): Int = {
    try {
      readLine(message).toInt
    } catch {
      case _ : Throwable =>
        println("That’s not an integer. Please enter an integer.")
        readInt(message)
    }
  }
  def printIntroductoryMessage(): Unit = {

    println("Congratulations, you are the newest ruler of ancient Samaria, elected\nfor a ten year term of office. Your duties are to dispense food, direct\nfarming, and buy and sell land as needed to support your people. Watch\nout for rat infestations and the plague! Grain is the general currency,\nmeasured in bushels. The following will help you in your decisions:\n* Each person needs at least 20 bushels of grain per year to survive.\n* Each person can farm at most 10 acres of land.\n* It takes 2 bushels of grain to farm an acre of land.\n* The market price for land fluctuates yearly.\nRule wisely and you will be showered with appreciation at the end of\nyour term. Rule poorly and you will be kicked out of office!")


  }

}
