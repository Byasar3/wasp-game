package waspGame

object Playground extends App {

  val hive = new Hive()

  // Print the initial state of the hive
  hive.getWasps.foreach(wasp => println(s"${wasp.getClass.getSimpleName} - Health: ${wasp.health}, Hitpoint: ${wasp.hitpoint}, TotalTimesHit: ${wasp.totalTimesHit}, IsAlive: ${wasp.isAlive}"))
}
