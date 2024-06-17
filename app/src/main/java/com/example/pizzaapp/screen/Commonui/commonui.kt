package com.example.pizzaapp.screen.Commonui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun spacerWidth(
    width: Dp =5.dp
) {
    Spacer(modifier = Modifier.width(width))
}

@Composable
fun spacerHeight(
    height:Dp=5.dp
) {
    Spacer(modifier = Modifier.height(height))
}