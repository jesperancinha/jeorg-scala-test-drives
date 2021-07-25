package org.jesperancinha.scala3.td.crums1.crum1

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum1 {
  def main(array: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 1 - Scala3 just started!"))

    hearTheDogBark()
    hearTheCatMeeouw()
  }


  def hearTheDogBark(): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan("The dog has barked!")
  }

  // Scala 3
  def hearTheCatMeeouw(): Unit =
    ConsolerizerComposer.outSpace()
      .cyan("The cat has miauwed!")
      .reset()
  end hearTheCatMeeouw
}
