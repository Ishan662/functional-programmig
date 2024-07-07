import scala.io.StdIn.readLine

object InventoryManagement {
  var itemNames = Array("pen", "pencil", "books", "rules")
  var itemQuantities = Array(10, 5, 8, 15)

  def displayInventory() : Unit = {
    for(i <- itemNames.indices){
        println(s"Item : ${itemNames(i)} | ${itemQuantities(i)}")
    }
    println()
  }

  def restockItem(name : String, Quantity : Int) : Unit = {
    val indexOfItem = itemNames.indexOf(name)
    if(indexOfItem != -1){
        println("Item found, Updating...")
        itemQuantities(indexOfItem) += Quantity
    }
    else{
        println("Item not found...")
    }
    println()
  }

  def sellItem(name : String, Quantity : Int ): Unit = {
    val index = itemNames.indexOf(name)

    if(index != -1){
        itemQuantities(index) -= Quantity
        println("Query ok...")
    }
    else{
        println("Cannot do the oparation.not found")
    }
  }

  def main(args: Array[String]): Unit = {
    restockItem("pencil", 5)
    displayInventory()
  }
}
