package waspGame

class Hive {

  private var wasps: List[Wasp] = List(
    new QueenWasp(),
    new WorkerWasp(), new WorkerWasp(), new WorkerWasp(), new WorkerWasp(), new WorkerWasp(),
    new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp(), new DroneWasp()
  )
  
  def getWasps: List[Wasp] = wasps
}
