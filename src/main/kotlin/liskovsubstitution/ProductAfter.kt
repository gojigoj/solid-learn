package liskovsubstitution

import openclose.Product
import java.util.*

abstract class ProductAfter {
    abstract val name: String

    /**
     * Function to get all of information about product
     */

    fun getProductInfo(){
        // some magic code
    }
}

abstract class FoodProduct: ProductAfter() {
    abstract val expiredDate: Date
}

class VegetableAfter: FoodProduct() {
    override val name: String
        get() = "Broccoli"
    override val expiredDate: Date
        get() = Date()
}

class SmartphoneAfter: ProductAfter() {
    override val name: String
        get() = "Samsung S10+ Limited Edition"

}

