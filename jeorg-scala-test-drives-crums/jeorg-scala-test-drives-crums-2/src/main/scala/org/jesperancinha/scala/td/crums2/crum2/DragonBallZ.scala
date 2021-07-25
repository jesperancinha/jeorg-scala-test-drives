package org.jesperancinha.scala.td.crums2.crum2

sealed trait DragonBallZ {
  def charName: String

  override def toString: String = charName
}

object DragonBallZ {
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

  val values: Array[DragonBallZ] = Array(SonGoku, Krillin, Bulma, Piccolo, SonGohan, Vegeta, Bardock, Trunks, SonGoten)

  def valueOf(value:String) :DragonBallZ = value match {
    case "Son Goky"=> SonGoku
    case "Krillin"=> Krillin
    case "Bulma"=> Bulma
    case "Piccolo"=> Piccolo
    case "Son Gohan"=> SonGohan
    case "Vegeta"=> Vegeta
    case "Bardock"=> Bardock
    case "Trunks"=> Trunks
    case "Son Goten"=> SonGoten
  }
}