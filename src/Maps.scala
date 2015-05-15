/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Maps {
  val a:Map[Char,Int] = Map()
  var colors = Map("red" -> "#ff0000", "white" -> "#ffffff", "blue" -> "#0000ff")
  colors += ("green" -> "#00ff00")

  val moreColors = Map("yellow" -> "#00ffff", "orange" -> "#ff00ff")

  def main(args: Array[String]) {
    println("Keys in colors: " + colors.keys)
    println("Values in colors: " + colors.values)
    println("Check if colors is empty: " + colors.isEmpty)
    println("Check if nums is empty: " + a.isEmpty)

    val concatted = colors ++ moreColors

    for ((key,value) <- concatted) {
      printf("\nKey: %s, Value: %s", key,value)
    }

    colors.keys.foreach(color => println("Key = " + color))
    colors.values.foreach(value => println("Value = " + value))

    if (colors.contains("red")) println("Red is there!")
  }
}
