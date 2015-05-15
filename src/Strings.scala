/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Strings {
  val greeting = "Hello, World!"

  def main(args: Array[String]) {
    println(greeting)
    println(greeting.length) // can use any java.lang.String methods

    printf("Formatted String: %s", greeting)
  }
}
