package waspGame

class WorkerWasp(health: Int = 68, hitpoint: Int = 10, totalTimesHit: Int = 0, isAlive: Boolean = true) extends Wasp(health, hitpoint, totalTimesHit, isAlive) {

  override def gettingHit(damage: Int): Wasp = {
    val newTotalTimesHit = this.totalTimesHit + 1
    val newHealth = (this.health - damage).max(0)
    val newIsAlive = newHealth > 0
    new WorkerWasp(newHealth, this.hitpoint, newTotalTimesHit, newIsAlive)
  }
}
