package org.jesperancinha.scala.td.crums1.crum9

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum9 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 9 - Adding elements to a Set"))
      .reset()

    val plansts = Set("Orchidea", "Bonsai", "Peppers", "Mint", "Strawberry")

    ConsolerizerComposer.outSpace()
      .green(plansts)

    ConsolerizerComposer.outSpace()
      .green(plansts + "Sanseviera")

    ConsolerizerComposer.outSpace()
      .green("Yuccas" + plansts + "Sanseviera")

    ConsolerizerComposer.outSpace()
      .green("Yuccas" + (plansts + "Sanseviera"))
      .reset()
  }
}
