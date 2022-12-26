package com.santansarah.sharedtest

import kotlinx.coroutines.flow.flowOf

data class SharedData(
    val id: Int,
    val greeting: String
)

val testSharedData = SharedData(
    1,
    "Hi YouTube 😀"
)

val testFlow = flowOf(
    testSharedData,
    SharedData(
        2,
        "Happy New Year!"
    )
)