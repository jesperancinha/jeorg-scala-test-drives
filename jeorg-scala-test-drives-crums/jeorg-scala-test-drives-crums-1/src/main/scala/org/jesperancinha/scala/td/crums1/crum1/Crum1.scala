package org.jesperancinha.scala.td.crums1.crum1

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum1 {
  def main(array: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 1 - Scala just started!"))

    print("This is the print function")
    println("This is the println function")
    printf("%s", "This can also be done")

  }
}
