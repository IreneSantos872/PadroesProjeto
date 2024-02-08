class Product(val name: String, val price: Double, val quantity: Int)

class CustomOrder private constructor(
  val customerName: String,
  val products: List<Product>,
  val total: Double,
  val deliveryAddress: String
) {
  /** Classe interna para "linkar" o Builder com a classe CustomOrder **/
  class Builder {
    private var customerName: String = ""
    private var products: MutableList<Product> = mutableListOf()
    private var deliveryAddress: String = ""

    fun setCustomerName(name: String) = apply { customerName = name }
    fun addProduct(product: Product) = apply { products.add(product) }
    fun setDeliveryAddress(address: String) = apply { deliveryAddress = address }

    fun build(): CustomOrder {
		val orderTotal = products.sumByDouble(it.price * it.quantity)
        return CustomOrder(customerName, products.toList(), orderTotal, deliveryAddress))
    }
  }
  
  fun printReceipt() {
    println("${this.customerName}")
    this.products.forEachIndexed { index, product ->
      println("${index + 1}. ${product.name} | ${product.price} | ${product.quantity}")
    }
    println("Total: ${this.total}")
    println("End: ${this.deliveryAddress}")
  }
}

fun main() {
  val customerName = "Paulo"
    
  val orderBuilder = CustomOrder.Builder().setCustomerName(customerName)

  val numProducts = 2
  for (i in 1..numProducts) {
    val productName = "cafe";
    val productPrice = 1.5;
    val productQuantity = 3;

    orderBuilder.addProduct(Product(productName, productPrice, productQuantity))
  }

  val deliveryAddress = "Lagoa"

  val customOrder = orderBuilder.setDeliveryAddress(deliveryAddress).build()

  customOrder.printReceipt()
}