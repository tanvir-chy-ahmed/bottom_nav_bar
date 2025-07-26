package com.tax.xor.nex.tan

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun SetSystemBarColor(color: Color, darkIcons: Boolean = false) {
    val systemUiController = rememberSystemUiController()
    val view = LocalView.current
    val window = (view.context as Activity).window

    SideEffect {
        systemUiController.setStatusBarColor(
            color = color,
            darkIcons = darkIcons // false = white icons (for dark backgrounds)
        )
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}
