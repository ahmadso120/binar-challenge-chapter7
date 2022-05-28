package com.sopian.challenge7.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopian.challenge7.data.source.local.entity.UserEntity
import com.sopian.challenge7.domain.usecase.login.LoginUseCase
import com.sopian.challenge7.domain.usecase.login.SetIsAuthorizedUseCase
import com.sopian.challenge7.storage.PreferencesManager
import com.sopian.challenge7.storage.PreferencesManager.UserLoggedIn
import kotlinx.coroutines.launch

class LoginViewModel(
    val loginUseCase: LoginUseCase,
    val setIsAuthorizedUseCase: SetIsAuthorizedUseCase,
    private val preferencesManager: PreferencesManager
) : ViewModel() {

    fun doLogin(email: String, password: String) = loginUseCase(email, password)

    fun setIsAuthorized(userEntity: UserEntity, isAuthorizedState: Boolean) {
        viewModelScope.launch {
            setIsAuthorizedUseCase(userEntity, isAuthorizedState)
        }
    }

    fun setUserLoggedIn(userLoggedIn: UserLoggedIn) = viewModelScope.launch {
        preferencesManager.setUserLoggedIn(userLoggedIn)
    }


}