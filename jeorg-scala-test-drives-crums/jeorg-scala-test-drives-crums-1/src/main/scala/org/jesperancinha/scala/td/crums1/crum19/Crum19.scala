package org.jesperancinha.scala.td.crums1.crum19

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum19 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 19 - Making functions"))
      .reset()


    hearTheDogBark()
//    hearTheCatMeeouw()
  }


  def hearTheDogBark(): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan("The dog has barked!")
  }

  // Scala 3
//  def hearTheCatMeeouw(): Unit =
//    ConsolerizerComposer.outSpace()
//      .cyan("The cat has miauwed!")
//      .reset()
//  end hearTheCatMeeouw
}
