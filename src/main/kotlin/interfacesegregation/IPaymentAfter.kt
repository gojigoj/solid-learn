package interfacesegregation

interface EWalletProvider {
    fun accountID()
    fun walletProviderID()
}

interface PaymentProvider {
    fun paymentName()
    fun amount()
}

interface BankProvider {
    fun bankID()
    fun virtualAccount()
}

class GopayAfter : EWalletProvider, PaymentProvider {
    override fun accountID() {
        TODO("Not yet implemented")
    }

    override fun walletProviderID() {
        TODO("Not yet implemented")
    }

    override fun paymentName() {
        TODO("Not yet implemented")
    }

    override fun amount() {
        TODO("Not yet implemented")
    }

}

class OVO : EWalletProvider, PaymentProvider {
    override fun accountID() {
        TODO("Not yet implemented")
    }

    override fun walletProviderID() {
        TODO("Not yet implemented")
    }

    override fun paymentName() {
        TODO("Not yet implemented")
    }

    override fun amount() {
        TODO("Not yet implemented")
    }

}

class MandiriAfter : BankProvider, PaymentProvider {
    override fun paymentName() {
        TODO("Not yet implemented")
    }

    override fun amount() {
        TODO("Not yet implemented")
    }

    override fun bankID() {
        TODO("Not yet implemented")
    }

    override fun virtualAccount() {
        TODO("Not yet implemented")
    }

}

class BNIAfter: BankProvider, PaymentProvider {
    override fun paymentName() {
        TODO("Not yet implemented")
    }

    override fun amount() {
        TODO("Not yet implemented")
    }

    override fun bankID() {
        TODO("Not yet implemented")
    }

    override fun virtualAccount() {
        TODO("Not yet implemented")
    }

}