package com.example.kyrsovayachernienko

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import androidx.compose.runtime.LaunchedEffect as LaunchedEffect1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val controller = rememberNavController()
            LaunchedEffect1(key1 = true) {
                delay(1200)
                controller.navigate("Session1_2")
            }
            NavHost(navController = controller, startDestination = "Session1_1") {
                composable("Session1_1") { Session1_1(controller) }
                composable("Session1_2") { Session1_2(controller) }
                composable("Session1_3") { Session1_3(controller) }
                composable("Session1_4") { Session1_4(controller) }
                composable("Session2_1") { Session2_1(controller) }
                composable("Session2_2") { Session2_2(controller) }
                composable("Session2_3") { Session2_3(controller) }
                composable("Session2_4") { Session2_4(controller) }
                composable("Session2_5") { Session2_5(controller) }
                composable("Session3_1") { Session3_1(controller) }
                composable("Session3_2") { Session3_2(controller) }
                composable("Session3_3") { Session3_3(controller) }
                composable("Session3_4") { Session3_4(controller) }
                composable("Session3_5") { Session3_5(controller) }
                composable("Session3_6") { Session3_6(controller) }
                composable("Session3_7") { Session3_7(controller) }
            }
        }
    }
}

val robotoFamily = FontFamily(
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold)
)

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
//                    Button(onClick = { controller.navigate("Session1_4") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_skip),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier .clickable {
                                controller.navigate("Session1_4")
                            }
                        )
//                    }
//                    Button(onClick = { controller.navigate("Session1_3") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_next),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier .clickable {
                                controller.navigate("Session1_3")
                            }
                        )
//                    }
                }
            }
        }
    }
}

@Composable
fun Session1_3(controller: NavHostController) {
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
//                    Button(onClick = { controller.navigate("Session1_4") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_skip),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier .clickable {
                                controller.navigate("Session1_4")
                            }
                        )
//                    }
//                    Button(onClick = { controller.navigate("Session1_4") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_next),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier .clickable {
                                controller.navigate("Session1_4")
                            }
                        )
//                    }
                }
            }
        }
    }
}

@Composable
fun Session1_4(controller: NavHostController) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(22.dp, 35.dp, 22.dp, 35.dp)) {

        Row(modifier = Modifier .weight(2.2f)) {
            Image(
                painter = painterResource(id = R.drawable.session1_4_1),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Row(modifier = Modifier
            .weight(2f)
            .fillMaxWidth()) {
            Column(modifier = Modifier .fillMaxSize()) {
                Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp, 12.dp, 12.dp, 0.dp)) {
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
                    .padding(5.dp, 0.dp, 5.dp, 15.dp)) {
//                    Button(onClick = { controller.navigate("Session2_1") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                        Image(
                            painter = painterResource(id = R.drawable.button_signup),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    controller.navigate("Session2_1")
                                }
                        )
//                    }
                }
            }
        }
        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom, modifier = Modifier
            ) {
            Text("Already have an account?",
                fontSize = 14.sp,
                color = Color(167,167,167),
                fontFamily = robotoFamily,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(10.dp, 0.dp)
            )
            Text("Log in",
                fontSize = 14.sp,
                color = Color(5,96,250),
                fontFamily = robotoFamily,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(6.dp, 0.dp)
                    .clickable {
                        controller.navigate("Session2_2")
                    }
            )
        }
    }
}

