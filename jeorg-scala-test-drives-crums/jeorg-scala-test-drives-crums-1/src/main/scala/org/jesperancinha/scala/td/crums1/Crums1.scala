package org.jesperancinha.scala.td.crums1

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer
import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer.title
import org.jesperancinha.scala.td.crums1.crum1.Crum1
import org.jesperancinha.scala.td.crums1.crum2.Crum2
import org.jesperancinha.scala.td.crums1.crum3.Crum3

object Crums1 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.out()
      .red(title("We are starting our Scala Crums!"))
      .orange("But first, a word from our Sponsors -> Just Code!!")
      .red("Scala is cool, but first, let's head to the beach and be lekker lazy!!! 🏖🌊🐚")
      .reset()

    ConsolerizerComposer.out()
      .blue("Now that we are back, let's get calvinistic!")
      .reset()

    Crum1.main(args)
    Crum2.main(args)
    Crum3.main(args)
  }
}
