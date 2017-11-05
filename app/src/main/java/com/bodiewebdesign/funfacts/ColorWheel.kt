package com.bodiewebdesign.funfacts

import android.graphics.Color
import java.util.*

class ColorWheel {
    // Properties - characteristics of the object
    val colors = arrayOf(
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    )

    // Methods - actions the object can take
    fun getColor(): Int {
        // Randomly select color
        val randomGenerator = Random()
        val randomNumber = randomGenerator.nextInt(colors.size)
        val colorAsInt = Color.parseColor(colors[randomNumber])
        return colorAsInt
    }
}