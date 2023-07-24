package com.example.composelogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelogin.ui.theme.ComposeLoginTheme
import com.example.composelogin.utils.GradientButton
import com.example.composelogin.utils.HeightLineSpacing
import com.example.composelogin.utils.MediumHeight24DpSpacing
import com.example.composelogin.utils.MediumHeight36DpSpacing
import com.example.composelogin.utils.MediumHeightSpacing


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLoginTheme(dynamicColor = false) {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.tertiary,
                    modifier = Modifier.fillMaxSize(),
                    ) {
                    Column {

                        Spacer(modifier = Modifier.height(30.dp))
                        SignUpScreen(modifier = Modifier)
                        TwoCardsInRowWithEqualWeights()
                        HeightLineSpacing()
                        TextInputFields()
                        MediumHeight36DpSpacing()

                    }
                    Column(
                        modifier = Modifier.fillMaxSize()
                            .padding(start = 8.dp, end = 8.dp, bottom = 36.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Bottom) {

                        SignUpButton()

                    }

                }
            }
        }
    }
}


@Composable
@Preview
fun SignUpScreen(modifier: Modifier  = Modifier){

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(start = 10.dp)) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {

            val painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24)

            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
            ) {
                Image(
                    painter = painter,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "Sign Up",
                fontFamily = robotoFontFamily,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 40.sp,

            )

        }

        Spacer(modifier = Modifier.height(60.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp),
            text = "Sign up with one of these options",
            fontFamily = robotoFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.secondary
        )


    }
}


@Preview
@Composable
fun TwoCardsInRowWithEqualWeights() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        val  painter: Painter= painterResource(id = R.drawable.icon_apple_white)
        Card(
            modifier = Modifier
                .weight(1f)
                .padding(8.dp)
                .height(75.dp)
                .border(BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.surface.copy(0.8f)),
                  shape = RoundedCornerShape(16.dp)
                ),

            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.2f))


        ) {
            val  painter: Painter= painterResource(id = R.drawable.icons8_google_50)
           Column(
               modifier = Modifier
                   .fillMaxSize()
                   .padding(top = 12.dp, bottom = 12.dp),
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally,
             ) {

               Image(painter = painter , contentDescription = "Sample Image",Modifier.size(30.dp))

           }
        }

        Card(
            modifier = Modifier
                .weight(1f)
                .padding(8.dp)
                .height(75.dp)
                .border(BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.surface.copy(alpha = 0.8f)),
                    shape = RoundedCornerShape(16.dp)
                ),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.2f))
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 12.dp, bottom = 12.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Image(painter = painter , contentDescription = "Sample Image",Modifier.size(30.dp))

            }

        }
    }
}

@Composable
fun HeadingMediumHeight(textMessage:String="Name"){

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.Start,
    ) {
        Text(text = textMessage,
            Modifier.padding(8.dp),
            fontFamily = robotoFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.White
        )
    }
}

@Composable
fun TextInputFields(){


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 12.dp,
                end = 12.dp
            )) {

        HeadingMediumHeight("Name")
        CustomTextField(label = "Enter Name")
        MediumHeightSpacing()
        HeadingMediumHeight("Email")
        CustomTextField(label = "jim@gmail.com")
        MediumHeightSpacing()
        HeadingMediumHeight("Password")
        CustomTextField(label = "Pick a strong password")

    }


}

@Preview
@Composable
fun SignUpButton(){

    val gradientStart = Color(0xFF8d0696)
    val gradientEnd = Color(0xFFC44bc1)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
    ) {
        GradientButton(
            listOf(gradientStart,gradientEnd),
            cornerRadius = 16.dp,
            nameButton = "Create Account",
            RoundedCornerShape(16.dp)
        )
    }

}








