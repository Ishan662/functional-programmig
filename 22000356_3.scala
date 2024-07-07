object StringFormatter {
  def toUpper(input: String): String = input.toUpperCase

  def toLower(input: String): String = input.toLowerCase

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val upperCaseNames = names.map(toUpper)
    println("Formatted to Upper Case:")
    upperCaseNames.foreach(println)

    println()

    val lowerCaseNames = names.map(toLower)
    println("Formatted to Lower Case:")
    lowerCaseNames.foreach(println)
  }
}
