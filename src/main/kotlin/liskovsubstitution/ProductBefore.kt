package liskovsubstitution

import java.util.*

abstract class ProductBefore {
    abstract val name: String
    abstract val expiredDate: Date

    /**
     * Function to get all of information about product
     */

    fun getProductInfo(){
        // some magic code
    }
}

class Vegetable: ProductBefore() {
    override val name: String
        get() = "Broccoli"
    override val expiredDate: Date
        get() = Date()
}

class Smartphone: ProductBefore() {
    override val name: String
        get() = "Samsung S10+ Limited Edition"
    override val expiredDate: Date
        get() = Date() // ?????
}