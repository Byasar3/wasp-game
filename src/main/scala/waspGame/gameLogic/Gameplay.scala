package waspGame.gameLogic

import waspGame.gameData.Hive
import waspGame.userInteraction.{Printer, Reader}

import scala.util.Random

class Gameplay {

  val hive = new Hive()
  val printer = new Printer()
  val reader = new Reader()

  def startGame(): Unit = {
    printer.printMessage("Welcome to the Wasp Game!")
    var continuePlaying = true

    while (continuePlaying) {
      printer.printMessage("\nCurrent Hive State:")
      printer.printAllWaspsState(hive.getWasps)

      val action = reader.readLine("\nChoose an action (fire/restart/quit): ").toLowerCase

      action match {
        case "fire" =>
          val aliveWasps = hive.getWasps.filter(_.isAlive)
          if (aliveWasps.nonEmpty) {
            val targetIndex = Random.nextInt(aliveWasps.length)
            val target = aliveWasps(targetIndex)
            val damage = target.hitpoint
            val indexOfTargetInHive = hive.getWasps.indexOf(target)
            hive.updateWasp(indexOfTargetInHive, target.gettingHit(damage))


            if (hive.isQueenDead) {
              printer.printMessage("The Queen Wasp is dead! All wasps are dead.")
              continuePlaying = false
            } else if (hive.areAllWaspsDead()) {
              printer.printMessage("All wasps are dead!")
              continuePlaying = false
            }
          } else {
            printer.printMessage("All wasps are already dead!")
            continuePlaying = false
          }

        case "restart" =>
          hive.resetHive()
          printer.printMessage("Game has been restarted!")

        case "quit" =>
          continuePlaying = false

        case _ =>
          printer.printMessage("Invalid action!")
      }
    }

    printer.printMessage("Thanks for playing!")
  }
}
