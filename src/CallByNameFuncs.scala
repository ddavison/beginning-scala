/**
  *
  * @author ddavison
  * @since May 15, 2015
  */
object CallByNameFuncs {
  def main(args: Array[String]) {
    delayed(time())
  }

  def time() = {
    println("Getting time in nanoseconds")
    System.nanoTime()
  }

  def delayed(t: => Long) = {
    println("In delayed method")
    println("Param: " + t)
    t
  }

  def a(t: => Any) = {
    t
  }
 }
