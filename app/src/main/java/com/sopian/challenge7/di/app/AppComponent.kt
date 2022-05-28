package com.sopian.challenge7.di.app

import com.sopian.challenge7.di.core.CoreComponent
import com.sopian.challenge7.ui.MainActivity
import com.sopian.challenge7.ui.detail.MovieDetailFragment
import com.sopian.challenge7.ui.favorite.FavoriteFragment
import com.sopian.challenge7.ui.home.HomeFragment
import com.sopian.challenge7.ui.login.LoginFragment
import com.sopian.challenge7.ui.profile.UpdateProfileFragment
import com.sopian.challenge7.ui.register.RegisterFragment
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: HomeFragment)
    fun inject(fragment: FavoriteFragment)
    fun inject(fragment: MovieDetailFragment)
    fun inject(fragment: LoginFragment)
    fun inject(fragment: UpdateProfileFragment)
    fun inject(fragment: RegisterFragment)
    fun inject(activity: MainActivity)
}