@Composable
fun Session2_1(controller: NavHostController) {
    Column(
        Modifier
            .padding(20.dp)
            .fillMaxSize()) {
        var login by remember { mutableStateOf("") }
        var phoneNumber by remember { mutableStateOf("") }
        var email by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }
        var passwordVisible by rememberSaveable { mutableStateOf(false) }
        var confirmPassword by rememberSaveable { mutableStateOf("") }
        var confirmPasswordVisible by rememberSaveable { mutableStateOf(false) }
        var checked by remember { mutableStateOf(false) }
        var allChecked by remember { mutableStateOf(false) }

        Text(text = "Create an account", fontSize = 24.sp, fontFamily = robotoFamily, fontWeight = FontWeight.Medium, color = Color(58, 58, 58, 255))
        Text(text = "Complete the sign up process to get started", fontSize = 14.sp, fontFamily = robotoFamily, color = Color(167, 167, 167, 255))
        Column(Modifier.padding(0.dp, 16.dp, 0.dp, 0.dp)) {
            Text(
                text = "Full name",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                color = Color(167, 167, 167, 255)
            )
            OutlinedTextField(
                value = login,
                onValueChange = { login = it },
                label = {
                    Text(
                        "Ivanov Ivan",
                        fontSize = 14.sp,
                        color = Color(167, 167, 167, 255),
                        fontFamily = robotoFamily,
                        modifier = Modifier .fillMaxWidth()
                    ) },
                modifier = Modifier .fillMaxWidth()
            )

            Text(
                text = "Phone Number",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                color = Color(167, 167, 167, 255),
                modifier = Modifier .padding(0.dp, 16.dp, 0.dp, 0.dp)
            )
            OutlinedTextField(
                value = phoneNumber,
                onValueChange = { phoneNumber = it },
                label = {
                    Text(
                        "+7 (999) 999-99-99",
                        fontSize = 14.sp,
                        color = Color(167, 167, 167, 255),
                        fontFamily = robotoFamily,
                        modifier = Modifier .fillMaxWidth()
                    ) },
                modifier = Modifier .fillMaxWidth()
            )

            Text(
                text = "Email Address",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                color = Color(167, 167, 167, 255),
                modifier = Modifier .padding(0.dp, 16.dp, 0.dp, 0.dp)
            )
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = {
                    Text(
                        "***********@gmail.com",
                        fontSize = 14.sp,
                        color = Color(167, 167, 167, 255),
                        fontFamily = robotoFamily,
                        modifier = Modifier .fillMaxWidth()
                    ) },
                modifier = Modifier .fillMaxWidth()
            )

            Text(
                text = "Password",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                color = Color(167, 167, 167, 255),
                modifier = Modifier .padding(0.dp, 16.dp, 0.dp, 0.dp)
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = {
                    Text(
                        "**********",
                        fontSize = 14.sp,
                        color = Color(167, 167, 167, 255),
                        fontFamily = robotoFamily,
                        modifier = Modifier .fillMaxWidth()
                    ) },
                visualTransformation =  if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    val imagep = if (passwordVisible)
                        Icons.Filled.Visibility
                    else Icons.Filled.VisibilityOff

                    val description = if (passwordVisible) "Hide password" else "Show password"

                    IconButton(onClick = {passwordVisible = !passwordVisible}){
                        Icon(imageVector  = imagep, description)
                    }
                },
                modifier = Modifier .fillMaxWidth()
            )

            Text(
                text = "Confirm Password",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                color = Color(167, 167, 167, 255),
                modifier = Modifier .padding(0.dp, 16.dp, 0.dp, 0.dp)
            )
            OutlinedTextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                label = {
                    Text(
                        "**********",
                        fontSize = 14.sp,
                        color = Color(167, 167, 167, 255),
                        fontFamily = robotoFamily,
                        modifier = Modifier .fillMaxWidth()
                    ) },
                visualTransformation =  if (confirmPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    val imagecp = if (confirmPasswordVisible)
                        Icons.Filled.Visibility
                    else Icons.Filled.VisibilityOff

                    val description = if (confirmPasswordVisible) "Hide password" else "Show password"

                    IconButton(onClick = {confirmPasswordVisible = !confirmPasswordVisible}){
                        Icon(imageVector  = imagecp, description)
                    }
                },
                modifier = Modifier .fillMaxWidth()
            )
        }
        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier .fillMaxWidth()) {
            Checkbox(checked = checked, onCheckedChange = { checked = it })
            Text(text = "By ticking this box, you agree to our" + " Terms and conditions and private policy", color = Color(167, 167, 167, 255), fontSize = 12.sp, fontFamily = robotoFamily, textAlign = TextAlign.Center)
        }
        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom, modifier = Modifier
            .fillMaxWidth() ) {
            allChecked = !(login.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() || !checked)
//            Button(onClick = { controller.navigate("Session2_1") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                Image(
                    painter = painterResource(id = if (allChecked) R.drawable.button_signup else R.drawable.button_signup_gray),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(0.dp, 16.dp, 0.dp, 8.dp)
                        .fillMaxWidth()
                        .clickable {
                            if (allChecked) {
                                controller.navigate("Session2_2")
                            }
                        }
                )
