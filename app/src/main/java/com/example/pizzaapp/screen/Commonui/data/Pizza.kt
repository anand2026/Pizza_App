package com.example.pizzaapp.screen.Commonui.data

import androidx.annotation.DrawableRes
import com.example.pizzaapp.R

data class Pizza (@DrawableRes val image:Int,val name:String,val description:String ,val price:String)
val pizzalist= listOf(
    Pizza(R.drawable.capsicum_pizza,
        name ="Fresh Farm House",
        description = "crisp capsicum,succulent mushroom and fresh tomatos",
        price = "€14.25"
        ),
    Pizza(R.drawable.crunky_paneer,
        name ="Peppy Paneer",
        description = "Crunky paneer with cripse capsicum and spizy red paper",
        price = "€16.75"
    ),
    Pizza(R.drawable.double_cheeze_corn,
        name ="Maxican Green Wave",
        description = "A pizza loaded with crunky onion,crisp capsicum and juicy tomatos",
        price ="€10.25"
    ),
    Pizza(R.drawable.capsicum_pizza,
        name ="Fresh Farm House",
        description = "crisp capsicum,succulent mushroom and fresh tomatos",
        price = "€14.25"
    ),

    Pizza(R.drawable.crunky_paneer,
        name ="Peppy Paneer",
        description = "Crunky paneer with cripse capsicum and spizy red paper",
        price = "€16.75"
    ),
    Pizza(R.drawable.double_cheeze_corn,
        name ="Maxican Green Wave",
        description = "A pizza loaded with crunky onion,crisp capsicum and juicy tomatos",
        price ="€10.25"
    ),
    Pizza(R.drawable.onion_pizza,
        name ="onion_pizza",
        description = "onicn with cheese",
        price = "€11.25"
    ),
    Pizza(R.drawable.corn_pizza,
        name ="corn_pizza",
        description = "corn with cheese",
        price = "€12.25"
    ),
)