package com.example.foodpath.model

data class User(
    val id: Int,
    val phoneNumber: String,
    val savedDishes: List<Dish>,
    // add other attributes if needed
)
