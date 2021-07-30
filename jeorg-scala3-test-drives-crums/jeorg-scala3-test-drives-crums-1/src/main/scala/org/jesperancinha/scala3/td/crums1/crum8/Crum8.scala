package org.jesperancinha.scala3.td.crums1.crum8

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.language.postfixOps
import scala.util.{Failure, Success, Try}
import concurrent.duration.DurationInt

object Crum8 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 8 - Future"))
      .reset()

    val result = futurePow(4, 2)
    val startTimestampMs = System.currentTimeMillis()
    val value = Try(Await.result(result, 1 seconds)) match {
      case Success(extractedVal) => extractedVal
      case Failure(_) => 0
    }
    val endTimestamMs = System.currentTimeMillis()

    ConsolerizerComposer.outSpace()
      .magenta(s"This operation took ${endTimestamMs - startTimestampMs} ms")
      .orange(s"The result is $value")
      .reset()
  }

  def futurePow(n: Int, exp: Int): Future[Int] = Future(n).map(n => {
    Thread.sleep(500)
    Math.pow(n.toDouble, exp.toDouble).toInt
  })

}
