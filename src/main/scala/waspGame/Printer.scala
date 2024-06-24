package waspGame

class Printer  {

  def printMessage(message: String) : Unit = {
    println(message)
  }

  def printHiveState(wasp : Wasp) : Unit = {
    println(s"${wasp.getClass.getSimpleName} - Health: ${wasp.health}, Hitpoint: ${wasp.hitpoint}, TotalTimesHit: ${wasp.totalTimesHit}, IsAlive: ${wasp.isAlive}")
  }

  def printAllWaspsState(wasps: List[Wasp]): Unit = {
    wasps.foreach(printHiveState)
  }
}
