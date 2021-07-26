package org.jesperancinha.scala.td.crums2.crum9

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum9 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 9 - Creating maps in scala"))
      .reset()

    val vegetables1 = Map("courgette" -> 10) + "lettuce" -> 24
    val vegetables2 = (Map("courgette" -> 10).toString() + "lettuce") -> 24

    ConsolerizerComposer.outSpace()
      .green("These are our vegetables")
      .brightGreen(vegetables1)
      .reset()

    vegetables1 match {
      case (key, value) =>
        ConsolerizerComposer.outSpace()
          .yellow(key).orange(value.toString).reset()
    }

    ConsolerizerComposer.outSpace()
      .green("The reason why there is a string is more visible when looking at how vegetables 2 is build")
      .brightGreen(vegetables2)
      .reset()


    val vegetables3 = Map("courgette" -> 10) + ("lettuce" -> 24)
    vegetables3.foreach {
      case veg@(_, quantity) => ConsolerizerComposer.outSpace()
        .orange(s"We have $quantity kg of $veg")
        .reset()
    }

    val vegetableBasket1 = Map("cabbage" -> 10) + ("carrot" -> 20) + ("potato" -> 30)
    val vegetableBasket2 = Map("cabbage" -> 10) + ("potato" -> 30) + ("carrot" -> 20)
    val vegetableBasket3 = Map("cabbage" -> 10, "potato" -> 30, "carrot" -> 20)
    val vegetableBasket4 = Map.empty[String, Int] + ("cabbage" -> 10) + ("carrot" -> 20) + ("potato" -> 30)

    ConsolerizerComposer.outSpace()
      .bgMagenta("These are all identical baskets")
      .black()
      .reset()
      .magenta(vegetableBasket1)
      .magenta(vegetableBasket2)
      .magenta(vegetableBasket3)
      .magenta(vegetableBasket4)
      .reset()
  }

}
