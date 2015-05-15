/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Regex {
  def main(args: Array[String]) {
    val pattern = "[Ss]cala".r
    val str = "Scala is Scalable and cool"

    println((pattern findAllIn str).mkString(","))

    println(pattern replaceAllIn(str, "Java"))
  }
}
