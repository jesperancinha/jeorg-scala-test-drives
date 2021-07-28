package org.jesperancinha.scala3.td.crums1.crum6

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

trait ComedySortingPriority:
  given reverseOrdering: Ordering[String] = Ordering.String.reverse

  given reverseNumberOrdering: Ordering[Int] = Ordering.Int.reverse

object Crum6 extends ComedySortingPriority :

  given ordering: Ordering[String] = Ordering.String

  def main(args: Array[String]): Unit =
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 6 - given context priority"))
      .reset()

    val comedians = List("Conan O'Brian", "Jay Leno", "David Letterman")
    ConsolerizerComposer.out()
      .yellow(comedians)
      .orange(comedians.min)
      .orange(comedians.max)
      .reset()
    val numbers = List(1, 2, 3, 4, 5, 6, 7)
    ConsolerizerComposer.out()
      .yellow(numbers)
      .orange(numbers.min)
      .orange(numbers.max)
      .reset()

end Crum6