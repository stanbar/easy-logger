package com.stasbar

import org.fusesource.jansi.Ansi.ansi
import java.text.SimpleDateFormat
import java.util.*

object Logger {

    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

    @JvmStatic
    fun info(obj: Any?) {
        val message = obj.toString()
        val time = dateFormat.format(Date(System.currentTimeMillis()))
        if (message.isNotBlank())
            println(ansi()
                    .a("\n")
                    .fgBrightCyan()
                    .a("ℹ")
                    .a("[INFO]")
                    .reset()
                    .a(time)
                    .a(" ")
                    .a(message)
                    .a("\n"))
    }

    @JvmStatic
    fun err(obj: Any?) {
        val message = obj.toString()
        val time = dateFormat.format(Date(System.currentTimeMillis()))
        if (message.isNotBlank())
            println(ansi()
                    .a("\n")
                    .fgBrightRed()
                    .a("❗")
                    .a("[ERROR]")
                    .reset()
                    .a(time)
                    .a(" ")
                    .a(message)
                    .a("\n"))
    }

    @JvmStatic
    fun d(obj: Any?) {
        val message = obj.toString()
        val time = dateFormat.format(Date(System.currentTimeMillis()))

        println(ansi()
                .a("\n")
                .fgBrightGreen()
                .a("\uD83D\uDC1B")
                .a("[DEBUG]")
                .reset()
                .a(time)
                .a(" ")
                .a(message)
                .a("\n"))
    }

}