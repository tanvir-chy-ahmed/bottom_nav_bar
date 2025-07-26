package com.tax.xor.nex.tan.bnview

import android.annotation.SuppressLint
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tax.xor.nex.tan.screens.Home
import com.tax.xor.nex.tan.screens.Notifications
import com.tax.xor.nex.tan.screens.Profile
import com.tax.xor.nex.tan.screens.Settings
import com.tax.xor.nex.tan.ui.theme.GreenJC


@SuppressLint("AutoboxingStateCreation", "ComposableNaming")
@Preview
@Composable
fun bnview() {
    var selected by remember { mutableStateOf(0) }
    val navController = rememberNavController()
    Scaffold(

        bottomBar = {
            NavigationBar(containerColor = GreenJC) {
                bottomNavItems.forEachIndexed { index, bottomNavItem ->
                    NavigationBarItem(
                        selected = index == selected,
                        onClick = {
                            selected = index
                            navController.navigate(bottomNavItem.route)
                        },
                        icon = {
                            BadgedBox(
                                badge = {
                                    when {
                                        bottomNavItem.badges > 0 -> {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        }

                                        bottomNavItem.hasNews -> {
                                            Badge()
                                        }
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = bottomNavItem.selectedIcon,
                                    contentDescription = bottomNavItem.title
                                )
                            }
                        },
                        label = {
                            Text(text = bottomNavItem.title)
                        }
                    )
                }
            }
        }
    ) { paddingValues ->

        NavHost(navController = navController, startDestination = "home") {
            composable("home") { Home() }
            composable("settings") { Settings() }
            composable("notifications") { Notifications() }
            composable("profile") { Profile() }
        }

    }
}
