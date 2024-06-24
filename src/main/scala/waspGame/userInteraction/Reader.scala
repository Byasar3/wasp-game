package waspGame.userInteraction

import scala.io.StdIn

class Reader {
  def readLine(prompt: String): String = {
    print(prompt)
    StdIn.readLine()
  }
}
