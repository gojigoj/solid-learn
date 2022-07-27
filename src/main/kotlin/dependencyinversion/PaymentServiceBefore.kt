package dependencyinversion

class PaymentServiceBefore {
    private val database: MySQLDatabase = MySQLDatabase()

    fun paymentIsValid() {
        // Implementation code
    }

    fun openDatabase() {
        // Implementation code
    }

    fun addNewPayment() {
        // Implementation code
    }

    fun removePaymentByID() {
        // Implementation code
    }

    fun updatePaymentByID() {
        // Implementation code
    }
}

class MySQLDatabase {
    fun insert() {

    }

    fun update() {

    }

    fun delete() {

    }
}