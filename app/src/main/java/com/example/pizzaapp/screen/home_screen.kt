package com.example.pizzaapp.screen

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaapp.R
import com.example.pizzaapp.screen.Commonui.data.Pizza
import com.example.pizzaapp.screen.Commonui.data.pizzalist
import com.example.pizzaapp.screen.Commonui.spacerHeight
import com.example.pizzaapp.screen.Commonui.spacerWidth
import com.example.pizzaapp.ui.theme.BackgroundColor
import com.example.pizzaapp.ui.theme.DarkBlackColor
import com.example.pizzaapp.ui.theme.LightGreyColor
import com.example.pizzaapp.ui.theme.RedColor
import com.example.pizzaapp.ui.theme.YellowColor

@Composable
fun homeScreen() {
    val menulist= listOf("Starter","Asian","Placha & Roast & Grill","Classic","Indian","Italian")
    var currentmenu by remember {
        mutableStateOf("Starter")
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White) ){
        header()
        Card(modifier = Modifier.fillMaxWidth()) {
            LazyRow(modifier = Modifier.fillMaxWidth() ){

                items(menulist.size) {
                    customchip(title = menulist[it], selected = menulist[it] == currentmenu, onValueChange = { data ->
                        currentmenu = data
                    })
                }
            }
        }
        LazyVerticalGrid(columns =GridCells.Fixed(2) ){
            items(pizzalist){
                showPizza(pizza = it)

            }
        }

    }

}

@Composable
fun showPizza(
    pizza:Pizza
) {
    Card(modifier = Modifier
        .width(175.dp)
        .padding(5.dp)) {
        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center ){
            Column(modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
                Image(painter = painterResource(id = pizza.image),
                    contentDescription ="pizza",
                    modifier = Modifier.size(150.dp)
                    )
                spacerHeight()
                Text(text = pizza.price, style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = RedColor
                ),
                    textAlign = TextAlign.Center
                    )
                spacerHeight()
                Text(text = pizza.name, style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W600,
                    color = DarkBlackColor
                ),
                    textAlign = TextAlign.Center

                )
                spacerHeight()
                Text(text = pizza.description, style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.W300,
                    color = Color.Black
                ),
                    textAlign = TextAlign.Center
                )
                spacerHeight()
                Button(onClick = { /*TODO*/ }, modifier = Modifier.width(91.dp), shape = RoundedCornerShape(18.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = YellowColor
                    )
                ) {
                    Text(text = "ADD", style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.White
                    ))

                }
            }

        }
    }
}
@Composable
fun header() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(RedColor)){
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp, horizontal = 10.dp), horizontalArrangement = Arrangement.SpaceBetween){
            Row() {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "menu", tint = Color.White)
                spacerWidth()
                Text(text = "ANAND SINGH", style = TextStyle(
                    fontSize = 19.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.White
                )
                )
            }

            Icon(imageVector = Icons.Default.Search, contentDescription = "search",tint = Color.White)
        }
    }

}

@Composable
fun extendedactionButton() {
    Box (modifier = Modifier
        .height(48.dp)
        .clip(RoundedCornerShape(27.dp))
        .background(DarkBlackColor)){
        Row {
            spacerWidth(20.dp)
            Text(text = "$60.40", style = TextStyle(
                fontSize = 19.sp,
                fontWeight = FontWeight.W600,
                color = Color.White
            ),
            )
            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription ="cart", modifier = Modifier
                .size(46.dp)
                .padding(2.dp),
                tint = Color.Unspecified
            )
        }

    }

}
@Composable
fun customchip(
    title: String,
    selected:Boolean,
    onValueChange:(String)->Unit
) {
    TextButton(onClick = {onValueChange(title)},
        shape = RoundedCornerShape(200.dp),
        elevation = ButtonDefaults.buttonElevation(0.dp),
        colors =ButtonDefaults.textButtonColors(
            if (selected) YellowColor else Color.Transparent
        ),
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 15.dp)
    ) {
        Text(text = title, style = TextStyle(
            fontWeight = FontWeight.W600,
            fontSize = 14.sp,
            color = if (selected) Color.White else DarkBlackColor

        ))

    }
    
}