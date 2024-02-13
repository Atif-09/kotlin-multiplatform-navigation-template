import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import navigation.NavEnumClass
import navigation.NavObject

@Composable
fun SecondScreen() {
    Box(Modifier.fillMaxSize()) {

        Column(modifier = Modifier.align(Alignment.Center)) {

            Text("You are in 2nd Screen", modifier = Modifier.padding(12.dp))
            Button(onClick = {
                NavObject.currentScreen.value = NavEnumClass.SCREENFIRST
            },
                modifier = Modifier
            ) {
                Text("Go to 1st Screen")
            }
        }

    }
}