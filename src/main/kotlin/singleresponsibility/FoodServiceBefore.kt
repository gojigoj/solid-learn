package singleresponsibility

import java.text.SimpleDateFormat
import java.util.*

class FoodServiceBefore(
    private var id: Int,
    private var name: String,
    private var date: String
) {
    fun addToStore() {
        if (!isExpired()) {
            //Do add to Store
        }
    }

    private fun isExpired(): Boolean {
        var foodDate = Date()
        val now = Date()
        val dateFormat = SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH)
        try {
            foodDate = dateFormat.parse(date)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return foodDate.time >= now.time
    }
}