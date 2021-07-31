package org.jesperancinha.scala3.td.crums1.crum10

import org.jesperancinha.console.consolerizer.common.ConsolerizerColor
import org.jesperancinha.console.consolerizer.console.{Consolerizer, ConsolerizerComposer}

import scala.util.{Failure, Success, Try, Using}

case class Message(text: String) extends AutoCloseable {
  def close(): Unit = ConsolerizerComposer.outSpace().red(s"message $text has been sent!").reset()
}

object Crum10 {

  def main(args: Array[String]): Unit = {

    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 10 - Using and Either"))
      .reset()

    val motto: String = "One apple a day keeps the doctor away"
    val imagination = false
    val triedComposer: Either[String, Throwable] = Using(Message(motto)) {
      m =>
        ConsolerizerComposer.out()
          .magenta("I said")
          .blue(m)
          .green("But I still had to go to the doctor!")
          .reset()
        if (imagination) {
          throw RuntimeException()
        }
        "Go to the doctor!"
    } match {
      case Success(value) =>
        ConsolerizerComposer.outSpace().black().bgOrange(value).reset()
        Left(value)
      case Failure(exception) =>
        ConsolerizerColor.RED.printThrowableAndExit(exception)
        Right(exception)
    }

    ConsolerizerComposer.out()
      .orange("This is our Either")
      .yellow(triedComposer)
      .reset()

  }

}
