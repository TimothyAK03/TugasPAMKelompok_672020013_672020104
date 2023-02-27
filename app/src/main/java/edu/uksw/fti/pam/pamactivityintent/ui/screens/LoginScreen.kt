package edu.uksw.fti.pam.pamactivityintent.ui.screens

import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pamactivityintent.HomeActivity
import edu.uksw.fti.pam.pamactivityintent.contracts.SignUpContract
import edu.uksw.fti.pam.pamactivityintent.R
import edu.uksw.fti.pam.pamactivityintent.SignActivity

internal fun doAuth(
    usernameInput: String,
    passwordInput: String,
): Boolean {
    return (usernameInput.equals("timothy") && passwordInput.equals("104"))
}

@Composable
fun LoginForm() {

    val lContext = LocalContext.current
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

    val getUsernameFromSignedUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!!}
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            value = usernameInput.toString(),
            onValueChange = { usernameInput = it },
            label = { Text(text = stringResource(R.string.label_username)) },
            modifier = Modifier.fillMaxWidth()
//                keyboardOptions = KeyboardOptions(
//                    keyboardType = KeyboardType.Number
        )
        TextField(
            value = passwordInput.toString(),
            onValueChange = { passwordInput = it },
            label = { Text(text = stringResource(R.string.label_password)) },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation()
        )
        Row(
            modifier = Modifier
                .padding(start = 0.dp, top = 0.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = {
//                        lContext.startActivity(
//                            Intent(lContext, SignActivity::class.java)
                    getUsernameFromSignedUpForm.launch("")
                }
            )
            {
                Text(
                    text = "Sign Up"
                )
            }
            Button(
                onClick = {
                    val isAuthtenticated = doAuth(usernameInput, passwordInput)
                    if (isAuthtenticated) {
                        lContext.startActivity(
                            Intent(lContext, HomeActivity::class.java)
                                .apply { putExtra("username", usernameInput) }
                        )
                    }
                }
            )
            {
                Text(
                    text = "Login"
                )

            }
        }
    }
}
