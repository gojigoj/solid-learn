package openclose

class ShippingOrderServiceAfter {
    fun checkout(product: Product, shipping: Shipping) {
        val costShipping = shipping.calculate(product)
        /** Code to do check */
    }
}

abstract class Shipping {
    abstract fun calculate(product: Product): Int
}

class JNEShipping: Shipping() {
    override fun calculate(product: Product): Int {
        return 0 /** calculate amount of this type with product*/
    }
}

class TIKIShipping: Shipping() {
    override fun calculate(product: Product): Int {
        return 0 /** calculate amount of this type with product*/
    }
}

class SiCepatShipping: Shipping() {
    override fun calculate(product: Product): Int {
        return 0 /** calculate amount of this type with product*/
    }
}

class POSINDOShipping: Shipping() {
    override fun calculate(product: Product): Int {
        return 0 /** calculate amount of this type with product*/
    }
}
