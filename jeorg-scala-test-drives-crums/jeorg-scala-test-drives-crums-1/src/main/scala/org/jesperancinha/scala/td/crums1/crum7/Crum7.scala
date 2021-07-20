package org.jesperancinha.scala.td.crums1.crum7

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum7 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 7 - Creating a modified copy"))

    val oil1 = Oil("Olive oil", 1000, "Italia")
    val oil2 = oil1.copy(origin = "Portugal")

    ConsolerizerComposer.outSpace().none()
      .cyan("We created this oil").yellow(oil1).newLine()
      .cyan("And we've changed its label").yellow(oil2).newLine()
      .magenta("This was all done with a simple copy, where we select the properties we want to be different while making the copy").newLine()
      .reset()

  }

  case class Oil(kind: String, volumeMl: Int, origin: String)
}
