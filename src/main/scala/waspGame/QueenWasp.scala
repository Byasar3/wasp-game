package waspGame

class QueenWasp(health: Int = 90, hitpoint: Int = 7, totalTimesHit: Int = 0, isAlive: Boolean = true) extends Wasp(health, hitpoint, totalTimesHit, isAlive) {

  override def gettingHit(wasp: Wasp): Wasp = {
    val newTotalTimesHit = this.totalTimesHit + 1
    val newHealth = this.health - wasp.hitpoint
    val newIsAlive = newHealth > 0
    new QueenWasp(newHealth, this.hitpoint, newTotalTimesHit, newIsAlive)
  }
}
