package waspGame.gameData

abstract class Wasp(val health: Int, val hitpoint: Int, val totalTimesHit: Int = 0, val isAlive: Boolean = true) {

  def gettingHit(damage : Int) : Wasp
}
