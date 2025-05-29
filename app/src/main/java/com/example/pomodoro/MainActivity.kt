package com.example.pomodoro;

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {

    @Composable
    fun TITLE() {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                "Welcome to Pomodoro Timer",
                modifier = Modifier.padding(top = 150.dp),
                color = Color.Black,
                fontSize = 17.sp,
            )

        }
    }

    @Composable
    fun Footer() {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(

                "Made by Ryan James",
                modifier = Modifier.padding(top = 570.dp),
                color = Color.Black,
                fontSize = 12.sp,

            )
        }

    }

    @Composable
    fun ButtonTitle() {
        Text("Click me To Start Timer");
    }


    @Composable
    fun CreateButton() {

        var context = LocalContext.current;

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.align(Alignment.BottomCenter)
                    .padding(top = 20.dp)) {
                Button(onClick={

                    Toast.makeText(context, "Started Timer", Toast.LENGTH_LONG).show()
                }) {

                    ButtonTitle()
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        setContent {

            TITLE()
            AlignTextSpaced()
            CreateButton()
            Footer()

        }

    }

    @Composable
    fun ThreadsSleep() {


        Thread.sleep(1000);


    }

    @Composable
    fun AlignTextSpaced() {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                "Minutes: 0",
                modifier = Modifier.padding(top = 250.dp),
                color = Color.Black,
            )

            Text(
                "Seconds: 0",
                modifier = Modifier.padding(top = 250.dp),
                color = Color.Black,
            )

            Text(
                "Hours: 0",
                modifier = Modifier.padding(top = 250.dp),
                color = Color.Black,
            )

        }
    }

}
