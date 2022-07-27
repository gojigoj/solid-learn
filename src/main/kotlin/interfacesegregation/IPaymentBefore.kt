package interfacesegregation

interface IPaymentBefore {
    fun setPaymentName()
    fun setAmount()
    fun bankID()
    fun virtualBankID()
    fun accountID()
}

class Gopay : IPaymentBefore {
    override fun setPaymentName() {
        TODO("Not yet implemented")
    }

    override fun setAmount() {
        TODO("Not yet implemented")
    }

    override fun bankID() {
        TODO("Not yet implemented")
    }

    override fun virtualBankID() {
        TODO("Not yet implemented")
    }

    override fun accountID() {
        TODO("Not yet implemented")
    }
}

class Mandiri : IPaymentBefore {
    override fun setPaymentName() {
        TODO("Not yet implemented")
    }

    override fun setAmount() {
        TODO("Not yet implemented")
    }

    override fun bankID() {
        TODO("Not yet implemented")
    }

    override fun virtualBankID() {
        TODO("Not yet implemented")
    }

    override fun accountID() {
        TODO("Not yet implemented")
    }

}

class BNI : IPaymentBefore {
    override fun setPaymentName() {
        TODO("Not yet implemented")
    }

    override fun setAmount() {
        TODO("Not yet implemented")
    }

    override fun bankID() {
        TODO("Not yet implemented")
    }

    override fun virtualBankID() {
        TODO("Not yet implemented")
    }

    override fun accountID() {
        TODO("Not yet implemented")
    }

}