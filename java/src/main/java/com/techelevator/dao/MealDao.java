package com.techelevator.dao;

import com.techelevator.model.Meal;

import java.util.List;

public interface MealDao {

    List<Meal> getAllMeals();

    Meal getMealById(int idmeal);

    Meal addMeal(Meal meal);

<<<<<<< HEAD
    void deleteMeal(int idmeal); // I updated this part to match our database
=======
    Meal updateMeal( Meal meal);

    void deleteMeal(int mealId);
>>>>>>> f3e88ac424e3e45d790a93195aca0daa7f7f50cb

}
