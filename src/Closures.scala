/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Closures {
  def main(args: Array[String]) {
    println("multiplier(1): " + multiplier(1))
    println("multiplier(2): " + multiplier(2))
  }

  val factor = 3
  val multiplier = (i:Int) => i * factor
}
