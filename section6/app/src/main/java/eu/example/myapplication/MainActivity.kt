package eu.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import eu.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }
}


@Composable
fun CaptainGame(){
    //keep track of treasures collected
    var treasureFound by remember { //use by to get the values
        mutableStateOf(0)
    }
    val direction = remember{ mutableStateOf("North")}
    val stormOrTreasure = remember{mutableStateOf("")}
    Column{
        Text(text = "Treasure Found : ${treasureFound} ")
        Text(text = "Current Direction : ${direction.value} ")//access value of the variable
        Text(text = "Storm or Treasure:  ${stormOrTreasure.value}")
        Button(onClick = {
            direction.value = "East"
            if(Random.nextBoolean()){
                treasureFound += 1
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        }) {
            Text(text = "Sail East")
        }

        Button(onClick = {
            direction.value = "West"
            if(Random.nextBoolean()){
                treasureFound += 1;
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        }) {
            Text(text = "Sail West")
        }


        Button(onClick = {
            direction.value = "North"
            if(Random.nextBoolean()){
                treasureFound += 1;
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        }) {
            Text(text = "Sail North")
        }

        Button(onClick = {
            direction.value = "South"
            stormOrTreasure.value = "Found a Treasure!"
            if(Random.nextBoolean()){
                treasureFound += 1;
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        }) {
            Text(text = "Sail South")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        CaptainGame()
    }
}