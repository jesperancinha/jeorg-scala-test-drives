package org.jesperancinha.scala.td.akka3

import akka.actor.typed.ActorRef

sealed trait Command

final case class RecordTemperature(requestId: Long, value: Double, replyTo: ActorRef[TemperatureRecorded]) extends Command

final case class TemperatureRecorded(requestId: Long)
