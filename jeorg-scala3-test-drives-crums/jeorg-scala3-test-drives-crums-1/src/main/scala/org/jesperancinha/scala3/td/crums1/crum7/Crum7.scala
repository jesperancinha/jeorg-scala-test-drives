package org.jesperancinha.scala3.td.crums1.crum7

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum7 {

  trait T

  given loop(using t: T): T = {
    ConsolerizerComposer.outSpace()
      .magenta("Ave Maria")
      .reset()
    t
  }

  implicit val t:T = new T {
    ConsolerizerComposer.outSpace()
      .magenta("Maria")
      .reset()
  }

  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 7 - Summon the given"))
      .reset()

    val it = summon[T]

    loop
  }
}
