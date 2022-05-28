package com.sopian.challenge7.domain.usecase.favorite

import com.sopian.challenge7.data.MovieRepository
import com.sopian.challenge7.domain.model.Movie
import javax.inject.Inject

class SetFavoriteMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {
    operator fun invoke(movie: Movie, newStatus: Boolean) {
        return movieRepository.setFavoriteMovie(movie, newStatus)
    }
}