//            }
        }
        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom, modifier = Modifier .fillMaxWidth()) {
            Text("Already have an account?",
                fontSize = 14.sp,
                color = Color(167,167,167),
                fontFamily = robotoFamily,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(10.dp, 0.dp)
            )
            Text("Sign in",
                fontSize = 14.sp,
                color = Color(5,96,250),
                fontFamily = robotoFamily,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(6.dp, 0.dp)
                    .clickable {
                        controller.navigate("Session2_2")
                    }
            )
        }
        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom, modifier = Modifier .fillMaxWidth()) {
            Text(
                "or sign in using",
                fontSize = 14.sp,
                color = Color(167, 167, 167),
                fontFamily = robotoFamily,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(0.dp, 0.dp, 4.dp, 0.dp)
            )
            Image(painter = painterResource(id = R.drawable.icons8_google_48), contentDescription = "", modifier = Modifier
                .clickable {}
                .size(18.dp))
        }
    }
}

@Composable
fun Session2_2(controller: NavHostController) {
    Column(
        Modifier
            .padding(20.dp, 80.dp, 20.dp, 20.dp)
            .fillMaxSize()) {
        var email by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }
        var passwordVisible by rememberSaveable { mutableStateOf(false) }
        var checked by remember { mutableStateOf(false) }
        var allChecked by remember { mutableStateOf(false) }

        Text(text = "Welcome Back", fontSize = 24.sp, fontFamily = robotoFamily, fontWeight = FontWeight.Medium, color = Color(58, 58, 58, 255))
        Text(text = "Fill in your email and password to continue", fontSize = 14.sp, fontFamily = robotoFamily, color = Color(167, 167, 167, 255))
        Column(Modifier.padding(0.dp, 16.dp, 0.dp, 0.dp)) {
            Text(
                text = "Email Address",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                color = Color(167, 167, 167, 255),
                modifier = Modifier .padding(0.dp, 16.dp, 0.dp, 0.dp)
            )
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = {
                    Text(
                        "***********@gmail.com",
                        fontSize = 14.sp,
                        color = Color(167, 167, 167, 255),
                        fontFamily = robotoFamily,
                        modifier = Modifier .fillMaxWidth()
                    ) },
                modifier = Modifier .fillMaxWidth()
            )

            Text(
                text = "Password",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                color = Color(167, 167, 167, 255),
                modifier = Modifier .padding(0.dp, 16.dp, 0.dp, 0.dp)
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = {
                    Text(
                        "**********",
                        fontSize = 14.sp,
                        color = Color(167, 167, 167, 255),
                        fontFamily = robotoFamily,
                        modifier = Modifier .fillMaxWidth()
                    ) },
                visualTransformation =  if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    val imagep = if (passwordVisible)
                        Icons.Filled.Visibility
                    else Icons.Filled.VisibilityOff

                    val description = if (passwordVisible) "Hide password" else "Show password"

                    IconButton(onClick = {passwordVisible = !passwordVisible}){
                        Icon(imageVector  = imagep, description)
                    }
                },
                modifier = Modifier .fillMaxWidth()
            )
        }
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Checkbox(checked = checked, onCheckedChange = { checked = it })
                Text(
                    text = "Remember password",
                    color = Color(167, 167, 167, 255),
                    fontSize = 12.sp,
                    fontFamily = robotoFamily,
                    textAlign = TextAlign.Start
                )
                Row(
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Forgot Password?",
                        color = Color(5, 96, 250, 255),
                        fontSize = 12.sp,
                        fontFamily = robotoFamily,
                        textAlign = TextAlign.End,
                        modifier = Modifier.clickable { controller.navigate("Session2_3") })
                }
            }

        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom, modifier = Modifier
            .fillMaxWidth() ) {
            allChecked = !(password.isEmpty() || email.isEmpty())
//            Button(onClick = { controller.navigate("Session2_1") }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 0)),) {
                Image(
                    painter = painterResource(id = if (allChecked) R.drawable.button_login else R.drawable.button_login_gray),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            if (allChecked) {
                                controller.navigate("Session3_1")
                            }
                        }
                )
