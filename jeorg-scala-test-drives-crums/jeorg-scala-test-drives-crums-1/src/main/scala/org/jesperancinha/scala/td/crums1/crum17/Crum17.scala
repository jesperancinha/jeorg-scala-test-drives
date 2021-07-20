package org.jesperancinha.scala.td.crums1.crum17

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum17 {
  def main(args: Array[String]): Unit = {

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 17 - Option"))
      .reset()

    val song = Option("La da dee")

    val textToSay = song match {
      case Some(value) => s"The song is $value"
      case None => "There is no song"
    }

    ConsolerizerComposer.outSpace()
      .cyan(s"We've picked up song $song")
      .magenta(s"And have this comment: $textToSay")
      .reset()
  }

}
