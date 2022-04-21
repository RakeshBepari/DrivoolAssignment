package com.example.drivoolassignment.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.drivoolassignment.R

private val roboto = FontFamily(
    Font(R.font.roboto_bold,FontWeight.Bold),
    Font(R.font.roboto,FontWeight.Normal),
    Font(R.font.roboto_light,FontWeight.Light),
    Font(R.font.roboto_thin,FontWeight.Thin)
)

private val acme = FontFamily(
    Font(R.font.acme,FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = roboto,
    h1 = TextStyle(
        fontFamily = acme,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
        color = HeadingColor
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 18.sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    subtitle1 = TextStyle(
        fontWeight = FontWeight.Thin,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Thin,
        fontSize = 12.sp
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 14.sp
    ),
    subtitle2 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 18.sp
    ),

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)