package org.jesperancinha.scala.td.crums1.crum4

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum4 {

  def main(args:Array[String]): Unit ={
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 4 - Unary operators"))

    ConsolerizerComposer.outSpace().none()
      .blue("Prefix !true").brightBlue((!true).toString).blue("can be unary true.unary_!").brightBlue(true.unary_!.toString).newLine()
      .blue("Prefix -123").brightBlue((-123).toString).blue("can be unary 123.unary_-").brightBlue((123.unary_-).toString).newLine()
      .reset()
  }

}
