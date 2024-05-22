package device.ui.theme


import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.sp
import calendarplus.composeapp.generated.resources.Res
import calendarplus.composeapp.generated.resources.SUITE_Variable


//val suiteFontFamily = Font(Res.font.SUITE_Variable).toFontFamily()


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        //fontFamily = suiteFontFamily.Default,
        //fontWeight = suiteFontFamily.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),/*
    titleLarge = TextStyle(
        fontFamily = suiteFontFamily.Default,
        fontWeight = suiteFontFamily.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = suiteFontFamily.Default,
        fontWeight = suiteFontFamily.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )*/
)