//            }
        }
        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom, modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 10.dp, 0.dp, 0.dp)) {
            Text("Already have an account?",
                fontSize = 14.sp,
                color = Color(167,167,167),
                fontFamily = robotoFamily,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(10.dp, 0.dp)
            )
            Text("Sign up",
                fontSize = 14.sp,
                color = Color(5,96,250),
                fontFamily = robotoFamily,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(6.dp, 0.dp)
                    .clickable {
                        controller.navigate("Session2_2")
                    }
            )
        }
        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom, modifier = Modifier .fillMaxWidth()) {
            Text(
                "or sign in using",
                fontSize = 14.sp,
                color = Color(167, 167, 167),
                fontFamily = robotoFamily,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(0.dp, 0.dp, 4.dp, 0.dp)
            )
            Image(painter = painterResource(id = R.drawable.icons8_google_48), contentDescription = "", modifier = Modifier
                .clickable {}
                .size(18.dp))
        }
    }
}

@Composable
fun Session2_3(controller: NavHostController) {
    Column(
        Modifier
            .padding(20.dp, 80.dp, 20.dp, 20.dp)
            .fillMaxSize()
    ) {
        var email by rememberSaveable { mutableStateOf("") }
        var allChecked by remember { mutableStateOf(false) }

        Text(
            text = "Forgot Password",
            fontSize = 24.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium,
            color = Color(58, 58, 58, 255)
        )
        Text(
            text = "Enter your email address",
            fontSize = 14.sp,
            fontFamily = robotoFamily,
            color = Color(167, 167, 167, 255)
        )
        Column(Modifier.padding(0.dp, 16.dp, 0.dp, 0.dp)) {
            Text(
                text = "Email Address",
                fontSize = 14.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                color = Color(167, 167, 167, 255),
                modifier = Modifier.padding(0.dp, 16.dp, 0.dp, 0.dp)
            )
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = {
                    Text(
                        "***********@gmail.com",
                        fontSize = 14.sp,
                        color = Color(167, 167, 167, 255),
                        fontFamily = robotoFamily,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 60.dp, 0.dp, 20.dp)
            ) {
                allChecked = email.isNotEmpty()
                Image(
                    painter = painterResource(id = if (allChecked) R.drawable.button_sengotp else R.drawable.button_sengotp_gray),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            if (allChecked) {
                                controller.navigate("Session2_4")
                            }
                        }
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
            ) {
                Text(
                    "Remember password? Back to ",
                    fontSize = 14.sp,
                    color = Color(167, 167, 167),
                    fontFamily = robotoFamily,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(10.dp, 0.dp)
                )
                Text("Sign in",
                    fontSize = 14.sp,
                    color = Color(5, 96, 250),
                    fontFamily = robotoFamily,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(6.dp, 0.dp)
                        .clickable {
                            controller.navigate("Session2_2")
                        }
                )
            }
        }
    }
}

