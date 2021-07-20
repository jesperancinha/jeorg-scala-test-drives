package org.jesperancinha.scala.td.crums1.crum12

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum12 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 12 - Safely retrieve values from a map"))
      .reset()

    val cities = Map("Olhao" -> "Portugal", "Velp" -> "Netherlands", "Oviedo" -> "Spain")

    ConsolerizerComposer.outSpace()
      .green("We start out with all our city map")
      .magenta(cities)
      .reset()

    ConsolerizerComposer.outSpace()
      .magenta("We know that New York is not on the map and so to get it we do")
      .green(cities.get("New York"))
      .magenta("Another safe way to do it would have been")
      .green(cities.getOrElse("New York", "USA"))
      .reset()
  }
}
