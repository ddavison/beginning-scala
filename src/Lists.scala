/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Lists {
  def main(args: Array[String]) {
    val numList = List(1,"Test",3,4,5,6)

    // for loop execution with a collection
    for ( a <- numList) println("Value of a: " + a)

    val fruits: List[String] = List("Apple", "Banana", "Pear")

    val numbers: List[Int] = List(1,2,3,4)

    // empty list
    val empy: List[Nothing] = List()

    // two dimensional list
    val twoDim: List[List[Int]] = List(
      List(1,2,3),
      List(4,5,6),
      List(6,7,8)
    )

    println("=== Concating lists ===")
    val list1 = "Hello" :: ("World" :: ("Scala" :: Nil))
    val list2 = "Another" :: ("List" :: Nil)
    val concatList = list1 ::: list2
    for (x <- concatList) println(x)

    println("=== Batman! ===")
    val words = List.fill(16)("na")

    for (word <- words) print(word + " ")
    print("Batman!")

  }
}
