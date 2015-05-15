/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object Funcs {
  // def functionName ([list of arguments]) : [return type] = {
  //   function body
  //   return expression
  // }

  def addInt(a:Int, b:Int) : Int = {a+b}

  def main(args: Array[String]) {
    printStrings("Hello", null, "Scala", "World!", 1)

    val mul = (x: Int, y: Int) => x*y
    val userDir = () => { System.getProperty("user.dir") }

    println(mul(4,4))
    println(userDir())
  }

  def iAmAVoidFunction(): Unit = {
    println("ello, gov'na!")
  }

  def printStrings(args:Any*) = {
    var i:Int = 0
    for (arg <- args if arg != null if arg.isInstanceOf[String]) {
      println("Arg value[" + i + "] = " + arg)
      i = i + 1
    }
  }
}
