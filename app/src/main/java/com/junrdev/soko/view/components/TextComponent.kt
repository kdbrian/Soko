package com.junrdev.soko.view.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.junrdev.soko.App

@Composable
@Preview(showSystemUi = true)
fun TxtPreview() {

    App {

    }
}

@Composable
fun LargeText(text : String ,modifier: Modifier = Modifier, onCLick : () -> Unit ?) {

}

@Composable
fun SmallText(text : String ,modifier: Modifier = Modifier, onCLick : () -> Unit ?) {

}

@Composable
fun MediumText(text : String ,modifier: Modifier = Modifier, onCLick : () -> Unit ?) {

}