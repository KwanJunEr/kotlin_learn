package eu.example.unitconverter

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import eu.example.unitconverter.ui.theme.UnitConverterTheme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}

@Composable
fun UnitConverter(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        //Here all the UI elements will be stacked below each other
        Text("Unit Converter", modifier = Modifier.padding(100.dp) )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {
            //Here goes what should happen, when the Value of Our Outline has been changed
        } )
        Spacer(modifier = Modifier.height(16.dp))
        Row{
            Box{
                Button(onClick={}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = { /*TODO*/ })
                    DropdownMenuItem(
                        text = {Text("Meters")},
                        onClick = { /*TODO*/ })
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = { /*TODO*/ })
                    DropdownMenuItem(
                        text = {Text("Milimeters")},
                        onClick = { /*TODO*/ })
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box{
                Button(onClick={}){
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = { /*TODO*/ })
                    DropdownMenuItem(
                        text = {Text("Meters")},
                        onClick = { /*TODO*/ })
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = { /*TODO*/ })
                    DropdownMenuItem(
                        text = {Text("Milimeters")},
                        onClick = { /*TODO*/ })
                }
            }
            //Creation of Toast
//            val context = LocalContext.current  //needed when need to use a toast
//            Button(onClick = { Toast.makeText(context, "Thanks for clicking!",
//                Toast.LENGTH_LONG ).show()}) {
//                Text("Click Me!")
//            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Result: ")
    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview(){
    UnitConverter()
}
