package com.santansarah.sharedtestjunit5turbine.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import com.santansarah.sharedtestjunit5turbine.ui.theme.SharedTestJUnit5TurbineTheme
import de.mannodermaus.junit5.compose.AndroidComposeExtension
import de.mannodermaus.junit5.compose.ComposeExtension
import de.mannodermaus.junit5.compose.createAndroidComposeExtension
import de.mannodermaus.junit5.compose.createComposeExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.RegisterExtension

@ExtendWith(AndroidComposeExtension::class)
class ComposeTestAlt {

    @Test
    fun test(extension: ComposeExtension) = extension.runComposeTest {
        setContent {
            Column {
                Text(text = "Hello World")
            }
        }

        onNodeWithText("Hello World").assertIsDisplayed()
    }

}