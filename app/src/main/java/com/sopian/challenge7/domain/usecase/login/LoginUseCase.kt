package com.sopian.challenge7.domain.usecase.login

import androidx.lifecycle.LiveData
import com.sopian.challenge7.data.UserRepository
import com.sopian.challenge7.data.source.local.entity.UserEntity
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(email: String, password: String): LiveData<UserEntity?> {
        return userRepository.login(email, password)
    }
}