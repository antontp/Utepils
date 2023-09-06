package com.example.utepils.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.requiredHeightIn
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.utepils.ui.theme.AppType
import com.example.utepils.ui.theme.DarkSeaGreen

@Composable
fun CardImage(image: String, size: Int) {
    Image(
        painter = rememberAsyncImagePainter(image),
        contentDescription = "Photo of a beverage",
        modifier = Modifier
            .requiredWidthIn(size.dp, size.dp)
            .requiredHeightIn(size.dp, size.dp)
            .clip(RoundedCornerShape(12.dp)),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun TagBar(tags: List<String>) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        for (i in 0 .. 2){
            if (i <= tags.size-1)
                Text("#${tags[i]} ", style = AppType.button, color = DarkSeaGreen)
        }
    }

}

