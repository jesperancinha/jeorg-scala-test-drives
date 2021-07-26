package org.jesperancinha.scala.td.crums2.crum6

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum6 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 6 - Composing lists"))
      .reset()

    val eatingUtensils = List(Cutlery("Spoons"), Cutlery("Forks"), Cutlery("Knives"))

    ConsolerizerComposer.out()
      .cyan("This is our list")
      .blue(eatingUtensils)
      .reset()

    val eatingUtensilsPlusBreakfast = eatingUtensils ++ List(Cutlery("Small spoon"))

    ConsolerizerComposer.out()
      .cyan("This is our list with breakfast")
      .blue(eatingUtensilsPlusBreakfast)
      .reset()

    eatingUtensilsPlusBreakfast.head.name="Wine glass"

    ConsolerizerComposer.out()
      .cyan("We didn't change the list, but instead we changed the first element")
      .blue(eatingUtensilsPlusBreakfast)
      .cyan("Since our list is composed of two, our initial list also has this change reflected")
      .cyan("It happens because it shares the same object")
      .blue(eatingUtensils)
      .reset()

    assert(eatingUtensils.head == eatingUtensilsPlusBreakfast.head)
  }
}
