package edu.uksw.fti.pam.pamactivityintent.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pamactivityintent.R
import edu.uksw.fti.pam.pamactivityintent.ui.theme.PAMActivityIntentTheme

@Composable
fun ContactScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                "Contacts",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                color = Color(0xff36a8eb),
                fontSize = 32.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = { },
                modifier = Modifier,
                shape = CircleShape,
                border = BorderStroke(2.dp, Color(0xff36a8eb)),
                contentPadding = PaddingValues(68.dp, 2.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent,
                    contentColor = MaterialTheme.colors.primary
                )
            ) {
                Text(
                    text = stringResource(R.string.find),
                    fontSize = 16.sp,
                    color = Color(0xff2d8bc2),
                    fontWeight = FontWeight.Light,
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(top = 15.dp)
        ){
            Divider(color = Color.Blue, thickness = 2.dp)
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
                    .padding(40.dp, 25.dp, 5.dp, 15.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.person_3),
                            contentDescription = stringResource(id = R.string.profil),
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = RoundedCornerShape(20.dp))
                        )
                        Box(
                            modifier = Modifier
                                .size(15.dp)
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
                    Column(
                        modifier = Modifier
                            .size(height = 60.dp, width = 194.dp)
                            .padding(
                                start = 14.dp,
                                end = 10.dp,
                                top = 3.dp,
                                bottom = 3.dp
                            ),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Dier Waringin",
                            fontSize = 20.sp,
                            color = Color(0xff2d8bc2),
                            fontWeight = FontWeight.Bold
                        )
                        Text("+67-81329881974", fontSize = 15.sp, color = Color(0xff2d8bc2))
                    }
                    Column(
                        modifier = Modifier
                            .size(height = 80.dp, width = 90.dp)
                            .padding(
                                top = 0.dp,
                                bottom = 6.dp,
                                start = 0.dp
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(start = 10.dp, end = 5.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_call),
                                contentDescription = stringResource(id = R.string.icon_bottom),
                                tint = Color(0xff2d8bc2),
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .padding(top = 95.dp)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.person_3),
                            contentDescription = stringResource(id = R.string.profil),
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = RoundedCornerShape(20.dp))
                        )
                        Box(
                            modifier = Modifier
                                .size(15.dp)
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
                    Column(
                        modifier = Modifier
                            .size(height = 60.dp, width = 194.dp)
                            .padding(
                                start = 14.dp,
                                end = 10.dp,
                                top = 3.dp,
                                bottom = 3.dp
                            ),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Dier Waringin",
                            fontSize = 20.sp,
                            color = Color(0xff2d8bc2),
                            fontWeight = FontWeight.Bold
                        )
                        Text("+67-81329881974", fontSize = 15.sp, color = Color(0xff2d8bc2))
                    }
                    Column(
                        modifier = Modifier
                            .size(height = 80.dp, width = 90.dp)
                            .padding(
                                top = 0.dp,
                                bottom = 6.dp,
                                start = 0.dp
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(start = 10.dp, end = 5.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_call),
                                contentDescription = stringResource(id = R.string.icon_bottom),
                                tint = Color(0xff2d8bc2),
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .padding(top = 190.dp)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.person_3),
                            contentDescription = stringResource(id = R.string.profil),
                            modifier = Modifier
                                .size(60.dp)
                                .clip(shape = RoundedCornerShape(20.dp))
                        )
                        Box(
                            modifier = Modifier
                                .size(15.dp)
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
                    Column(
                        modifier = Modifier
                            .size(height = 60.dp, width = 194.dp)
                            .padding(
                                start = 14.dp,
                                end = 10.dp,
                                top = 3.dp,
                                bottom = 3.dp
                            ),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Dier Waringin",
                            fontSize = 20.sp,
                            color = Color(0xff2d8bc2),
                            fontWeight = FontWeight.Bold
                        )
                        Text("+67-81329881974", fontSize = 15.sp, color = Color(0xff2d8bc2))
                    }
                    Column(
                        modifier = Modifier
                            .size(height = 80.dp, width = 90.dp)
                            .padding(
                                top = 0.dp,
                                bottom = 6.dp,
                                start = 0.dp
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(start = 10.dp, end = 5.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_call),
                                contentDescription = stringResource(id = R.string.icon_bottom),
                                tint = Color(0xff2d8bc2),
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4(){
    PAMActivityIntentTheme {
        ContactScreen()
    }
}