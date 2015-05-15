/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Options {
  def main(args: Array[String]) {
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    println("show(capitals.get(\"France\")): " + show(capitals.get("France")))
    println("show(capitals.get(\"Japan\")): " + show(capitals.get("Japan")))
    println("show(capitals.get(\"India\")): " + show(capitals.get("India")))
  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None    => "?"
  }
}
