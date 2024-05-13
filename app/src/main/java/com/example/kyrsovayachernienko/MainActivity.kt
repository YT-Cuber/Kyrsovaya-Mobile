package com.example.kyrsovayachernienko

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Preview()
        }
    }
}

@Composable
fun Session1_1(controller: NavHostController) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier .fillMaxSize()
    ) {
        Button(
            onClick = { (controller.navigate("Session1_2")) },
            colors = ButtonDefaults.buttonColors(Color.White),
            shape = RectangleShape,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.session1_1),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
fun Session1_2(controller: NavHostController) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier .fillMaxSize()) {
        Text(text = "NEW PAGE")

    }
}

//@Composable
//fun Session1_3(controller: NavHostController) {
//    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier .fillMaxSize()) {
//        Image(painter = painterResource(id = R.drawable.session1_1),
//            contentDescription = "",
//            Modifier.scale(3f))
//    }
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    val controller = rememberNavController()
    LaunchedEffect(key1 = true) {
        delay(1200)
        controller.navigate("Session1_2")
    }
    NavHost(navController = controller, startDestination = "Session1_1") {
        composable("Session1_1") { Session1_1(controller) }
        composable("Session1_2") { Session1_2(controller) }
//        composable("Session1_3") { Session1_3(controller) }
    }
}