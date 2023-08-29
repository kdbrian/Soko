package com.junrdev.soko.view.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.junrdev.soko.App
import org.w3c.dom.Text

@Composable
@Preview(showSystemUi = true)
fun BtnPreview() {

    App {

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FullWidthButton(
    text: String,
    modifier: Modifier = Modifier,
    clickHandler: () -> Unit
) {

    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(15.dp)),
        shadowElevation = 4.dp,
        onClick = { clickHandler() }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = text, style = TextStyle())
        }
    }
}