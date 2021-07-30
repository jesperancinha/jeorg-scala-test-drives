package org.jesperancinha.scala3.td.crums1.crum9

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.{Duration, DurationInt}
import scala.concurrent.{Await, Future}
import scala.language.postfixOps
import scala.util.{Failure, Success, Try}

object Crum9 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 9 - Concurrent blocking"))
      .reset()

    val startTimestampMs = System.currentTimeMillis()


    val f1 = Future {
      concurrent.blocking {
        Thread.sleep(250)
      }
      concurrent.blocking {
        Thread.sleep(250)
      }
      Thread.sleep(250)
    }
    val f2 = Future {
      concurrent.blocking {
        Thread.sleep(250)
      }
      concurrent.blocking {
        Thread.sleep(250)
      }
      Thread.sleep(250)
    }
    val v1 = Try(Await.result(
      f1, 1 seconds)) match {
      case Success(extractedVal) => 1
      case Failure(_) => 0
    }
    val v2 = Try(Await.result(
      f2, 1 seconds)) match {
      case Success(extractedVal) => 1
      case Failure(_) => 0
    }
    val endTimestamMs = System.currentTimeMillis()

    ConsolerizerComposer.out()
      .magenta(s"The blocking operations took ${endTimestamMs - startTimestampMs} ms!")
      .orange(s"result1=$v1 result2=$v2")
      .reset()
  }
}
