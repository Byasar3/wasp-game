package waspGame

class Hive {

  private var wasps: List[Wasp] = createInitialWasps()

  def createInitialWasps(): List[Wasp] = {
    List(
      new QueenWasp(),
      new WorkerWasp(), new WorkerWasp(), new WorkerWasp(), new WorkerWasp(), new WorkerWasp(),
      new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp()
    )
  }
  
  def getWasps: List[Wasp] = wasps

  def updateWasp(index: Int, wasp: Wasp): Unit = {
    wasps = wasps.updated(index, wasp)
  }

  def resetHive(): Unit = {
    wasps = createInitialWasps()
  }

  def areAllWaspsDead(): Boolean = {
    wasps.forall(!_.isAlive)
  }

  def isQueenDead: Boolean = {
    !wasps.collectFirst { case q: QueenWasp => q.isAlive }.getOrElse(false)
  }
}