@Composable
fun Session2_4(controller: NavHostController) {
    var numb by remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current
    val focusRequesters = remember {
        List(6) { mutableStateOf(FocusRequester()) }
    }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize()
    ) {
        Column(Modifier.padding(top = 25.dp)) {
            Text(
                text = "OTP Verification",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Enter the 6 digit numbers sent to your email",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
        Row(Modifier.padding(top = 52.dp)) {
            repeat(6) { index ->
                OutlinedTextField(
                    value = numb,
                    onValueChange = {
                        numb = it
                        if (it.length == 1) { // Переход при заполнении 1 символа
                            focusManager.moveFocus(FocusDirection.Next)
                        }
                    },
                    maxLines = 1,
                    modifier = Modifier
                        .padding(end = if (index != 5) 30.dp else 0.dp)//end = if(numb.toInt() != 6) 30.dp else 0.dp)
                        .size(32.dp)
                        .focusRequester(focusRequesters[index].value),
                    keyboardOptions = KeyboardOptions(imeAction = androidx.compose.ui.text.input.ImeAction.Next),
                    keyboardActions = KeyboardActions(
                        onNext = { focusManager.moveFocus(FocusDirection.Next) }
                    )
                )
            }
        }

        Text(
            text = "If you didn’t receive code, resend after 1:00",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 30.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            Modifier
                .fillMaxWidth()
                .padding(top = 52.dp),
            colors = ButtonDefaults.buttonColors(Color.Gray, contentColor = Color.White)
        )
        {
            Text(
                text = "Set New Password   ", Modifier.padding(5.dp),
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun Session2_5(controller: NavHostController) {
    var password by remember { mutableStateOf("") }
    var confirm_password by remember { mutableStateOf("") }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize()
    ) {
        Column(Modifier.padding(top = 25.dp)) {
            Text(
                text = "New Password",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Enter new password",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
        Column(modifier = Modifier.padding(bottom = 24.dp, top = 70.dp))
        {
            Text(
                text = "Password",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp, color = Color.Gray
            )
            OutlinedTextField(
                value = password, onValueChange = { password = it },
                label = {
                    Text(
                        text = "*************",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(44.dp),
                singleLine = true
            )
        }
        Column(modifier = Modifier.padding(bottom = 24.dp))
        {
            Text(
                text = "Confirm Password",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.Gray
            )
            OutlinedTextField(
                value = confirm_password, onValueChange = { confirm_password = it },
                label = {
                    Text(
                        text = "*************",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(44.dp),
                singleLine = true
            )
        }
        Button(
            onClick = { /*TODO*/ },
            Modifier
                .fillMaxWidth()
                .padding(top = 47.dp),
            colors = ButtonDefaults.buttonColors(Color.Gray, contentColor = Color.White)
        )
        {
            Text(
                text = "Log In", Modifier.padding(5.dp),
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun Session3_1(controller: NavHostController) {
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize()
    )
    {
        Column(Modifier.weight(0.9f)) {

        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(0.07f),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceAround) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.home_true),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.clickable { controller.navigate("Session3_1") }
            )
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.wallet_false),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.clickable {  }
            )
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.track_false),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.clickable { }
            )
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.profile_false),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.clickable { controller.navigate("Session3_2") }
            )
        }
    }
}

@Composable
fun Session3_2(controller: NavHostController) {
    val darkmode = remember { mutableStateOf(false) }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize()
    )
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(0.25f)
                .fillMaxSize())
        {
            Text(text = "Profile",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier.weight(0.1f))
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .width(1.dp),
                color = Color.Gray
            )

            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(0.25f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween)
            {
                Image(
                    painter = painterResource(id = R.drawable.profileimg),
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .weight(0.12f),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                )
                Column(
                    Modifier
                        .weight(0.5f)
                        .padding(start = 10.dp)) {
                    Text(
                        text = "Hello Ken",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp
                    )
                    Text(
                        text = "Current balance:N10,712:00",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp
                    )
                }
                Icon(ImageVector.vectorResource(id = R.drawable.eye_slash),
                    contentDescription = "",
                    modifier = Modifier.weight(0.05f))
            }

            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.1f))
            {
                Text(text = "Enable dark Mode",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp)
                Switch(
                    checked = darkmode.value,
                    onCheckedChange = { darkmode.value = it }
                )
            }
        }
        Row(
            Modifier
                .padding(bottom = 10.dp)
                .weight(0.1f)
                .shadow(elevation = 3.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Icon(Icons.Default.Person,
                contentDescription = "",
                modifier = Modifier.weight(0.1f))
            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 10.dp)) {
                Text(
                    text = "Edit Profile",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
                Text(
                    text = "Name, phone no, address, email ...",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier
                    .weight(0.1f)
                    .padding(end = 5.dp))
        }
        Row(
            Modifier
                .padding(bottom = 10.dp)
                .weight(0.1f)
                .shadow(elevation = 3.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_outline_book_24),
                contentDescription = "",
                modifier = Modifier.weight(0.1f))
            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 10.dp)) {
                Text(
                    text = "Statements & Reports",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
                Text(
                    text = "Download transaction details, orders, deliveries",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,
                    fontSize = 10.sp
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier
                    .weight(0.1f)
                    .padding(end = 5.dp))
        }
        Row(
            Modifier
                .padding(bottom = 10.dp)
                .weight(0.1f)
                .clickable { controller.navigate("Session3_4") }
                .shadow(elevation = 3.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.bell),
                contentDescription = "",
                modifier = Modifier.weight(0.1f))
            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 10.dp)) {
                Text(
                    text = "Notification Settings",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
                Text(
                    text = "mute, unmute, set location & tracking setting",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.sp,
                    color = Color.Gray
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier
                    .weight(0.1f)
                    .padding(end = 5.dp))

        }
        Row(
            Modifier
                .padding(bottom = 10.dp)
                .weight(0.1f)
                .clickable { controller.navigate("Session3_3") }
                .shadow(elevation = 3.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.money),
                contentDescription = "",
                modifier = Modifier.weight(0.1f))
            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 10.dp)) {
                Text(
                    text = "Card & Bank account settings",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
                Text(
                    text = "change cards, delete card details",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier
                    .weight(0.1f)
                    .padding(end = 5.dp))
        }
        Row(
            Modifier
                .padding(bottom = 10.dp)
                .weight(0.1f)
                .shadow(elevation = 3.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.two_person),
                contentDescription = "",
                modifier = Modifier.weight(0.1f))
            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 10.dp)) {
                Text(
                    text = "Referrals",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
                Text(
                    text = "check no of friends and earn",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier
                    .weight(0.1f)
                    .padding(end = 5.dp))
        }
        Row(
            Modifier
                .padding(bottom = 10.dp)
                .weight(0.1f)
                .shadow(elevation = 3.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.map),
                contentDescription = "",
                modifier = Modifier.weight(0.1f))
            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 10.dp)) {
                Text(
                    text = "About Us",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
                Text(
                    text = "know more about us, terms and conditions",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier
                    .weight(0.1f)
                    .padding(end = 5.dp))
        }
        Row(
            Modifier
                .padding(bottom = 10.dp)
                .weight(0.1f)
                .clickable { controller.navigate("Session7") }
                .shadow(elevation = 3.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.exit),
                contentDescription = "",
                modifier = Modifier.weight(0.1f),
                tint = Color.Unspecified)
            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 10.dp)
                    ) {
                Text(
                    text = "Log Out",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier
                    .weight(0.1f)
                    .padding(end = 5.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(0.08f),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceAround)
        {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.home_false),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.clickable { controller.navigate("Session3_1") }
            )
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.wallet_false),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.clickable {  }
            )
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.track_false),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.clickable {  }
            )
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.profile_true),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.clickable { controller.navigate("Session3_2") }
            )
        }
    }
}

