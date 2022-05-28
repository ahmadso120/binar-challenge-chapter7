package com.sopian.challenge7.di.core

import com.sopian.challenge7.data.MovieRepository
import com.sopian.challenge7.data.MovieRepositoryImpl
import com.sopian.challenge7.data.UserRepository
import com.sopian.challenge7.data.UserRepositoryImpl
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideMovieRepository(movieRepositoryImpl: MovieRepositoryImpl): MovieRepository

    @Binds
    abstract fun provideUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

}