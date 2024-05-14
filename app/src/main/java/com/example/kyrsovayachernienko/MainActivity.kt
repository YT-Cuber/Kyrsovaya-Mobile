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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
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
                            fontSize = 24.sp,
                            color = Color(5, 96, 250),
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                        )
                        Text("Enjoy quick pick-up and delivery to your destination",
                            fontSize = 16.sp,
                            color = Color(58,58,58),
                            fontFamily = robotoFamily,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        )
                    }

                }
                Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom, modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp, 0.dp, 5.dp, 30.dp)) {
                    Button(onClick = { controller.navigate("Session1_4") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_skip),
                            contentDescription = "",
                        )
                    }
                    Button(onClick = { controller.navigate("Session1_3") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_next),
                            contentDescription = "",
                            
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Session1_3(controller: NavHostController) {
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

        Row(modifier = Modifier .weight(2.2f)) {
            Image(
                painter = painterResource(id = R.drawable.session1_3_1),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
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
                        Text("Flexible Payment",
                            fontSize = 24.sp,
                            color = Color(5, 96, 250),
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier .fillMaxWidth()
                        )
                        Text("Different modes of payment either before and after delivery without stress",
                            fontSize = 16.sp,
                            color = Color(58,58,58),
                            fontFamily = robotoFamily,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        )
                    }
                }
                Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom, modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp, 0.dp, 5.dp, 30.dp)) {
                    Button(onClick = { controller.navigate("Session1_4") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_skip),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds
                        )
                    }
                    Button(onClick = { controller.navigate("Session1_4") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_next),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Session1_4(controller: NavHostController) {
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

        Row(modifier = Modifier .weight(2.2f)) {
            Image(
                painter = painterResource(id = R.drawable.session1_4_1),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
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
                        Text("Real-time Tracking",
                            fontSize = 24.sp,
                            color = Color(5, 96, 250),
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier .fillMaxWidth()
                        )
                        Text("Track your packages/items from the comfort of your home till final destination",
                            fontSize = 16.sp,
                            color = Color(58,58,58),
                            fontFamily = robotoFamily,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        )
                    }
                }
                Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom, modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp, 0.dp, 5.dp, 30.dp)) {
                    Button(onClick = { controller.navigate("Session2_1") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_signup),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier .fillMaxWidth()
                        )
                    }
                }
                Row {
                    Text("Already have an account?",
                        fontSize = 16.sp,
                        color = Color(58,58,58),
                        fontFamily = robotoFamily,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(10.dp, 0.dp)
                    )
                    Button(onClick = { controller.navigate("Session2_1") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Text("Sign in",
                            fontSize = 16.sp,
                            color = Color(58,58,58),
                            fontFamily = robotoFamily,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        )
                    }
                }
            }
        }
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
    NavHost(navController = controller, startDestination = "Session1_4") {
        composable("Session1_1") { Session1_1(controller) }
        composable("Session1_2") { Session1_2(controller) }
        composable("Session1_3") { Session1_3(controller) }
        composable("Session1_4") { Session1_4(controller) }
    }
}