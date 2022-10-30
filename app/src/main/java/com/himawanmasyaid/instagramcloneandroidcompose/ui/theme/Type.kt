package com.himawanmasyaid.instagramcloneandroidcompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.himawanmasyaid.instagramcloneandroidcompose.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
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

val Montserrat = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_medium, FontWeight.W500),
    Font(R.font.montserrat_bold, FontWeight.W600)
)


val MontserratMedium = FontFamily(
    Font(R.font.montserrat_medium, FontWeight.W500)
)

val MontserratBold = FontFamily(
    Font(R.font.montserrat_bold, FontWeight.W600)
)

val boldTextLightStyle = TextStyle(
    fontFamily = FontFamily(Font(R.font.montserrat_bold, FontWeight.W600)),
    color = textPrimaryColorLight
)

val regularTextLightStyle = TextStyle(
    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
    color = textPrimaryColorLight
)

val InstagramTypography = Typography(
    h3 = boldTextLightStyle.copy(
        fontSize = 14.sp,
        lineHeight = 18.sp,
        letterSpacing = (-0.1).sp
    ),
    body1 = regularTextLightStyle.copy(
        fontSize = 14.sp,
        lineHeight = 17.sp,
        letterSpacing = (0.15).sp
    ),
    body2 = regularTextLightStyle.copy(
        fontSize = 12.sp,
        lineHeight = 13.sp,
        letterSpacing = (0.07).sp
    )
)