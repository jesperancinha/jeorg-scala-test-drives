package org.jesperancinha.scala.td.akka1

import akka.actor.typed._
import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}

object SupervisingActor {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new SupervisingActor(context))
}

class SupervisingActor(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  private val child = context.spawn(
    Behaviors.supervise(SupervisedActor()).onFailure(SupervisorStrategy.restart),
    name = "supervised-actor")

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "failChild" =>
        child ! "fail"
        this
    }
}

object SupervisedActor {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new SupervisedActor(context))
}

class SupervisedActor(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  println("supervised actor started")

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "fail" =>
        println("supervised actor fails now")
        throw new Exception("I failed!")
    }

  override def onSignal: PartialFunction[Signal, Behavior[String]] = {
    case PreRestart =>
      println("supervised actor will be restarted")
      this
    case PostStop =>
      println("supervised actor stopped")
      this
  }

}


object MainActorFailHandling {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new MainActorFailHandling(context))

}

/**
 * The actor MainActorFailHandling listens to a message. If the right message comes in ("start") then it spawns a new actor PrintMyActorRefActor.
 *
 * @param context
 */
class MainActorFailHandling(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  override def onMessage(msg: String): Behavior[String] = {
    val supervisingActor = context.spawn(SupervisingActor(), "supervising-actor")
    supervisingActor ! "failChild"
    this
  }
}

object ActorFailHandling extends App {
  val testSystem = ActorSystem(MainActorFailHandling(), "testSystem")

  /**
   * The ! is not a NOT. This means sending a message to the Actor
   */
  testSystem ! "start"
}
