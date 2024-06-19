package waspGame

abstract class Wasp(val health: Int, val hitpoint: Int, val totalTimesHit: Int = 0, val isAlive: Boolean = true) {

  def gettingHit(wasp : Wasp) : Wasp
}
