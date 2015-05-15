/**
 *
 * @author ddavison
 * @since May 15, 2015
 */
object PatternMatching {
  def main(args: Array[String]) {
    println("The roman numeral for 4 is : " + convert(4))
  }

  def convert(number: Int): Any = number match {
    case 1 => "I"
    case 2 => "II"
    case 3 => "III"
    case 4 => "IV"
    case 5 => "V"
    case 10 => "X"
  }
}
