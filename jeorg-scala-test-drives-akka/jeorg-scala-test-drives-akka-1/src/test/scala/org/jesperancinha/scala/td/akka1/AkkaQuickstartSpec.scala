//#full-example
package org.jesperancinha.scala.td.akka1

import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import org.jesperancinha.scala.td.akka1.Greeter.{Greet, Greeted}
import org.scalatest.wordspec.AnyWordSpecLike

//#definition
class AkkaQuickstartSpec extends ScalaTestWithActorTestKit with AnyWordSpecLike {
//#definition

  "A Greeter" must {
    //#test
    "reply to greeted" in {
      val replyProbe = createTestProbe[Greeted]()
      val underTest = spawn(Greeter())
      underTest ! Greet("Santa", replyProbe.ref)
      replyProbe.expectMessage(Greeted("Santa", underTest.ref))
    }
    //#test
  }

}
//#full-example
