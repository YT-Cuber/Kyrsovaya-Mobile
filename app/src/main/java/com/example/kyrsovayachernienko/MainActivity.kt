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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
    val robotoFamily = FontFamily(
        Font(R.font.roboto_light, FontWeight.Light),
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_bold, FontWeight.Bold)
    )
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
    val robotoFamily = FontFamily(
        Font(R.font.roboto_light, FontWeight.Light),
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_bold, FontWeight.Bold)
    )
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
                            if (allChecked) { controller.navigate("Session3_1") }
                        }
                )
//            }
        }
        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom, modifier = Modifier .fillMaxWidth() .padding(0.dp, 10.dp, 0.dp, 0.dp)) {
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
    val robotoFamily = FontFamily(
        Font(R.font.roboto_light, FontWeight.Light),
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_bold, FontWeight.Bold)
    )
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
            Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom, modifier = Modifier
                .fillMaxWidth() .padding(0.dp, 60.dp, 0.dp, 20.dp)) {
                allChecked = email.isNotEmpty()
                Image(
                    painter = painterResource(id = if (allChecked) R.drawable.button_sengotp else R.drawable.button_sengotp_gray),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            if (allChecked) { controller.navigate("Session3_1") }
                        }
                )
            }
            Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom, modifier = Modifier .fillMaxWidth() .padding(0.dp, 10.dp, 0.dp, 0.dp)) {
                Text("Remember password? Back to ",
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
        }
    }
}


@Composable
fun Session2_4(controller: NavHostController) {
    val robotoFamily = FontFamily(
        Font(R.font.roboto_light, FontWeight.Light),
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_bold, FontWeight.Bold)
    )

}

@Composable
fun Session2_5(controller: NavHostController) {
    val robotoFamily = FontFamily(
        Font(R.font.roboto_light, FontWeight.Light),
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_bold, FontWeight.Bold)
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    val controller = rememberNavController()
    LaunchedEffect1(key1 = true) {
        delay(1200)
        controller.navigate("Session1_2")
    }
    NavHost(navController = controller, startDestination = "Session2_3") {
        composable("Session1_1") { Session1_1(controller) }
        composable("Session1_2") { Session1_2(controller) }
        composable("Session1_3") { Session1_3(controller) }
        composable("Session1_4") { Session1_4(controller) }
        composable("Session2_1") { Session2_1(controller) }
        composable("Session2_2") { Session2_2(controller) }
        composable("Session2_3") { Session2_3(controller) }
        composable("Session2_4") { Session2_4(controller) }
        composable("Session2_5") { Session2_5(controller) }
    }
}