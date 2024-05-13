package com.example.kyrsovayachernienko

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    val robotoFamily = FontFamily(
        Font(R.font.roboto_light, FontWeight.Light),
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_bold, FontWeight.Bold)
    )
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(22.dp, 35.dp, 22.dp, 35.dp)) {

        Row(modifier = Modifier .weight(2f)) {
            Image(
                painter = painterResource(id = R.drawable.session1_2_1),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
        Row(modifier = Modifier
            .weight(2f)
            .fillMaxWidth()) {
            Column(modifier = Modifier .fillMaxSize()) {
                Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)) {
                    Column {
                        Text("Quick Delivery At Your Doorstep",
                            fontSize = 25.sp,
                            color = Color(5, 96, 250),
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                        )
                        Text("Enjoy quick pick-up and delivery to your destination",
                            fontSize = 15.sp,
                            color = Color(58,58,58),
                            fontFamily = robotoFamily,
                            textAlign = TextAlign.Center,
                        )
                    }

                }
                Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom, modifier = Modifier.fillMaxWidth()) {
                    Button(onClick = { controller.navigate("Session1_4") }, shape = RectangleShape,) {

                    }
                    Button(onClick = { controller.navigate("Session1_3") }, shape = RectangleShape,) {

                    }
                }
            }
        }
    }
}

@Composable
fun Session1_3(controller: NavHostController) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier .fillMaxSize()) {

    }
}

@Composable
fun Session1_4(controller: NavHostController) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier .fillMaxSize()) {

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    val controller = rememberNavController()
    LaunchedEffect(key1 = true) {
        delay(1200)
        controller.navigate("Session1_2")
    }
    NavHost(navController = controller, startDestination = "Session1_2") {
        composable("Session1_1") { Session1_1(controller) }
        composable("Session1_2") { Session1_2(controller) }
        composable("Session1_3") { Session1_3(controller) }
        composable("Session1_4") { Session1_4(controller) }
    }
}