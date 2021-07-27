package org.jesperancinha.scala3.td.crums1.crum3

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

opaque type Easter = String

val getGoodGreeting: (String) => Easter = (greeting: String) => {
  val good: Easter = greeting
  good
}

object Crum3 {

  type Eastern = String
  type Western = String
  type Northern = String
  type Southern = String

  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 3 - opaque type aliases"))
      .reset()


    val bigPotatoGreeting: Eastern = "Happy Eastern!!"
    val correctedGreeting: Easter = getGoodGreeting("Happy Easter!")

    ConsolerizerComposer.outSpace().yellow("Meet Big Potato. Big Potato makes mistakes and wishes everybody a")
      .green(bigPotatoGreeting)
      .yellow("However, Big Potato gets corrected and so we have")
      .green(correctedGreeting)
      .yellow("But now let's use a method for this")
      .reset()

    greetError(bigPotatoGreeting)
    // greet(bigPotatoGreeting) // This is not possible because the scope is different
    greet(correctedGreeting)

    ConsolerizerComposer.out()
      .magenta("Other strange greetings would have also happened")
      .reset()

    val bigTurnipGreeting: Western = "Happy Western!!"
    val bigCourgetteGreeting: Northern = "Happy Northern!!"
    val bigRiceGreeting: Southern = "Happy Southern!!"
    val bigCornGreeting: Eastern ="Happy Eastern!!"

    greetError(bigTurnipGreeting)
    greetError(bigCourgetteGreeting)
    greetError(bigRiceGreeting)
    greetError(bigCornGreeting)
  }

  def greet(greeting: Easter): Unit = {
    ConsolerizerComposer.outSpace()
      .bgGreen(greeting)
      .reset()
  }

  def greetError(greeting: Eastern): Unit = {
    ConsolerizerComposer.outSpace()
      .bgRed(greeting)
      .reset()
  }

}


