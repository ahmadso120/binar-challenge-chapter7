package com.sopian.challenge7.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.sopian.challenge7.data.source.local.entity.UserEntity
import com.sopian.challenge7.domain.usecase.profile.DeleteAllMovieUseCase
import com.sopian.challenge7.domain.usecase.profile.DeleteAllUserUseCase
import com.sopian.challenge7.domain.usecase.profile.GetUserUseCase
import com.sopian.challenge7.domain.usecase.profile.UpdateUserUseCase
import com.sopian.challenge7.storage.PreferencesManager
import kotlinx.coroutines.launch

class ProfileViewModel(
    val getUserUseCase: GetUserUseCase,
    val updateUserUseCase: UpdateUserUseCase,
    val deleteAllUserUseCase: DeleteAllUserUseCase,
    val deleteAllMovieUseCase: DeleteAllMovieUseCase,
    private val preferencesManager: PreferencesManager
) : ViewModel() {

    fun getUserEmail(): LiveData<String> {
        return preferencesManager.getUserEmail().asLiveData()
    }

    fun getUser(email:String) = getUserUseCase(email)

    fun updateUser(userEntity: UserEntity) {
        viewModelScope.launch {
            updateUserUseCase(userEntity)
        }
    }

    fun deleteAllMovie() {
        viewModelScope.launch {
            deleteAllMovieUseCase()
        }
    }

    fun deleteAllUser() {
        viewModelScope.launch {
            deleteAllUserUseCase()
        }
    }

    fun clearUserLoggedIn() = viewModelScope.launch {
        preferencesManager.clearUserLoggedIn()
    }
}