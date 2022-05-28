package com.sopian.challenge7.domain.usecase.login

import com.sopian.challenge7.data.UserRepository
import com.sopian.challenge7.data.source.local.entity.UserEntity
import javax.inject.Inject

class SetIsAuthorizedUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(userEntity: UserEntity, isAuthorizedState: Boolean) {
        return userRepository.setIsAuthorized(userEntity, isAuthorizedState)
    }
}