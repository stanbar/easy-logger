package com.stasbar

import org.junit.Test

fun main(args: Array<String>) {
    LoggerTest.testDebug()
    LoggerTest.testInfo()
    LoggerTest.testError()
}
object LoggerTest{

    @Test
    fun testDebug(){
        Logger.d("Start loading...")
    }
    @Test
    fun testError(){
        Logger.err("User not found")
    }

    @Test
    fun testInfo(){
        Logger.info("Successfuly downloaded item")
    }
}