@Composable
fun Session3_3(controller: NavHostController) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(10.dp)) {
        Row(
            Modifier
                .weight(0.09f)
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.back_blue),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier
                    .clickable { controller.navigate("Session3_2") }
                    .weight(0.1f))
            Text(text = "Add Payment method",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f))
        }
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .width(1.dp),
            color = Color.Gray
        )
        Column(Modifier.weight(0.9f)) {

        }
    }
}

@Composable
fun Session3_4(controller: NavHostController) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(10.dp)) {
        Row(
            Modifier
                .weight(0.09f)
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.back_blue),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier
                    .clickable { controller.navigate("Session3_2") }
                    .weight(0.1f))
            Text(text = "Notification",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f))
        }
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .width(1.dp),
            color = Color.Gray
        )
        Column(
            Modifier
                .weight(0.9f)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.bell),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier
                    .weight(0.1f)
                    .size(83.dp)
                    .weight(1f))
            Text(text = "You have no notifications",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                modifier = Modifier.weight(0.4f))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Session3_5(controller: NavHostController) {
    var o_address by remember { mutableStateOf("") }
    var o_state by remember { mutableStateOf("") }
    var o_phone by remember { mutableStateOf("") }
    var o_others by remember { mutableStateOf("") }
    var d_address by remember { mutableStateOf("") }
    var d_state by remember { mutableStateOf("") }
    var d_phone by remember { mutableStateOf("") }
    var d_others by remember { mutableStateOf("") }

    var p_items by remember { mutableStateOf("") }
    var itemkg by remember { mutableStateOf("") }
    var w_items by remember { mutableStateOf("") }
    Column(
        Modifier
            .fillMaxSize()
            .padding(10.dp)) {
        Row(
            Modifier
                .weight(0.09f)
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.back_blue),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier
                    .clickable { }
                    .weight(0.1f))
            Text(text = "Send a package",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f))
        }
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .width(1.dp),
            color = Color.Gray
        )
        Column(
            Modifier
                .weight(0.9f)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top)
        {
            Column(Modifier
                .weight(0.3f)) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)) {
                    Icon(imageVector = ImageVector.vectorResource(R.drawable.point),
                        "",
                        tint = Color.Unspecified,
                        modifier = Modifier.padding(end = 5.dp))
                    Text(text = "Origin Details",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp)
                }
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp)) {
                    TextField(
                        value = o_address, onValueChange = { o_address = it },
                        label = {
                            Text(
                                text = "Address",
                                fontFamily = robotoFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                color = Color.Gray,

                                )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.1f)
                            .padding(top = 4.dp, bottom = 4.dp),
                        singleLine = true,
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedContainerColor = Color.White,
                            focusedTextColor = Color.White,
                        )
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                    )
                    TextField(
                        value = o_state, onValueChange = { o_state = it },
                        label = {
                            Text(
                                text = "State,Country",
                                fontFamily = robotoFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.1f)
                            .padding(top = 4.dp, bottom = 4.dp),
                        singleLine = true,
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedContainerColor = Color.White,
                            focusedTextColor = Color.White,
                        )
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                    )
                    TextField(
                        value = o_phone, onValueChange = { o_phone = it },
                        label = {
                            Text(
                                text = "Phone number",
                                fontFamily = robotoFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.1f)
                            .padding(top = 4.dp, bottom = 4.dp),
                        singleLine = true,
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedContainerColor = Color.White,
                            focusedTextColor = Color.White,
                        )
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                    )
                    TextField(
                        value = o_others, onValueChange = { o_others = it },
                        label = {
                            Text(
                                text = "Others",
                                fontFamily = robotoFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.1f)
                            .padding(top = 4.dp, bottom = 4.dp),
                        singleLine = true,
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedContainerColor = Color.White,
                            focusedTextColor = Color.White,
                        )
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                    )
                }
            }
            Column(Modifier.padding(top = 10.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)) {
                    Icon(imageVector = ImageVector.vectorResource(R.drawable.point2),
                        "",
                        tint = Color.Unspecified,
                        modifier = Modifier.padding(end = 5.dp))
                    Text(text = "Destination Details",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp)
                }
                TextField(
                    value = d_address, onValueChange = { d_address = it },
                    label = {
                        Text(
                            text = "Address",
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp),
                    singleLine = true,
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                )
                TextField(
                    value = d_state, onValueChange = { d_state = it },
                    label = {
                        Text(
                            text = "State,Country",
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp),
                    singleLine = true,
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                )
                TextField(
                    value = d_phone, onValueChange = { d_phone = it },
                    label = {
                        Text(
                            text = "Phone number",
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp),
                    singleLine = true,
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                )
                TextField(
                    value = d_others, onValueChange = { d_others = it },
                    label = {
                        Text(
                            text = "Others",
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp),
                    singleLine = true,
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                )
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)) {
                    Icon(imageVector = ImageVector.vectorResource(R.drawable.plus),
                        "",
                        tint = Color.Unspecified,
                        modifier = Modifier.padding(end = 5.dp))
                    Text(text = "Add destination",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        color = Color.Gray)
                }
            }
            Column(Modifier.padding(top = 10.dp)) {
                Text(text = "Package Details",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp)
                TextField(
                    value = p_items, onValueChange = { p_items = it },
                    label = {
                        Text(
                            text = "package items",
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp),
                    singleLine = true,
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                )
                TextField(
                    value = itemkg, onValueChange = { itemkg = it },
                    label = {
                        Text(
                            text = "Weight of item(kg)",
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp),
                    singleLine = true,
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                )
                TextField(
                    value = w_items, onValueChange = { w_items = it },
                    label = {
                        Text(
                            text = "Worth of Items",
                            fontFamily = robotoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp),
                    singleLine = true,
//                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                )
            }
            Text(text = "Select delivery type",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                modifier = Modifier.padding(vertical = 20.dp))
            Row(verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()) {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.button_instant),
                    contentDescription = "",
                    tint = Color.Unspecified,
                    modifier = Modifier.padding(end = 40.dp))
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.button_schedule),
                    contentDescription = "",
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .height(75.dp)
                        .width(159.dp))
            }
        }
    }
}

