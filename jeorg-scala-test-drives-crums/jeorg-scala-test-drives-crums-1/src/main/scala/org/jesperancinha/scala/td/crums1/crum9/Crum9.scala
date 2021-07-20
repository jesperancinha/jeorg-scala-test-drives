package org.jesperancinha.scala.td.crums1.crum9

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum9 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 9 - Adding elements to a Set"))
      .reset()

    val plants = Set("Orchidea", "Bonsai", "Peppers", "Mint", "Strawberry")

    ConsolerizerComposer.outSpace()
      .green(plants)

    ConsolerizerComposer.outSpace()
      .green(plants + "Sanseviera")

    ConsolerizerComposer.outSpace()
      .green("Yuccas" + plants + "Sanseviera")

    ConsolerizerComposer.outSpace()
      .green("Yuccas" + (plants + "Sanseviera"))
      .reset()
  }
}
