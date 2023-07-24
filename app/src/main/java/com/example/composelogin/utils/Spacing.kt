package com.example.composelogin.utils

import android.widget.Space
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HeightLineSpacing(){
    Spacer(modifier = Modifier.height(18.dp))
}

@Composable
fun WidthLineSpacing(){
    Spacer(modifier = Modifier.width(16.dp))
}

@Composable
fun LowHeightSpacing(){
    Spacer(modifier = Modifier.height(6.dp))
}

@Composable
fun MediumHeightSpacing(){
    Spacer(modifier = Modifier.height(12.dp))
}

@Composable
fun MediumHeight24DpSpacing(){
    Spacer(modifier = Modifier.height(24.dp))
}

@Composable
fun MediumHeight36DpSpacing(){
    Spacer(modifier = Modifier.height(36.dp))
}
