package com.example.monitoringgizi.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Mengimpor warna yang telah dideklarasikan di color.kt
import com.example.monitoringgizi.ui.theme.Green40
import com.example.monitoringgizi.ui.theme.Orange40
import com.example.monitoringgizi.ui.theme.SurfaceLight
import com.example.monitoringgizi.ui.theme.SurfaceDark

private val LightColorScheme = lightColorScheme(
    primary = Green40,
    secondary = Orange40,
    background = SurfaceLight,
    surface = SurfaceLight,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val DarkColorScheme = darkColorScheme(
    primary = Green40,
    secondary = Orange40,
    background = SurfaceDark,
    surface = SurfaceDark,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun MonitoringGiziTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
