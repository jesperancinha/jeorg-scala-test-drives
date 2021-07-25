package org.jesperancinha.scala.td.crums1.crum20

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum20 {
  def main(args: Array[String]): Unit = {
    def whereDoWeMeetF: String = {
      ConsolerizerComposer.out()
        .magenta("You just called a definition")
        .reset()
      "halfway"
    }

    val whereDoWeMeetV = "halfway"

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 20- - method definition /  function definition vs value definiton"))
      .reset()


    ConsolerizerComposer.outSpace()
      .red(whereDoWeMeetF)
      .blue("No need for parentheses. Like a variable! But not quite as such...")
      .orange(whereDoWeMeetV)
      .reset()
  }

}
