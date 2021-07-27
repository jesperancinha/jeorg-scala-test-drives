package org.jesperancinha.scala3.td.crums1.crum4

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

trait StringExtensions:
  extension (str: String) def countNs: Long = str.count(c => c == 'n')

object Crum4 extends StringExtensions :

  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 4 - extension methods"))
      .reset()

    val testString = "Somebody told me that you gave an excellent insight but you didn't got through because of reasons"

    ConsolerizerComposer
      .out()
      .cyan(s"This sentence has ${testString.countNs} n's")
      .reset()
  }

end Crum4
