/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Yield {
  def main(args: Array[String]) {
    val numList = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14)

    val retVal = for { a <- numList
      if a != 3; if a < 8
    } yield a

    // now print returned values
    for (a <- retVal) {
      println("Value of a: " + a)
    }
  }
}
