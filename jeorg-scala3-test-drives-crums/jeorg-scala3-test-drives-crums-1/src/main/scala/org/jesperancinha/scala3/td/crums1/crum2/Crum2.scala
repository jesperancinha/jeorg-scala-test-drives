package org.jesperancinha.scala3.td.crums1.crum2

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum2 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 2 - Nice enums"))

    DragonBallZ.values.foreach(character => {
      ConsolerizerComposer.outSpace().none()
        .yellow(character)
        .orange(character.charName)
        .newLine()
        .reset()
    })
  }
}

enum DragonBallZ(val charName: String):
  case SonGoku extends DragonBallZ("Song Goku")
  case Bulma extends DragonBallZ("Bulma")
  case Krillin extends DragonBallZ("Krillin")
  case Piccolo extends DragonBallZ("Piccolo")
  case SonGohan extends DragonBallZ("Son Gohan")
  case Vegeta extends DragonBallZ("Vegeta")
  case Bardock extends DragonBallZ("Bardock")
  case Trunks extends DragonBallZ("Trunks")
  case SonGoten extends DragonBallZ("Son Goten")
end DragonBallZ