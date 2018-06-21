package com.stasbar

import java.text.SimpleDateFormat
import java.util.*

object Logger {

    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

    @JvmStatic
    fun info(tag : String?, obj: Any?) {
        print(tag,obj, "INFO", Text.ANSI_CYAN, "ℹ")
    }
    @JvmStatic
    fun info(obj: Any?) {
        print(null,obj, "INFO", Text.ANSI_CYAN, "ℹ")
    }

    @JvmStatic
    fun err(tag : String,obj: Any?) {
        print(tag,obj, "ERROR", Text.ANSI_RED, "❗")
    }
    @JvmStatic
    fun err(obj: Any?) {
        print(null,obj, "ERROR", Text.ANSI_RED, "❗")
    }

    @JvmStatic
    fun d(tag : String,obj: Any?) {
        print(tag,obj, "DEBUG", Text.ANSI_GREEN, "\uD83D\uDC1B")
    }
    @JvmStatic
    fun d(obj: Any?) {
        print(null,obj, "DEBUG", Text.ANSI_GREEN, "\uD83D\uDC1B")
    }
    private fun print(tag : String?,obj: Any?, level: String, color: String, icon: String) {
        val time = dateFormat.format(Date(System.currentTimeMillis()))
        println("$color$icon[$level]$ANSI_RESET[$time][${tag ?: ""}] ${obj.toString()}")
    }


    val ANSI_RESET = "\u001B[0m"

    private object Text {
        val ANSI_BLACK = "\u001B[30m"
        val ANSI_RED = "\u001B[31m"
        val ANSI_GREEN = "\u001B[32m"
        val ANSI_YELLOW = "\u001B[33m"
        val ANSI_BLUE = "\u001B[34m"
        val ANSI_PURPLE = "\u001B[35m"
        val ANSI_CYAN = "\u001B[36m"
        val ANSI_WHITE = "\u001B[37m"
    }

    private object Background {
        val ANSI_BLACK_BACKGROUND = "\u001B[40m"
        val ANSI_RED_BACKGROUND = "\u001B[41m"
        val ANSI_GREEN_BACKGROUND = "\u001B[42m"
        val ANSI_YELLOW_BACKGROUND = "\u001B[43m"
        val ANSI_BLUE_BACKGROUND = "\u001B[44m"
        val ANSI_PURPLE_BACKGROUND = "\u001B[45m"
        val ANSI_CYAN_BACKGROUND = "\u001B[46m"
        val ANSI_WHITE_BACKGROUND = "\u001B[47m"
    }

}