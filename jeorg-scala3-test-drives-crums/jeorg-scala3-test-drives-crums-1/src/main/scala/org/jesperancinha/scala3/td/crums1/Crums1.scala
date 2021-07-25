package org.jesperancinha.scala3.td.crums1

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer
import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer.title
import org.jesperancinha.scala3.td.crums1.crum1.Crum1

object Crums1 {
  def main(args: Array[String]): Unit =
    ConsolerizerComposer.out()
      .red(title("We are starting our Scala3 Crums!"))
      .orange("But first, a word from our Sponsors -> Just Code!!")
      .red("Scala is cool, but first, let's head to the beach and be lekker lazy!!! 🏖🌊🐚")
      .reset()
    Crum1.main(args)
  end main
}
