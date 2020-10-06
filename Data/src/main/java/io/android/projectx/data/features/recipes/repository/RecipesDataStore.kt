package io.android.projectx.data.features.recipes.repository

import io.android.projectx.data.features.recipes.model.RecipeEntity
import io.reactivex.Flowable

interface RecipesDataStore {

    fun getRecipes(fromIndex: Int, pageSize: Int): Flowable<List<RecipeEntity>>

}