package org.jesperancinha.scala.td.crums1.crum11

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum11 {
  def main(args:Array[String]): Unit ={
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 11 - Creating maps in scala"))
      .reset()

    val flowers = Map("green"-> "beans","pink"->"rose","red"->"strawberries")

    val flowers2 = Map.apply("green"-> "beans","pink"->"rose","red"->"strawberries")

    ConsolerizerComposer.outSpace()
      .red("We do not create maps with =>")
      .green("We can create flowers without apply")
      .blue(flowers)
      .green("Or we can create with it")
      .blue(flowers2)
      .reset()
  }
}
