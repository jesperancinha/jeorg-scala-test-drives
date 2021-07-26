package org.jesperancinha.scala.td.crums2.crum5

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum5 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 5 - Option, Some, None"))
      .reset()

    val partyChecker = (party: Option[String]) => {
      party match {
        case Some(p) =>
          ConsolerizerComposer.outSpace().cyan("This party is").blue(p).reset()
          party match {
            case Some(p) if p == "It's my party"=> ConsolerizerComposer.outSpace().brightMagenta("MINE!")
            case Some(p) if p == "It's their party"=> ConsolerizerComposer.outSpace().brightMagenta("THEIRS!")
            case _ => ConsolerizerComposer.outSpace().brightRed("I don't know this!")
          }
        case None => ConsolerizerComposer.outSpace().cyan("No party").reset()
      }
    }

    val myParty = "It's my party"

    val optionMyParty = Option(myParty)

    val theirParty = "It's their party"

    val optionTheirParty = Option(theirParty)

    partyChecker(optionMyParty)
    partyChecker(optionTheirParty)
    partyChecker(None)
    partyChecker(Option("Whasup!!"))
    partyChecker.apply(None)
  }
}
