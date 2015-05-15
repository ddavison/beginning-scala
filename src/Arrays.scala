import Array._

/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Arrays {
  def main(args: Array[String]) {
    val myList = List(1.9, 2.9, 9.4, 3.4, 3.5)

    // print all the array elements
    for (item <- myList) println(item)

    // summing all elements
    var total = 0.0
    for (i <- 0 to (myList.length -1)) total += myList(i)
    printf("\nTotal is: %f", total)

    // finding the largest element
    var max = myList(0);
    for (i <- 1 to (myList.length -1)) {
      if (myList(i) > max) max = myList(i)
    }
    printf("\nMax is: %f", max)

    // Multi-Dimensionals...
    val myMatrix = ofDim[Int](3,3)

    // build a matrix
    for (i <- 0 to myMatrix.length-1) {
      for (j <- 0 to myMatrix.length-1) {
        myMatrix(i)(j) = j
      }
    }

    // print two dimensional arrays
    for (i <- 0 to myMatrix.length-1) {
      for (j <- 0 to myMatrix.length -1) {
        print(" " + myMatrix(i)(j))
      }
      println()
    }

    // concat arrays
    println("=== Concat Arrays === ")
    val list1 = Array(1,2,3,4)
    val list2 = Array(5,6,7,8)
    val list3 = concat(list1, list2)

    for (x <- list3) println(x)
  }
}
