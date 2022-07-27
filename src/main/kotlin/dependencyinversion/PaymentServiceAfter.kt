package dependencyinversion

class PaymentServiceAfter (val database: Database) {
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

abstract class Database {
    abstract fun insert()
    abstract fun update()
    abstract fun delete()
}

class MySQLDatabaseAfter: Database() {
    override fun insert() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }
}

class MongoDatabase: Database() {
    override fun insert() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

}