package org.jesperancinha.scala.td.crums2.crum7

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum7 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 7 - Matching list elements"))
      .reset()

    val drinks = List("Martini", "Malibu", "Red Wine", "Gin Tonic")

    drinks match {
      case first :: second :: third :: fourth =>
        assert(first == "Martini")
        assert(second == "Malibu")
        ConsolerizerComposer.out().blue("Our first two drinks are")
          .cyan(first)
          .cyan(second)
          .reset()
    }

    drinks match {
      case first :: tail =>
        assert(first == "Martini")
        assert(tail.size == 3)
        ConsolerizerComposer.out().blue("We get a")
          .cyan(first)
          .blue(s"And we still get ${tail.size} drinks!")
          .reset()
    }
  }
}
