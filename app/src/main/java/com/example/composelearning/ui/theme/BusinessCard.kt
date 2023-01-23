package com.example.composelearning.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelearning.R

@Composable
fun BusinessCard() {
    Column(modifier = Modifier.fillMaxSize()) {
        BusinessCardTop(modifier = Modifier.weight(3F))
        BusinessCardBottom(modifier = Modifier.weight(2F))
    }

}

@Composable
fun BusinessCardTop(modifier: Modifier) {
    val image = painterResource(id = R.drawable.ic_launcher_background)
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(150.dp)
                .height(150.dp)

        )
        Text(
            text = "Varsha Bhatia",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(0.dp, 24.dp, 0.dp, 8.dp)
        )
        Text(
            text = "Android Developer",
            fontSize = 16.sp
        )
    }
}

@Composable
fun BusinessCardBottom(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(0.dp, 0.dp, 0.dp, 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        BusinessCardBottomRow("+00 (00) 000 0")
        BusinessCardBottomRow("@SocialMediaHandle")
        BusinessCardBottomRow("EmailInfo")
    }
}

@Composable
fun BusinessCardBottomRow(contact: String) {
    val image = painterResource(id = R.drawable.ic_launcher_background)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp, 2.dp, 20.dp, 2.dp)
    ) {
        Image(
            painter = image,
            contentDescription = contact,
            modifier = Modifier
                .width(30.dp)
                .height(30.dp)
                .padding(5.dp)
                .wrapContentWidth(Alignment.Start)
        )
        Text(
            contact,
            modifier = Modifier
                .padding(10.dp, 0.dp, 10.dp, 0.dp)
                .align(Alignment.CenterVertically)
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}