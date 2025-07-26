package com.tax.xor.nex.tan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.tax.xor.nex.tan.bnview.bnview
import com.tax.xor.nex.tan.ui.theme.BottomNavBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BottomNavBarTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    bnview()
//                    NavGraph()


                }
            }
        }
    }
}

