package com.example.foodpath.model

data class Dish(
    val id: Int,
    val name: String,
    val ingredients: List<String>,
    val steps: List<String>,
    val region: String,
    val imageUrl: String
    // add other attributes if needed
)
