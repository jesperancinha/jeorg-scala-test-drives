package org.jesperancinha.scala.td.crums1.crum13

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum13 {
  def main(args: Array[String]): Unit = {

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 13 - Functional literals, aka, anonymous functions"))
      .reset()
    val pow = (number: Double) => number * number

    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(n => n.toDouble)
    val numbersPow = numbers.map(pow)
    val numbersPowPow = numbers.map(pow).map(pow)

    val numbersV = Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(n => n.toDouble)
    val numbersVPow = numbers.map(pow).toVector
    val numbersVPowPow = numbers.map(pow).map(pow).toVector

    ConsolerizerComposer.outSpace()
      .blue("This is the pow functional literal at work")
      .yellow(pow)
      .orange(numbers)
      .orange(numbersPow)
      .orange(numbersPowPow)
      .cyan()

    ConsolerizerComposer.outSpace()
      .blue("This is the pow functional literal at work for a vector. It looks the same")
      .yellow(pow)
      .orange(numbersV)
      .orange(numbersVPow)
      .orange(numbersVPowPow)
      .cyan()
  }
}
