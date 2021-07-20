package org.jesperancinha.scala.td.crums1.crum16

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum16 {

  def main(args: Array[String]): Unit = {

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 16 - yielding"))
      .reset()

    val ingredientsVector1 = Vector("Cumin", "Anis", "Sage", "Parsley", "Thyme")
    val ingredientsVector2 = Vector("Garlic", "Red Onion", "Onion", "Chives")

    val mix = for {
      x <- ingredientsVector1
      y <- ingredientsVector2
    } yield x + "-" + y


    ConsolerizerComposer.outSpace()
      .cyan("Using yield, we were able to mix the ingredients.")
      .magenta("Per vector 1 line, we checked all possibilities of vector2")
      .yellow("The mix result is")
      .orange(mix)
      .reset()
  }

}
