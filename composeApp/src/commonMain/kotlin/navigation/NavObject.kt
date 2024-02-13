package navigation

import androidx.compose.runtime.mutableStateOf

object NavObject {
    var currentScreen = mutableStateOf(NavEnumClass.SCREENFIRST)

    fun switchPages(){
        if (currentScreen.value == NavEnumClass.SCREENFIRST){
            currentScreen.value = NavEnumClass.SCREENSECOND
        } else {
            currentScreen.value = NavEnumClass.SCREENFIRST
        }

    }
}