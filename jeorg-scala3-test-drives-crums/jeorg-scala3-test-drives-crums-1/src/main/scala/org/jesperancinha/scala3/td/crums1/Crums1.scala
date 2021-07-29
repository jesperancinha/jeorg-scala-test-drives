package org.jesperancinha.scala3.td.crums1

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer
import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer.title
import org.jesperancinha.scala3.td.crums1.crum1.Crum1
import org.jesperancinha.scala3.td.crums1.crum2.Crum2
import org.jesperancinha.scala3.td.crums1.crum3.Crum3
import org.jesperancinha.scala3.td.crums1.crum4.Crum4
import org.jesperancinha.scala3.td.crums1.crum5.Crum5
import org.jesperancinha.scala3.td.crums1.crum6.Crum6
import org.jesperancinha.scala3.td.crums1.crum7.Crum7

object Crums1 {
  def main(args: Array[String]): Unit =
    ConsolerizerComposer.out()
      .red(title("We are starting our Scala3 Crums!"))
      .orange("But first, a word from our Sponsors -> Just Code!!")
      .red("Scala is cool, but first, let's head to the beach and be lekker lazy!!! 🏖🌊🐚")
      .reset()
    Crum1.main(args)
    Crum2.main(args)
    Crum3.main(args)
    Crum4.main(args)
    Crum5.main(args)
    Crum6.main(args)
    Crum7.main(args)
  end main
}
