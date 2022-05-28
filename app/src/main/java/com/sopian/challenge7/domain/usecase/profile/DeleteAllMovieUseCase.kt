package com.sopian.challenge7.domain.usecase.profile

import com.sopian.challenge7.data.MovieRepository
import javax.inject.Inject

class DeleteAllMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {
    suspend operator fun invoke() {
        return movieRepository.deleteAllMovie()
    }
}