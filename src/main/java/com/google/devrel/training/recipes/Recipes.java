package com.google.devrel.training.recipes;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Recipes {
	@Id
	private Long recipeId;
	private String name;
	private Boolean vegetarian;
	private Integer servings;
	
	private String ingredients;
	private String instruccions;
	
	
	
	public Recipes() {
		super();
	};
	
	public Recipes(Long recipeId, String name, Boolean vegetarian,
			Integer servings, String ingredients, String instruccions) {
		super();
		this.recipeId = recipeId;
		this.name = name;
		this.vegetarian = vegetarian;
		this.servings = servings;
		this.ingredients = ingredients;
		this.instruccions = instruccions;
	}
	public Long getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(Long recipeId) {
		this.recipeId = recipeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(Boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getInstruccions() {
		return instruccions;
	}
	public void setInstruccions(String instruccions) {
		this.instruccions = instruccions;
	}
	
	

}
