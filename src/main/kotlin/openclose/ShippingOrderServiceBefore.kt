package openclose

import java.lang.IllegalArgumentException

class ShippingOrderServiceBefore {
    fun checkout(product: Product, type: ShippingType) {
        when (type) {
            ShippingType.JNE -> { /** do checkout product with this shipping type */ }
            ShippingType.TIKI -> { /** do checkout product with this shipping type */ }
            ShippingType.POSINDO -> { /** do checkout product with this shipping type */ }
            else -> throw IllegalArgumentException("Unsupported shipiing type")
        }
    }
}

data class Product(
    val name: String,
    val price: Int
)

enum class ShippingType {
    JNE, TIKI, POSINDO
}