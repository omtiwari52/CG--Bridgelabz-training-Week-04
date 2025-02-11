package com.capgemini.personalized_meal_plan_generator;

public class HighProteinMeal implements MealPlan{

    private String mealName;
    private String category;
    private double price;

    public HighProteinMeal(String mealName, String category, double price){
        this.mealName = mealName;
        this.category = category;
        this.price = price;
    }

    @Override
    public String getName() {
        return mealName;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void displayMeal(){
        System.out.println("Meal name: "+ getName() +"\nMeal category: "+ getCategory() + "\nMeal price: "+ getPrice());
    }
}
