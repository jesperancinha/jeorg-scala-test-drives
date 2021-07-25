package org.jesperancinha.scala.td.crums1.crum1

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum1 {
  def main(array: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 1 - Scala just started!"))

    print("This is the print function")
    println("This is the println function")
    printf("%s", "This can also be done")
    println()

    val stamp = Stamp("Queen Elizabeth I", 10, 10)

    ConsolerizerComposer.outSpace()
      .magenta("We've created this stamp")
      .yellow(stamp)

    val note = new Note("Fernando Pessoa", 20, 10)

    ConsolerizerComposer.outSpace()
      .magenta("We've created this note")
      .yellow(note)

    ConsolerizerComposer.outSpace().none()
      .magenta("Without Case, we need to use the").yellow("new").magenta("keyword").newLine().reset()
  }
}
