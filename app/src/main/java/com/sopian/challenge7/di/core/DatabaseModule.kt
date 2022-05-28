package com.sopian.challenge7.di.core

import android.content.Context
import androidx.room.Room
import com.sopian.challenge7.data.source.local.room.AppDatabase
import com.sopian.challenge7.data.source.local.room.MovieDao
import com.sopian.challenge7.data.source.local.room.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(context: Context): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "Challenge5.db"
    ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideMovieDao(database: AppDatabase): MovieDao = database.movieDao()

    @Provides
    fun provideUserDao(database: AppDatabase): UserDao = database.userDao()
}