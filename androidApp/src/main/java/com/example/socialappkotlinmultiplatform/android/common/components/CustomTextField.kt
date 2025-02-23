package com.example.socialappkotlinmultiplatform.android.common.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange : (String) -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text,
    isPasswordTextField:Boolean = false,
    isSingleLine : Boolean = true,
    @StringRes hint : Int
){
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
        textStyle = MaterialTheme.typography.bodyMedium,
    )
}
