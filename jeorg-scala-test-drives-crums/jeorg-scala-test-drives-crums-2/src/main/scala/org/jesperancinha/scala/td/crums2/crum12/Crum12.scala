package org.jesperancinha.scala.td.crums2.crum12

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum12 {
  type Easter = String
  type Eastern = String
  type Western = String
  type Northern = String
  type Southern = String

  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 12 - type aliases"))
      .reset()

    val bigPotatoGreeting: Eastern = "Happy Eastern!!"
    val correctedGreeting: Easter = "Happy Easter!"

    ConsolerizerComposer.outSpace().yellow("Meet Big Potato. Big Potato makes mistakes and wishes everybody a")
      .green(bigPotatoGreeting)
      .yellow("However, Big Potato gets corrected and so we have")
      .green(correctedGreeting)
      .yellow("But now let's use a method for this")
      .reset()

    greetError(bigPotatoGreeting)
    greet(bigPotatoGreeting) // This is possible because type aliases are transparent. opaque would fix this. Check Scala 3 crums for more on type aliases and opaque usage
    greet(correctedGreeting)

    ConsolerizerComposer.out()
      .magenta("Other strange greetings would have also happened")
      .reset()

    val bigTurnipGreeting: Western = "Happy Western!!"
    val bigCourgetteGreeting: Northern = "Happy Northern!!"
    val bigRiceGreeting: Southern = "Happy Southern!!"
    val bigCornGreeting: Eastern = "Happy Eastern!!"

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
