package singleresponsibility

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class FoodServiceAfter(
    var id: Int,
    var name: String,
    var date: String
) {
    fun addToStore() {
        if(!FoodExpiry.isExpired(date)) {
            //Do add to Store
        }
    }

    // tidak di masukkan ke class karena perbedaan tanggung jawab
    // Class FoodService untuk menangani pelayanan makanan bukan untuk menangani kadaluarsa
}

object FoodExpiry {
    fun isExpired(date: String?): Boolean {
        var foodDate = Date()
        val now = Date()
        val dateFormat =  SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH)
        try {
            foodDate = dateFormat.parse(date)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return foodDate.time >= now.time
    }
}

