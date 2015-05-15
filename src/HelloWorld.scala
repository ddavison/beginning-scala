object HelloWorld {
  var myVar : String = "Foo" // mutable
  val myVal : String = "Bar" // immutable

  var myInferedVar = "Foo Bar"
  var myInt = 10

  def main(args: Array[String]) {
    println("Hello Scala IntelliJ world!" + myVar) // prints hello world.
    if (true) {
      println("it's true")
    }
  }
}
