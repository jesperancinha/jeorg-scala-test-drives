package org.jesperancinha.scala.td.crums2.crum11

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum11 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 11 - For loop tricks"))
      .reset()

    val number = List(1, 3, 7, 14, 17, 23, 29, 30, 54, 67, 79, 89)

    val circumference1 = for {
      x <- number
    } yield 2 * Math.PI * x

    val circumference2 = number.map(x => 2 * Math.PI * x)

    ConsolerizerComposer.outSpace()
      .blue("Circumference I")
      .red(circumference1)
      .blue("Circumference II")
      .red(circumference2)
      .reset()
  }
}
