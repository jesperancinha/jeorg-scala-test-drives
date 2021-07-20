package org.jesperancinha.scala.td.crums1.crum15

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum15 {
  def main(args: Array[String]): Unit = {

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 15 - flatMap"))
      .reset()

    val saying1 = "The quick brown fox jumps over the lazy dog"
    val saying2 = "The five boxing wizards jump quickly"

    val allwords = Set(saying1, saying2).flatMap(_.split(" "))

    ConsolerizerComposer.outSpace()
      .orange("We get all words from sentences")
      .red(saying1)
      .red(saying2)
      .blue("All words are")
      .green(allwords)
      .magenta("https://en.wikipedia.org/wiki/Pangram")
      .reset()

    ConsolerizerComposer.outSpace()
      .orange("We can also get all the chars")
      .red(saying1)
      .red(saying2)
      .blue("All chars are")
      .green((saying1 + " " + saying2).split(" ").flatten.map("-"+_).toSet)
      .magenta("https://en.wikipedia.org/wiki/Pangram")
      .reset()
  }
}
