package com.santansarah.sharedtestjunit5turbine

import com.santansarah.sharedtest.testSharedData
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class JUnit5Test {

    @Test
    fun testSharedModule()
    {
        Assertions.assertEquals(1, testSharedData.id)
        println("Got here...")
    }

}