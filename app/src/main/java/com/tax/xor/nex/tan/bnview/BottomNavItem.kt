package com.tax.xor.nex.tan.bnview

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector


data class BottomNavItem(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean = false,
    val badges: Int = 0,
)

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route = "home",
        selectedIcon = Icons.Default.Home,
        unselectedIcon = Icons.Default.Home
    ),
    BottomNavItem(
        title = "Settings",
        route = "settings",
        selectedIcon = Icons.Default.Settings,
        unselectedIcon = Icons.Default.Settings
    ),
    BottomNavItem(

        title = "Notifications",
        route = "notifications",
        selectedIcon = Icons.Default.Notifications,
        unselectedIcon = Icons.Default.Notifications,
        badges = 5
    ),
    BottomNavItem(
        title = "Profile",
        route = "profile",
        selectedIcon = Icons.Default.AccountCircle,
        unselectedIcon = Icons.Default.AccountCircle,
        hasNews = true
    )
)
