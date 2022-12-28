package com.santansarah.sharedtestjunit5turbine

import android.util.Log
import app.cash.turbine.test
import com.santansarah.sharedtest.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class JUnit5Test {

    @Test
    fun testSharedModule()
    {
        Assertions.assertEquals(1, testSharedData.id)
        Log.d("debug", "Got here...")
    }

    @Test
    fun testFailedAssert()
    {
        Assertions.assertEquals(0, testSharedData.id)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun testFlow() = runTest {
        testFlow.test {
            Assertions.assertEquals(1, awaitItem().id)
            cancelAndConsumeRemainingEvents()
        }
    }

}