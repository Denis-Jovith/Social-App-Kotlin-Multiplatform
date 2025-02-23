package com.example.socialappkotlinmultiplatform.android.common.theming

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun SocialAppTheme(
    darkTheme:Boolean =  isSystemInDarkTheme(),
    content: @Composable () -> Unit
){
    val colors = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors,
        shapes = androidx.compose.material3.Shapes(
            extraSmall = Shapes.extraSmall,
            small = Shapes.small,
            medium = Shapes.medium
            ),
        typography = Typography,
        content = content
    )
}