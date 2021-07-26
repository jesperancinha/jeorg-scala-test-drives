package org.jesperancinha.scala.td.crums2.crum4

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum4 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 4 - Tricks with Int lists"))
      .reset()

    val listA = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    ConsolerizerComposer.outSpace()
      .cyan("We can make all sorts of calculations using a list")
      .red("Sum of all")
      .orange(listA.sum.toString)
      .red("Max of all")
      .orange(listA.max.toString)
      .red("Min of all")
      .orange(listA.min.toString)
      .red("Average of all")
      .orange((listA.sum / listA.size).toString)
      .reset()
  }
}
