@file:OptIn(ExperimentalMaterial3Api::class)
@file:Suppress("OPT_IN_IS_NOT_ENABLED") // is enabled, check build.gradle

package pl.jpiechaczek.skeletonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.jpiechaczek.skeletonapp.ui.theme.SkeletonAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SkeletonAppTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text("Hello there, Jetpack Compose.")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SkeletonAppTheme(isDynamicColor = false, isDarkTheme = true) {
        MainScreen()
    }
}