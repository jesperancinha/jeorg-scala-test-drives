package org.jesperancinha.scala.td.crums1.crum6

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer

object Crum6 {
  def main(args: Array[String]): Unit = {
    ConsolerizerComposer.outSpace()
      .cyan(ConsolerizerComposer.title("Crum 6 - Making case classes manually"))

    val newCar = Car(6, 4, 5)
    val oldCar = OldCar(6, 4, 5)

    ConsolerizerComposer.outSpace().none()
      .blue("This is the old car").red(oldCar.toString).newLine()
      .blue("And this is the new car").red(newCar.toString).newLine()
      .magenta("They both provide and are the same under the hood. The keyword case simply shortens the boiler code.")
      .magenta("Take note that hashcode and equals are also included in case classes").newLine()
      .reset()

  }

  case class Car(nGear: Int, nWheels: Int, nDoors: Int)

  class OldCar(val nGear: Int, val nWheels: Int, val nDoors: Int){
    override def toString: String = s"OldCar($nGear,$nWheels,$nDoors)"
  }

  object OldCar {
    def apply(nGear: Int, nWheels: Int, nDoors: Int): OldCar = new OldCar(nGear, nWheels, nDoors)
  }
}
