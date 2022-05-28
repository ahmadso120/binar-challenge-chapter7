package com.sopian.challenge7.domain.usecase.register

import com.sopian.challenge7.data.UserRepository
import com.sopian.challenge7.data.source.local.entity.UserEntity
import javax.inject.Inject

class RegisterUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(userEntity: UserEntity) {
        return userRepository.insertUser(userEntity)
    }
}