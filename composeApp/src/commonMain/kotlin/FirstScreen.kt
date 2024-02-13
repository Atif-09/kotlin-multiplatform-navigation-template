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
fun FirstScreen() {
    Box(Modifier.fillMaxSize()){
        Column(modifier = Modifier.align(Alignment.Center)) {

            Text("You are in 1st Screen", modifier = Modifier.padding(12.dp))
            Button(onClick = {
                NavObject.currentScreen.value = NavEnumClass.SCREENSECOND
            },
                modifier = Modifier
            ) {
                Text("Go to 2nd Screen")
            }
        }

    }
}