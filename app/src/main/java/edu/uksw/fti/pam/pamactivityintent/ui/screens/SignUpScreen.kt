package edu.uksw.fti.pam.pamactivityintent.ui.screens

import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pamactivityintent.DataStore.FirstName
import edu.uksw.fti.pam.pamactivityintent.DataStore.LastName
import edu.uksw.fti.pam.pamactivityintent.HomeActivity
import edu.uksw.fti.pam.pamactivityintent.MainActivity
import edu.uksw.fti.pam.pamactivityintent.R
import kotlinx.coroutines.launch

//import android.content.Intent
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.Button
//import androidx.compose.material.Text
//import androidx.compose.material.TextField
//import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.input.PasswordVisualTransformation
//import androidx.compose.ui.unit.dp
//import edu.uksw.fti.pam.pamactivityintent.HomeActivity
//import edu.uksw.fti.pam.pamactivityintent.MainActivity
//import edu.uksw.fti.pam.pamactivityintent.R
//
//@Composable
//fun SignUpForm(btnOnClickAction: (String?) -> Unit) {
//    val lContext = LocalContext.current
//    var firstName by remember { mutableStateOf("") }
//    var lastName by remember { mutableStateOf("") }
//    var usernameInput by remember { mutableStateOf("") }
//    var passwordInput by remember { mutableStateOf("") }
//    var cPassword by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(20.dp),
//        verticalArrangement = Arrangement.spacedBy(8.dp)
//    ) {
//        Row(
//            modifier = Modifier
//                .padding(start = 0.dp, top = 0.dp),
//            horizontalArrangement = Arrangement.spacedBy(5.dp)
//        ) {
//            TextField(
//                value = firstName.toString(),
//                onValueChange = { firstName = it },
//                label = { Text(text = stringResource(R.string.label_first)) },
//                modifier = Modifier
//                    .width(160.dp)
//            )
//            TextField(
//                value = lastName.toString(),
//                onValueChange = { lastName = it },
//                label = { Text(text = stringResource(R.string.label_last)) },
//                modifier = Modifier
//                    .width(190.dp)
//            )
//        }
//        TextField(
//            value = usernameInput.toString(),
//            onValueChange = { usernameInput = it },
//            label = { Text(text = stringResource(R.string.label_username)) },
//            modifier = Modifier.fillMaxWidth()
//        )
//        TextField(
//            value = passwordInput.toString(),
//            onValueChange = { passwordInput = it },
//            label = { Text(text = stringResource(R.string.label_password)) },
//            modifier = Modifier.fillMaxWidth(),
//            visualTransformation = PasswordVisualTransformation()
//        )
//        TextField(
//            value = cPassword.toString(),
//            onValueChange = { cPassword = it },
//            label = { Text(text = stringResource(R.string.label_confirmation)) },
//            modifier = Modifier.fillMaxWidth(),
//        )
//        Row(
//            modifier = Modifier
//                .padding(start = 0.dp, top = 0.dp),
//            horizontalArrangement = Arrangement.spacedBy(5.dp)
//        ) {
//            Button(
//                onClick = {
//                    btnOnClickAction(usernameInput)
//                }
//            )
//            {
//                Text(
//                    text = "OK"
//                )
//            }
//        }
//    }
//}

@Composable
fun MainScreen(btnOnClickAction: (String?) -> Unit) {

    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var cPassword by remember { mutableStateOf("") }
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val dataStore = FirstName(context)
    val storeData = LastName(context)
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row( modifier = Modifier
               .padding(start = 0.dp, top = 0.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp))
        {
            TextField(
                modifier = Modifier
                    .width(175.dp),
                value = firstName,
                label = { Text(text = stringResource(R.string.label_first)) },
                onValueChange = { firstName = it },
            )
            TextField(
                modifier = Modifier
                    .padding(start = 0.dp, top = 0.dp),
                value = lastName,
                label = { Text(text = stringResource(R.string.label_last)) },
                onValueChange = { lastName = it },
            )
        }
            TextField(
                value = usernameInput.toString(),
                onValueChange = { usernameInput = it },
                label = { Text(text = stringResource(R.string.label_username)) },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = passwordInput.toString(),
                onValueChange = { passwordInput = it },
                label = { Text(text = stringResource(R.string.label_password)) },
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
            )
            TextField(
                value = cPassword.toString(),
                onValueChange = { cPassword = it },
                label = { Text(text = stringResource(R.string.label_confirmation)) },
                modifier = Modifier.fillMaxWidth(),
            )
            Button(
                modifier = Modifier
                    .height(50.dp),
                onClick = {
                    scope.launch {
                        dataStore.saveFirst(firstName)
                        storeData.saveLast(lastName)
                        btnOnClickAction(usernameInput)
//                        context.startActivity(
//                            Intent(context, MainActivity::class.java)
//                        )
                    }
                }
            )
            {
                // button text
                Text(
                    text = "OK",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
    }


