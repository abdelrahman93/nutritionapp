package com.task.nutritionapp.di.component

import android.app.Application
import android.content.Context
import com.task.nutritionapp.di.module.*
import com.task.nutritionapp.ui.ingredients.IngredientsFragment
import dagger.BindsInstance
import dagger.Component
import io.reactivex.Scheduler
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        RepositoryModule::class,
        SchedulerModule::class,
        UsecaseModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {
    @Component.Factory
    interface AppComponentFactory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(ingredientsFragment: IngredientsFragment)

    @Named(SCHEDULER_MAIN_THREAD)
    fun getMainThread(): Scheduler

    @Named(SCHEDULER_IO)
    fun getIOThread(): Scheduler

}