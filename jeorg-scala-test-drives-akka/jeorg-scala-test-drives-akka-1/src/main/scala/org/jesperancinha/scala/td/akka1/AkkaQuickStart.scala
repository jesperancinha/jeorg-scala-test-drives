//#full-example
package org.jesperancinha.scala.td.akka1

import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.actor.typed.scaladsl.Behaviors
import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer
import org.jesperancinha.scala.td.akka1.GreeterMain.SayHello

//#greeter-actor
object Greeter {
  final case class Greet(whom: String, replyTo: ActorRef[Greeted])

  final case class Greeted(whom: String, from: ActorRef[Greet])

  def apply(): Behavior[Greet] = Behaviors.receive { (context, message) =>
    context.log.info("Hello {}!", message.whom)
    //#greeter-send-messages
    ConsolerizerComposer.outSpace()
      .blue(s"It is important understand what is context.self = ${context.self}")
      .magenta(s"But in this case we try to send a message to ${message.replyTo}")
      .reset()
    message.replyTo ! Greeted(message.whom, context.self)
    //#greeter-send-messages
    Behaviors.same
  }
}
//#greeter-actor

//#greeter-bot
object GreeterBot {

  def apply(max: Int): Behavior[Greeter.Greeted] = {
    bot(0, max)
  }

  private def bot(greetingCounter: Int, max: Int): Behavior[Greeter.Greeted] =
    Behaviors.receive { (context, message) =>
      val n = greetingCounter + 1
      context.log.info("Greeting {} for {}", n, message.whom)
      if (n == max) {
        ConsolerizerComposer.outSpace()
          .green(s"We have created a maximum of $n bot actors. They will all graciously shutdown along with all child processes")
          .reset()
        Behaviors.stopped
      } else {
        val greet = Greeter.Greet(message.whom, context.self)
        ConsolerizerComposer.outSpace()
          .blue(s"Since we are still allowed to creat more bots, we send another greeting to the greeter actor: ${message.from}.")
          .yellow(s"The message is $greet")
        message.from ! greet
        bot(n, max)
      }
    }
}
//#greeter-bot

//#greeter-main
object GreeterMain {

  final case class SayHello(name: String)

  def apply(): Behavior[SayHello] =
    Behaviors.setup { context =>
      //#create-actors
      val greeter = context.spawn(Greeter(), "greeter")
      //#create-actors
      println(s"Spawned greeter actor: $greeter")
      ConsolerizerComposer
        .outSpace().blue(s"We have created a greeter actor: $greeter")
        .reset()
      Behaviors.receiveMessage { message =>
        ConsolerizerComposer
          .outSpace().magenta(s"We just received message $message")
          .reset()

        //#create-actors
        val replyTo = context.spawn(GreeterBot(max = 3), message.name)
        println(s"Spawned greeter bot actor: $replyTo")
        ConsolerizerComposer
          .outSpace().blue(s"We have created a reply actor: $replyTo")
          .magenta(s"We create this actor from our greeter actor: $greeter")
          .blue(s"This actor has then name of our message: ${message.name}. This is the reason why our message may not have spaces in it or other invalid characters")
          .reset()
        //#create-actors

        ConsolerizerComposer.outSpace()
          .blue(s"We have given the message as a name for our reply actor. We now send the message to our greeter actor: $greeter")
          .reset()
        greeter ! Greeter.Greet(message.name, replyTo)
        Behaviors.same
      }
    }
}
//#greeter-main

//#main-class
object AkkaQuickstart extends App {
  //#actor-system
  val greeterMain: ActorSystem[GreeterMain.SayHello] = ActorSystem(GreeterMain(), "AkkaQuickStart")
  //#actor-system

  //#main-send-messages
  greeterMain ! SayHello("We_Cannot_Use_Spaces_Here")
  greeterMain ! SayHello("If_We_Do_This_Again_We_Generate_3_More_Coms_With_The_Same_Bots")
  //#main-send-messages
}
//#main-class
//#full-example