@Composable
fun Session3_6(controller: NavHostController) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Row(
            Modifier
                .weight(0.09f)
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.back_blue),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier
                    .clickable { }
                    .weight(0.1f))
            Text(
                text = "Send a package",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )
        }
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .width(1.dp)
                .padding(bottom = 30.dp),
            color = Color.Gray
        )
        Column(
            Modifier
                .weight(1f)
                .padding(bottom = 5.dp)
        )
        {
            Column(Modifier.padding(bottom = 5.dp)) {
                Text(
                    text = "Package Information",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    color = Color.Blue,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = "Origin details",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                )
                Text(
                    text = "Mbaraugba, Ovom Amaa Asaa, Abia state",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Text(
                    text = "+234 56543 96854",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Column(Modifier.padding(bottom = 5.dp)) {
                Text(
                    text = "Destination details",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                )
                Text(
                    text = "19 Ademola Alabi close, lagos ",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Text(
                    text = "+234 70644 80655",
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Text(
                text = "Other details",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Column(Modifier.fillMaxWidth()) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Package Items",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "Books ans stationary, Garri Ngwa",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Yellow
                    )
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Weight of items",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "1000kg",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Yellow
                    )
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Worth of Items",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "N50,000",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Yellow
                    )
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 35.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Tracking Number",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "R-7458-4567-4434-5854",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Yellow
                    )
                }

            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .width(1.dp),
                color = Color.Gray
            )
            Text(
                text = "Charges",
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color.Blue,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Column(Modifier.fillMaxWidth()) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Delivery Charges",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "N2,500.00",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Yellow
                    )
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Instant delivery",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "N300.00",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Yellow
                    )
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Tax and Service Charges",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "N200.00",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Yellow
                    )
                }
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(1.dp)
                        .padding(bottom = 5.dp),
                    color = Color.Gray
                )
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Package total",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "N3000.00",
                        fontFamily = robotoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Yellow
                    )
                }

            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.botton_edit),
                contentDescription = "",
                tint = Color.Unspecified
            )
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.button_make),
                contentDescription = "",
                tint = Color.Unspecified
            )

        }
    }
}

