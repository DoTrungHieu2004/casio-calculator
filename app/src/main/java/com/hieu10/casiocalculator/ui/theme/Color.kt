package com.hieu10.casiocalculator.ui.theme

import androidx.compose.ui.graphics.Color

// Light theme (Casio Classic: Dark mode feel even in light)
val LightPrimary = Color(0xFF333333)  // Dark gray for buttons/background
val LightSecondary = Color(0xFFFF9500)  // Orange for operations
val LightTertiary = Color(0xFF00CC66)  // Green for equals
val LightError = Color(0xFFCC0000)  // Red for clear/delete
val LightBackground = Color(0xFF1E1E1E)  // Near-black for overall bg
val LightSurface = Color(0xFFE6E6E6)  // Light gray for display
val LightOnPrimary = Color(0xFFFFFFFF)  // White text on buttons
val LightOnBackground = Color(0xFFFFFFFF)
val LightOnSurface = Color(0xFF000000)  // Black text on display

// Dark theme (Enhanced for low-light; invert contrasts)
val DarkPrimary = Color(0xFF4D4D4D)  // Lighter gray
val DarkSecondary = Color(0xFFFFA500)  // Brighter orange
val DarkTertiary = Color(0xFF00FF99)  // Brighter green
val DarkError = Color(0xFFFF3333)  // Brighter red
val DarkBackground = Color(0xFF111111)
val DarkSurface = Color(0xFF333333)  // Darker display
val DarkOnPrimary = Color(0xFFFFFFFF)
val DarkOnBackground = Color(0xFFFFFFFF)
val DarkOnSurface = Color(0xFFFFFFFF)  // White text

// Additional accents for shifts/modes
val ShiftAccent = Color(0xFF0066CC)