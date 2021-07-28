package org.jesperancinha.scala3.td.crums1.crum5

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator
import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum5 {

  implicit val mappuuids: Map[String, Long] = Map("a" -> 1, "b" -> 2)

  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 5 - Using and implicits"))
      .reset()

    val sourceList = (1 to 10).map(n => java.util.UUID.randomUUID().toString).toList

    val randomList = makeRandomsUUIDsDouble(sourceList)

    ConsolerizerComposer.out().cyan(randomList).reset()

  }

  def makeRandomsUUIDsDouble[String](uuids: List[String])(using mapuuids: Map[String, Long]): List[(String, Long)] = {
    (mapuuids ++ uuids.map(uuid => (uuid, (Math.random() * 1000).toLong)))
      .toList
  }

}
