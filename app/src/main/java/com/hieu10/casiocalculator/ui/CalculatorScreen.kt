package com.hieu10.casiocalculator.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hieu10.casiocalculator.ui.theme.CasioCalculatorTheme

@Composable
fun CalculatorScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Calculator Placeholder - Ready for UI")
    }
}

@Preview(name = "Light Theme")
@Composable
private fun LightPreview() {
    CasioCalculatorTheme(darkTheme = false) {
        CalculatorScreen()
    }
}

@Preview(name = "Dark Theme")
@Composable
private fun DarkPreview() {
    CasioCalculatorTheme(darkTheme = true) {
        CalculatorScreen()
    }
}