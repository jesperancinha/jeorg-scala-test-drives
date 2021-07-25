package org.jesperancinha.scala.td.crums2.crum2

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer


object Crum2 {

  def main(args: Array[String]): Unit = {

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 2 - Making enums in Scala"))

    ConsolerizerComposer.outSpace()
      .green(DragonBall.values.size.toString)
    DragonBall.values foreach (character => {
      ConsolerizerComposer.outSpace()
        .cyan(character)
        .reset()
    })


    val list: List[DragonBallZ] = DragonBallZ.values.toList
    ConsolerizerComposer.outSpace()
      .magenta(list.size.toString)
    list foreach (character => {
      ConsolerizerComposer.outSpace().none()
        .cyan(character).blue(character.charName)
        .newLine()
        .reset()
    })

  }
}
