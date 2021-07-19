package org.jesperancinha.scala.td.akka2

import akka.actor.typed.ActorRef

sealed trait Command

final case class ReadTemperature(requestId: Long, replyTo: ActorRef[RespondTemperature]) extends Command

final case class RespondTemperature(requestId: Long, value: Option[Double])
