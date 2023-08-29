package com.junrdev.soko.view.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.junrdev.soko.App
import com.junrdev.soko.R

@Composable
@Preview(showSystemUi = true)
fun TFPreviews() {
    val value = remember { mutableStateOf("") }

    App {
        PasswordTextField(pwdStr = value)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField(
    pwdStr: MutableState<String>,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {

    val showPassword = remember {
        mutableStateOf(false)
    }

    val trailingIcon =
        if (showPassword.value) painterResource(id = R.drawable.round_visibility_off_24) else painterResource(
            id = R.drawable.round_visibility_24
        )

    val contentDescription = if (showPassword.value) "Hide password" else "Show Password"

    TextField(
        value = pwdStr.value,
        onValueChange = { pwdStr.value = it },
        modifier = Modifier,
        colors = TextFieldDefaults.textFieldColors(),
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        trailingIcon = {
            Icon(
                painter = trailingIcon,
                contentDescription = contentDescription,
                modifier = Modifier.clickable { showPassword.value = !showPassword.value }
            )
        },
        visualTransformation = if (showPassword.value) PasswordVisualTransformation() else VisualTransformation.None,
        singleLine = true,
        shape = MaterialTheme.shapes.medium,
        textStyle = TextStyle(fontSize = 15.sp),
        placeholder = { Text(text = "password", style = TextStyle(fontSize = 15.sp)) }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NormalTextField(
    text: MutableState<String>,
    placeholder: String,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
) {


    TextField(
        value = text.value,
        onValueChange = { text.value = it },
        modifier = Modifier,
        colors = TextFieldDefaults.textFieldColors(),
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        singleLine = true,
        shape = MaterialTheme.shapes.medium,
        textStyle = TextStyle(fontSize = 15.sp),
        placeholder = { Text(text = placeholder, style = TextStyle(fontSize = 15.sp)) }
    )

}