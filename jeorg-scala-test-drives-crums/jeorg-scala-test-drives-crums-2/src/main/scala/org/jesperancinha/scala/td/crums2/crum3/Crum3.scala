package org.jesperancinha.scala.td.crums2.crum3

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum3 {
  def main(args: Array[String]): Unit = {

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 3 - Tricks with String lists"))
      .reset()

    val listA = List("Luback - Magnus", "Corine Nijenhuis - Luchtcowboy", "Alan Downs - The Velvet Rage", "Paulien Cornelisse - De verwarde Cavia")

    val builder = listA.addString(new StringBuilder("Eckart - Eckart's Notes"))

    ConsolerizerComposer.outSpace()
      .magenta("Interesting:")
      .cyan(builder)
      .reset()
    ConsolerizerComposer.outSpace()
      .magenta("We have this list")
      .lightGrey(listA)
      .blue("We'll play with it")
      .green("Order")
      .red(listA.sorted)
      .orange(listA.sortBy(s => s.last))
      .brightRed(listA.toSet)
      .brightRed(listA :+ "Paulo Coelho - Brida")
      .orange(listA)
      .reset()
  }
}
