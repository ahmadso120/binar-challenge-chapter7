package com.sopian.challenge7.di.core

import android.content.Context
import com.sopian.challenge7.data.MovieRepository
import com.sopian.challenge7.data.UserRepository
import com.sopian.challenge7.storage.PreferencesManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [RepositoryModule::class, StorageModule::class]
)
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }

    fun provideMovieRepository() : MovieRepository
    fun provideUserRepository() : UserRepository
    fun provideStorage() : PreferencesManager
}