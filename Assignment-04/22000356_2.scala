import scala.io.StdIn

object PatternMatching{

    def PatternMatching(value : Int) : String = value match  {
        case value if (value <= 0) =>  "Negative/Zero is input."
        case value if (value % 2 == 0) => "This is a even number."
        case value if (value % 2 != 0 )=> "This is a odd number."
    }

    def main(args : Array[String]): Unit = {
        println("Enter a number : ")
        val value = StdIn.readLine().toInt

        val result = PatternMatching(value)
        println(result)
    }
}