package com.example.composelearning.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun RowExample(modifier: Modifier) {
    Row(modifier) {
        Text(text = "Row 1")
        Text(text = "Row 2")
        Text(text = "Row 3")
    }
}

@Composable
fun ColumnExample(modifier: Modifier) {
    Column(modifier) {
        Text(text = "Column 1")
        Text(text = "Column 2")
    }

}

@Preview(showSystemUi = true)
@Composable
fun RowExamplePreview() {
    RowExample(Modifier)
}

@Preview(showSystemUi = true)
@Composable
fun ColumnExamplePreview() {
    ColumnExample(Modifier)

}

