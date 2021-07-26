package org.jesperancinha.scala.td.crums2.crum10

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum10 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 10 - reduce, foldLeft, foldRight, sum"))
      .reset()

    val numbers = List(11, 22, 33, 44, 55, 66, 77, 88, 99)

    val sumGood = numbers.sum
    val sumFoldLeft = numbers.foldLeft(0)((acc, value) => acc + value)
    val sumReduce = numbers.reduce((acc1, acc2) => acc1 + acc2)
    val sumFoldRight = numbers.foldRight(0)((acc, value) => acc + value)

    ConsolerizerComposer.outSpace()
      .cyan("With these 4 different calculations, we reach the same value")
      .magenta(sumGood.toString)
      .magenta(sumFoldLeft.toString)
      .magenta(sumReduce.toString)
      .magenta(sumFoldRight.toString)
      .reset()

    ConsolerizerComposer.outSpace()
      .cyan(numbers ++ numbers)
      .cyan(numbers :: numbers)
      .cyan(100100 :: numbers)
      .cyan(11 +: 12 +: 13 +: numbers)
      .cyan(11 +: 12 +: 13 +: numbers :+ 21 :+ 22 :+ 23 +: numbers :+ 31 :+ numbers)
      .reset()
  }
}
