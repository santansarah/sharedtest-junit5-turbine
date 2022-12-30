package com.santansarah.sharedtestjunit5turbine.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import com.santansarah.sharedtestjunit5turbine.Greeting
import com.santansarah.sharedtestjunit5turbine.MainActivity
import com.santansarah.sharedtestjunit5turbine.ui.theme.SharedTestJUnit5TurbineTheme
import de.mannodermaus.junit5.compose.createAndroidComposeExtension
import de.mannodermaus.junit5.compose.createComposeExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

class ComposeTestActivity {

    // Cannot inline bytecode built with JVM target 11 into bytecode that is being built with JVM
    // target 1.8. Please specify proper '-jvm-target' option

    /*@JvmField
    @RegisterExtension
    val extension = createAndroidComposeExtension<MainActivity>()

    @Test
    fun test_Greeting() {
        extension.runComposeTest {
            setContent {
                SharedTestJUnit5TurbineTheme {
                    Greeting(name = "Sarah")
                }

            }

            onNodeWithText("Hello Sarah!").assertIsDisplayed()

        }
    }*/

}