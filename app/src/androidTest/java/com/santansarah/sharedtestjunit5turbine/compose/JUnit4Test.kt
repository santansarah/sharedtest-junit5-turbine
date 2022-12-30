package com.santansarah.sharedtestjunit5turbine.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.santansarah.sharedtestjunit5turbine.Greeting
import com.santansarah.sharedtestjunit5turbine.ui.theme.SharedTestJUnit5TurbineTheme
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class JUnit4Test {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun test() {
        composeRule.setContent {
            Column {
                Text(text = "Hello World")
            }
        }

        composeRule.onNodeWithText("Hello World").assertIsDisplayed()
    }


    @Test
    fun test_Greeting() {
        composeRule.setContent {
            SharedTestJUnit5TurbineTheme {
                Greeting(name = "Sarah")
            }
        }

        composeRule.onNodeWithText("Hello Sarah!").assertIsDisplayed()

    }

}