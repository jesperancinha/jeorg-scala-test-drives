package org.jesperancinha.scala.td.crums1.crum2

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

case object Crum2 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 2 - operators and code blocks"))

    val village = "people"
    val total = if (village == "people") 1000 else 0
    val totalDistance = {
      val distanceFromNYToAustin = 2800
      val distanceFromAustoToSanFrancico = 2820
      distanceFromNYToAustin + distanceFromAustoToSanFrancico
    }

    ConsolerizerComposer.outSpace().none()
      .cyan("We are going to see the village").green(village).newLine()
      .cyan("Because of that, it costs").green(total.toString).cyan("dollars!").newLine()
      .cyan("We drive from New York, making a stop in Austin, a distance of").green(totalDistance.toString).cyan("kilometers!").newLine()
      .cyan("Made using the help of https://www.distance.to/").newLine().reset()

  }
}
