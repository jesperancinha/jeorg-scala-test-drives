package org.jesperancinha.scala.td.crums1.crum10

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum10 {
  def main(args: Array[String]): Unit ={
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 10 - Multiple element tuples"))
      .reset()

    val tuple = Tuple10("red", "green", "blue", "purple","green","black","yellow","white","pink","cyan")

    ConsolerizerComposer.outSpace()
      .magenta(tuple)
      .magenta("Element at 5 is")
      .rainbow(100)
      .brightWhite(tuple._5)
      .reset()
  }
}
