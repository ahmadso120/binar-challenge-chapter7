package com.sopian.challenge7.domain.usecase.profile

import androidx.lifecycle.LiveData
import com.sopian.challenge7.data.UserRepository
import com.sopian.challenge7.data.source.local.entity.UserEntity
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(email: String): LiveData<UserEntity?> {
        return userRepository.getUser(email)
    }
}