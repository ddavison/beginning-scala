import scala.util.control.Breaks

/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Breaks {
  def main(args: Array[String]) {
    val list = List(1,2,3,4,5,6,7,8,9,10)

    val loop = new Breaks
    loop.breakable {
      for (a <- list) {
        println( " Value of a: " + a)
        if (a == 4) loop.break()
      }
    }
    println("After the loop")
  }
}
