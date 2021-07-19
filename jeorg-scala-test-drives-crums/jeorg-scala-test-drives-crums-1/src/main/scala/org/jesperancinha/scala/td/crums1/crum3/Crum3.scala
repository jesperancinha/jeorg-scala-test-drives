package org.jesperancinha.scala.td.crums1.crum3

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum3 {

  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 3 - multiple constuctors"))

    val emerald = Jewel("Emerald", 20)
    val amethist = new Jewel("Amethist")
    val diamond = new Jewel()
    ConsolerizerComposer.outSpace().none()
      .magenta("This is a stone").brightGreen(emerald).magenta(", we have").brightGreen(emerald.quantity.toString).magenta("of them.").newLine()
      .magenta("This is another stone").brightMagenta(amethist).magenta(", we have").brightMagenta(amethist.quantity.toString).magenta("of them.").newLine()
      .magenta("And this is the big one!").brightWhite(diamond).magenta(", we have").brightWhite(diamond.quantity.toString).magenta("of them.").newLine()
      .reset()
  }

  case class Jewel(val stone: String, val quantity: Long) {
    def this(stone: String) {
      this(stone, 10L)
    }

    def this() {
      this("Diamond, 10L")
    }
  }
}
