package org.jesperancinha.scala.td.crums1.crum18

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum18 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 18 - Not very obvious types"))
      .reset()
    try {
      val i = 1000 / 0
      ConsolerizerComposer.outSpace().none()
        .magenta("The value of 1000/0 is (This will never happen...").brightMagenta(i toString)
        .newLine()
        .reset()
    } catch {
      case e: ArithmeticException => ConsolerizerComposer.outSpace()
        .magenta("The result of 1000/0 is an exception").yellow(e).reset()
    }
  }

}