@Composable
fun Session3_7(controller: NavHostController) {
    Column(Modifier.fillMaxSize()) {
        Icon(imageVector = ImageVector.vectorResource(id = R.drawable.button_trackmyitem),
            contentDescription = "",
            tint = Color.Unspecified)
        Icon(imageVector = ImageVector.vectorResource(id = R.drawable.button_goback),
            contentDescription = "",
            tint = Color.Unspecified)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview() {
    val controller = rememberNavController()
    LaunchedEffect1(key1 = true) {
        delay(1200)
        controller.navigate("Session1_2")
    }
    NavHost(navController = controller, startDestination = "Session2_5") {
        composable("Session1_1") { Session1_1(controller) }
        composable("Session1_2") { Session1_2(controller) }
        composable("Session1_3") { Session1_3(controller) }
        composable("Session1_4") { Session1_4(controller) }
        composable("Session2_1") { Session2_1(controller) }
        composable("Session2_2") { Session2_2(controller) }
        composable("Session2_3") { Session2_3(controller) }
        composable("Session2_4") { Session2_4(controller) }
        composable("Session2_5") { Session2_5(controller) }
        composable("Session3_1") { Session3_1(controller) }
        composable("Session3_2") { Session3_2(controller) }
        composable("Session3_3") { Session3_3(controller) }
        composable("Session3_4") { Session3_4(controller) }
        composable("Session3_5") { Session3_5(controller) }
        composable("Session3_6") { Session3_6(controller) }
        composable("Session3_7") { Session3_7(controller) }
    }
}