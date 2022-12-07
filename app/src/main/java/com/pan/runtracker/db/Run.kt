package com.pan.runtracker.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

/* Entity являє собою таблицю, а кожне поле колонку*/
@Entity(tableName = "running_table")
data class Run(
    var img: Bitmap? = null,
    /* Буде використовуватись для зберігання дати пробіжки користувача. Сортувати тип Date складніше
    * ніж Long, тому для зручності, вони будуть збережені в такому вигляді*/
    var timestamp: Long = 0L,
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    /* Для збереження як довго проходила йшла пробіжка*/
    var timeInMillis: Long = 0L,
    var caloriesBurned: Int = 0
    ) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
