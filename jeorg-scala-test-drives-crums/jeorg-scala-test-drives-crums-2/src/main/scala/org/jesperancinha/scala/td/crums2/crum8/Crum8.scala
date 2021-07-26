package org.jesperancinha.scala.td.crums2.crum8

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum8 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 8 - immutable vs mutable collections in Scala"))
      .reset()

    val mutableBitSet = scala.collection.mutable.BitSet(2, 1, 2, 1, 2, 3, 2, 1, 5, 3, 2, 3, 5, 7, 3, 3)

    val immutableBitSet = scala.collection.immutable.BitSet(2, 1, 2, 1, 2, 3, 2, 1, 5, 3, 2, 3, 5, 7, 3, 3)

    ConsolerizerComposer.outSpace()
      .yellow("We have these two sets")
      .orange(mutableBitSet)
      .orange(immutableBitSet)
      .reset()


    mutableBitSet.add(9)
    val stringBuilder = immutableBitSet.addString(new StringBuilder("We can't change this set"))

    ConsolerizerComposer.outSpace()
      .yellow("We now have these two sets")
      .orange(mutableBitSet)
      .orange(stringBuilder)
      .reset()

    val emptyNumbers = List.empty[Int]

    ConsolerizerComposer.outSpace()
      .magenta(s"This is an empty Int list=>$emptyNumbers")
      .reset()
  }
}
