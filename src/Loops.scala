/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Loops {
  /**
   * Main function
   * @param args do something
   */
  def main(args: Array[String]) {
    for (i <- 1 to 10) {
      println(i)
    }

    (1 until 1000).foreach(x => println(x))
  }
}
