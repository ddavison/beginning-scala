/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Tuples {
  val t = (4,3,2,1)
  val sum = t._1 + t._2 + t._3 + t._4

  def main(args: Array[String]) {
    println(sum)
  }
}
