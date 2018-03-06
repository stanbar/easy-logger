package com.stasbar

import java.text.SimpleDateFormat
import java.util.*

object Logger {

    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

    @JvmStatic
    fun info(obj: Any?) {
        print(obj, "INFO", Text.ANSI_CYAN, "ℹ")
    }

    @JvmStatic
    fun err(obj: Any?) {
        print(obj, "ERROR", Text.ANSI_RED, "❗")
    }

    @JvmStatic
    fun d(obj: Any?) {
        print(obj, "DEBUG", Text.ANSI_GREEN, "\uD83D\uDC1B")
    }

    private fun print(obj: Any?, tag: String, color: String, icon: String) {
        val time = dateFormat.format(Date(System.currentTimeMillis()))
        println("\n$color$icon[$tag]$ANSI_RESET[$time] ${obj.toString()} \n")
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