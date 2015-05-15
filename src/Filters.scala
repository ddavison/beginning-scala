/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Filters {
  def main(args: Array[String]) {
    val numList = List(1,2,3,4,5,6,7,8,9,10)

    for (x <- numList
      if x > 5
    ) {
      println("Value of x is: " + x)
    }
  }
}
