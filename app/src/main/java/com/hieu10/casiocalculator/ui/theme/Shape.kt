package com.hieu10.casiocalculator.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val AppShapes = Shapes(
    extraSmall = RoundedCornerShape(2.dp),      // Sharp for small icons
    small = RoundedCornerShape(4.dp),           // Button defaults (Casio key feel)
    medium = RoundedCornerShape(8.dp),          // Display corners, panels
    large = RoundedCornerShape(16.dp),          // Full cards or modals
    extraLarge = RoundedCornerShape(28.dp)      // Floating actions if added
)