package edu.uksw.fti.pam.pamactivityintent.ui.screens

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pamactivityintent.HomeActivity
import edu.uksw.fti.pam.pamactivityintent.R
import edu.uksw.fti.pam.pamactivityintent.contracts.SignUpContract
import edu.uksw.fti.pam.pamactivityintent.ui.theme.PAMActivityIntentTheme
import edu.uksw.fti.pam.pamactivityintent.DataStore.FirstName
import edu.uksw.fti.pam.pamactivityintent.DataStore.LastName
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pamactivityintent.ui.theme.PAMActivityIntentTheme

@Composable
fun ProfileScreen() {
    val context = LocalContext.current
    val dataStore = FirstName(context)
    val storeData = LastName(context)
    val savedFirst = dataStore.getFirst.collectAsState(initial = "")
    val savedLast = storeData.getLast.collectAsState(initial = "")
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
                .padding(10.dp, 15.dp, 5.dp, 15.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(Color(0xff36a8eb))
                ) {
                    Box(
                        modifier = Modifier
                            .padding(start = 137.dp, top = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.person_2),
                            contentDescription = stringResource(id = R.string.profil),
                            modifier = Modifier
                                .size(120.dp)
                                .clip(shape = RoundedCornerShape(80.dp))
                        )
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(shape = CircleShape)
                                .background(Color(0xff93fc51))
                                .align(Alignment.BottomEnd)
                                .border(
                                    width = 2.0.dp,
                                    color = Color.White,
                                    shape = CircleShape
                                )
                        )
                    }
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 180.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                        Text(
                            text = "Hallo ,  ",
                            fontSize = 23.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xff36a8eb),
                        )
                        Text(
                            text = savedFirst.value!!,
                            fontSize = 23.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xff36a8eb),
                        )
                        Text(
                            text = " "
                        )
                        Text(
                            text = savedLast.value!!,
                            fontSize = 23.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xff36a8eb),
                        )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 240.dp, start = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ){
                Box(
                    modifier = Modifier
                        .width(360.dp)
                        .height(56.dp)
                        .clip(shape = RoundedCornerShape(8.dp))
                        .border(
                            width = 2.0.dp,
                            color = Color(0xff36a8eb),
                        )
                        .padding(start = 30.dp , top = 10.dp),
                ){
                    Icon(
                        painter = painterResource(R.drawable.baseline_edit_note_24),
                        contentDescription = stringResource(id = R.string.icon_bottom),
                        tint = Color(0xff2d8bc2),
                        modifier = Modifier
                            .size(32.dp)
                    )
                    Text(
                        "Aku Suka Tidur",
                        fontSize = 20.sp,
                        color = Color(0xff2d8bc2),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 80.dp)
                    )
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 318.dp, start = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ){
                Box(
                    modifier = Modifier
                        .width(360.dp)
                        .height(56.dp)
                        .clip(shape = RoundedCornerShape(8.dp))
                        .border(
                            width = 2.0.dp,
                            color = Color(0xff36a8eb),
                        )
                        .padding(start = 30.dp , top = 10.dp),
                ){
                    Icon(
                        painter = painterResource(R.drawable.icon_call),
                        contentDescription = stringResource(id = R.string.icon_bottom),
                        tint = Color(0xff2d8bc2),
                        modifier = Modifier
                            .size(32.dp)
                    )
                    Text(
                        "082-456-890-90",
                        fontSize = 20.sp,
                        color = Color(0xff2d8bc2),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 80.dp)
                    )
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 392.dp, start = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ){
                Box(
                    modifier = Modifier
                        .width(360.dp)
                        .height(56.dp)
                        .clip(shape = RoundedCornerShape(8.dp))
                        .border(
                            width = 2.0.dp,
                            color = Color(0xff36a8eb),
                        )
                        .padding(start = 30.dp , top = 10.dp),
                ){
                    Icon(
                        painter = painterResource(R.drawable.baseline_location_on_24),
                        contentDescription = stringResource(id = R.string.icon_bottom),
                        tint = Color(0xff2d8bc2),
                        modifier = Modifier
                            .size(32.dp)
                    )
                    Text(
                        "Indonesia",
                        fontSize = 20.sp,
                        color = Color(0xff2d8bc2),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 80.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3(){
    PAMActivityIntentTheme {
        ProfileScreen()
    }
}


