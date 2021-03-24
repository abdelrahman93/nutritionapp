package com.task.nutritionapp.di.module

import android.content.Context
import com.task.nutritionapp.data.repository.RepositoryImp
import com.task.nutritionapp.domain.remote.NutrationAPI
import com.task.nutritionapp.domain.repository.Repository
import com.task.nutritionapp.network.Services
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun createRetrofit(context: Context) = Services.getInstance("https://api.edamam.com/").retrofit



    @Provides
    fun provideApi( retrofit: Retrofit): NutrationAPI {
        return retrofit.create(NutrationAPI::class.java)
    }


    @Provides
    fun provideRepository(nutrationAPI: NutrationAPI): Repository {
        return RepositoryImp(nutrationAPI = nutrationAPI)
    }


}