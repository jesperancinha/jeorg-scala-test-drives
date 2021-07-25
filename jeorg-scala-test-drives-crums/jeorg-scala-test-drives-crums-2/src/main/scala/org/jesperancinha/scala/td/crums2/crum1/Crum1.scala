package org.jesperancinha.scala.td.crums2.crum1

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum1 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 1 - Traits for all"))

    def outputSomething(something: Something): Unit = {
      something match {
        case Car(doors, year, model) =>
          ConsolerizerComposer.outSpace().cyan(s"This car has $doors, it was made in $year and it is a model $model").reset()
        case Clothing(name) => ConsolerizerComposer.outSpace().cyan(s"You just bought some $name").reset()
        case Flower(name, height) => ConsolerizerComposer.outSpace.cyan(s"Your $name is $height meters tall").reset()
      }
    }

    val car = Car(4, 1987, "Whatever")
    val clothing = Clothing("Shirt")
    val flower = Flower("Rose", 4)
    val unexpected = Unexpected()

    outputSomething(car)
    outputSomething(clothing)
    outputSomething(flower)

    try {
      outputSomething(unexpected)
    } catch {
      case e: MatchError => ConsolerizerComposer.outSpace().yellow(e)
    }
  }
}
