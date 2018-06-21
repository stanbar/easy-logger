package com.stasbar

import org.junit.Test


class LoggerTest{

    @Test
    fun testDebug(){
        Logger.d("Start loading...")
        Logger.d("TestClass","Start loading...")
    }
    @Test
    fun testError(){
        Logger.err("User not found")
        Logger.err("TestClass","User not found")
    }

    @Test
    fun testInfo(){
        Logger.info("Successfuly downloaded item")
        Logger.info("TestClass","Successfuly downloaded item")
    }
}