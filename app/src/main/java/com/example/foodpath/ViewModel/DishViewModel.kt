package com.example.foodpath.viewmodel

import androidx.lifecycle.ViewModel
import com.example.foodpath.model.Dish
import com.example.foodpath.repository.DishRepository

class DishViewModel(private val repository: DishRepository) : ViewModel() {

    // Example function to get all dishes
    fun getAllDishes(): List<Dish> {
        return repository.getDishes()
    }

    // Add more functions for other operations as needed
}
