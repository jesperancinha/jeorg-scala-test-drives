package org.jesperancinha.scala.td.crums1

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer
import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer.title
import org.jesperancinha.scala.td.crums1.crum1.Crum1
import org.jesperancinha.scala.td.crums1.crum10.Crum10
import org.jesperancinha.scala.td.crums1.crum11.Crum11
import org.jesperancinha.scala.td.crums1.crum12.Crum12
import org.jesperancinha.scala.td.crums1.crum13.Crum13
import org.jesperancinha.scala.td.crums1.crum14.Crum14
import org.jesperancinha.scala.td.crums1.crum15.Crum15
import org.jesperancinha.scala.td.crums1.crum16.Crum16
import org.jesperancinha.scala.td.crums1.crum2.Crum2
import org.jesperancinha.scala.td.crums1.crum3.Crum3
import org.jesperancinha.scala.td.crums1.crum4.Crum4
import org.jesperancinha.scala.td.crums1.crum5.Crum5
import org.jesperancinha.scala.td.crums1.crum6.Crum6
import org.jesperancinha.scala.td.crums1.crum7.Crum7
import org.jesperancinha.scala.td.crums1.crum8.Crum8
import org.jesperancinha.scala.td.crums1.crum9.Crum9

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
    Crum4.main(args)
    Crum5.main(args)
    Crum6.main(args)
    Crum7.main(args)
    Crum8.main(args)
    Crum9.main(args)
    Crum10.main(args)
    Crum11.main(args)
    Crum12.main(args)
    Crum13.main(args)
    Crum14.main(args)
    Crum15.main(args)
    Crum16.main(args)
  }
}
