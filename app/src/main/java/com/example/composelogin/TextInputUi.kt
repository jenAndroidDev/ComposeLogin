package com.example.composelogin

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CustomTextField(
    label:String="Name",
    placeHolder:String="Enter Name",
    defaultTextValue:String="Sample Text",

){

    Box(
        Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center

    ){

        Column() {
            TextInputFieldView(label = label)
        }

    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TextInputFieldView(
    label: String="Enter Name"
){

    val gradientStart = Color(0xFF8d0696)
    val gradientEnd = Color(0xFFC44bc1)


    val textState = remember {
        mutableStateOf("")
    }

    TextField(
        value = textState.value,
        onValueChange = {textValue->
            textState.value = textValue
        },
        label = {
            Text(text = label)
        },
        modifier = Modifier.border(
            width = 2.dp,
            brush = Brush.horizontalGradient(listOf(gradientStart,gradientEnd)),
            shape = RoundedCornerShape(12.dp)

        ).fillMaxWidth().height(60.dp),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}