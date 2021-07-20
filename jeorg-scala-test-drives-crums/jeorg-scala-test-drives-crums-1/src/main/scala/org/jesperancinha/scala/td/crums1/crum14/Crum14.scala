package org.jesperancinha.scala.td.crums1.crum14

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum14 {
  def main(args: Array[String]): Unit = {

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 14 - Special Function Literals"))
      .reset()


    val a = 1000
    val b = 2000

    val max = Math.max(a, b)

    val d: (Int, Int) => Int = Math.max

    val max2 = d(a, b)

    val list = List(a, b)

    val ints = list.map(d(_, 1500))


    ConsolerizerComposer.outSpace()
      .green(s"We have numbers $a and $b")
      .yellow(s"We calculated the max using Math.max(a,b)")
      .green(max.toString)
      .yellow(s"We then created d=$d. With this function we also created the max")
      .green(max2.toString)
      .yellow("When we create the map, if we use _ anywhere, our declaration becomes immediately a lambda")
      .green(ints)
      .reset()
  }
}
