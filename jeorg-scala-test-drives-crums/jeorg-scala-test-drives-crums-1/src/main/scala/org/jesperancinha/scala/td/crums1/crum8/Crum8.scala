package org.jesperancinha.scala.td.crums1.crum8

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum8 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 8 - Adding elements to a sequence"))
      .reset()

    val plants = Seq("Orchidea", "Bonsai", "Peppers", "Mint", "Strawberry")

    ConsolerizerComposer.outSpace()
      .green(plants)

    ConsolerizerComposer.outSpace()
      .green(plants :+ "Sanseviera")

    ConsolerizerComposer.outSpace()
      .green("Yuccas" +: plants :+ "Sanseviera")

  }
}
