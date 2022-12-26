package com.santansarah.sharedtestjunit5turbine

import app.cash.turbine.test
import com.santansarah.sharedtest.testSharedData
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class JUnit5Test {

    @Test
    fun testSharedModule()
    {
        Assertions.assertEquals(1, testSharedData.id)
        println("Got here...")
    }

    @Test
    fun testFailedAssert()
    {
        Assertions.assertEquals(0, testSharedData.id)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun testFlow() = runTest {
        com.santansarah.sharedtest.testFlow.test {
            Assertions.assertEquals(1, awaitItem().id)
            cancelAndConsumeRemainingEvents()
        }
    }

}