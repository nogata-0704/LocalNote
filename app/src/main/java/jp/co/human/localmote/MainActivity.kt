package jp.co.human.localmote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import jp.co.human.localmote.ui.theme.LocalMoteTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LocalMoteTheme() {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(){
    Column() {
        Text(
            text = "nogata syota"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    LocalMoteTheme() {
        MainScreen()
    }
}