package org.jesperancinha.scala.td.crums2.crum2

import org.jesperancinha.scala.td.crums2.crum2.Bulma.charName

trait DragonBallZ {
  def charName: String
  override def toString: String = charName
}

case object SonGoku extends DragonBallZ {
  override def charName: String = "Son Goku"
}

case object Bulma extends DragonBallZ {
  override def charName: String = "Bulma"
}

case object Krillin extends DragonBallZ {
  override def charName: String = "Krillin"
}

case object Piccolo extends DragonBallZ {
  override def charName: String = "Piccolo"
}

case object SonGohan extends DragonBallZ {
  override def charName: String = "Son Gohan"
}

case object Vegeta extends DragonBallZ {
  override def charName: String = "Vegeta"
}

case object Bardock extends DragonBallZ {
  override def charName: String = "Bardock"
}

case object Trunks extends DragonBallZ {
  override def charName: String = "Trunks"
}

case object SonGoten extends DragonBallZ {
  override def charName: String = "Son Goten"
}