package com.santansarah.sharedtestjunit5turbine.compose

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.santansarah.sharedtestjunit5turbine.MainActivity
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
class JUnit4TestActivity {

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun test_Greeting() {
        composeRule.onNodeWithText("Hello Android!").assertIsDisplayed()
    }

}