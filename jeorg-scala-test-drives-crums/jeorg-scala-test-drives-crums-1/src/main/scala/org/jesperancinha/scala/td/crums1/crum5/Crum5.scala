package org.jesperancinha.scala.td.crums1.crum5

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

import java.time.{LocalDate => LD, LocalDateTime => LDT}

object Crum5 {
  def main(args: Array[String]): Unit = {

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 5 - Importing using aliases"))

    val a = LD.now()
    val b = LDT.now()

    ConsolerizerComposer.outSpace().none()
      .cyan("LD").yellow("is being used as").cyan("LocalDate").yellow("and has value").cyan(a).newLine()
      .cyan("LDT").yellow("is being used as").cyan("LocalDateTime").yellow("and has value").cyan(b).newLine()
      .reset()
  }
}
